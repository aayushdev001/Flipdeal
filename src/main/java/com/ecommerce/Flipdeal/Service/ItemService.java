package com.ecommerce.Flipdeal.Service;

import com.ecommerce.Flipdeal.Converter.ItemToItemViewResponseDTOConverter;
import com.ecommerce.Flipdeal.Exception.ProductNotFoundException;
import com.ecommerce.Flipdeal.Model.Item;
import com.ecommerce.Flipdeal.Model.Product;
import com.ecommerce.Flipdeal.Repository.ItemRepository;
import com.ecommerce.Flipdeal.Repository.ProductRepository;
import com.ecommerce.Flipdeal.ResponseDTO.ItemViewResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService
{
    @Autowired
    ItemRepository itemRepository;
    @Autowired
    ProductRepository productRepository;

    public ItemViewResponseDTO viewItem(int productId) throws ProductNotFoundException
    {
        Product product;
        try
        {
            product = productRepository.findById(productId).get();
        }
        catch (Exception e)
        {
            throw new ProductNotFoundException("Sorry! Product not found");
        }
        Item item = new Item();
        item.setProduct(product);
        product.setItem(item);

        productRepository.save(product);

        return ItemToItemViewResponseDTOConverter.itemToItemViewResponseDTO(item);
    }
}
