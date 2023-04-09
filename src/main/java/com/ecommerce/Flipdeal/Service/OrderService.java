package com.ecommerce.Flipdeal.Service;

import com.ecommerce.Flipdeal.Converter.OrderConverter;
import com.ecommerce.Flipdeal.Exception.CustomerNotFoundException;
import com.ecommerce.Flipdeal.Exception.ProductNotFoundException;
import com.ecommerce.Flipdeal.Model.*;
import com.ecommerce.Flipdeal.Repository.CardRepository;
import com.ecommerce.Flipdeal.Repository.CustomerRepository;
import com.ecommerce.Flipdeal.Repository.ProductRepository;
import com.ecommerce.Flipdeal.RequestDTO.OrderRequestDTO;
import com.ecommerce.Flipdeal.ResponseDTO.OrderResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService
{
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    CardRepository cardRepository;

    public OrderResponseDTO order(OrderRequestDTO orderRequestDTO) throws CustomerNotFoundException, ProductNotFoundException
    {
        //finding customer and product
        System.out.println(orderRequestDTO.getProductId());
        Customer customer;
        try
        {
            customer = customerRepository.findById(orderRequestDTO.getCustomerId()).get();
        }
        catch (Exception e)
        {
            throw new CustomerNotFoundException("Invalid Customer Id");
        }

        Product product;
        try
        {

            product = productRepository.findById(orderRequestDTO.getProductId()).get();
        }
        catch (Exception e)
        {
            throw new ProductNotFoundException("Invalid product Id");
        }

        //setting charges
        int totalCost = product.getPrice() * orderRequestDTO.getQuantity();
        int deliveryCharge = 0;
        if(totalCost<500)
        {
            totalCost += 40;
            deliveryCharge = 40;
        }

        //setting card String
        Card card = cardRepository.findById(orderRequestDTO.getCardId()).get();
        String cardUsedForPayment = "";
        for(int i=0; i<card.getCardNo().length()-4; i++) cardUsedForPayment += 'X';
        cardUsedForPayment += card.getCardNo().substring(card.getCardNo().length()-4);

        //setting order object
        Ordered order = OrderConverter.orderRequestDTOToOrder(totalCost, deliveryCharge, cardUsedForPayment);

        //making the child object i.e. the item object
        Item item = new Item();
        item.setRequiredQuantity(orderRequestDTO.getQuantity());

        //linking the child object with the parents
        item.setProduct(product);
        item.setOrder(order);

        //linking parent with child
        List<Item> list = new ArrayList<>();
        list.add(item);
        order.setOrderedItems(list);
//        order.getOrderedItems().add(item);
        order.setCustomer(customer);
        customer.getOrders().add(order);
        product.setQuantity(product.getQuantity()- orderRequestDTO.getQuantity());

        //saving
        customerRepository.save(customer);
//        productRepository.save(product);
        return OrderConverter.orderToOrderResponseDTO(order);
    }
}
