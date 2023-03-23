package com.ecommerce.Flipdeal.Service;

import com.ecommerce.Flipdeal.Converter.CustomerConverter;
import com.ecommerce.Flipdeal.Model.Customer;
import com.ecommerce.Flipdeal.Repository.CustomerRepository;
import com.ecommerce.Flipdeal.RequestDTO.CustomerRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService
{
    @Autowired
    CustomerRepository customerRepository;
    public String addCustomer(CustomerRequestDTO customerRequestDTO)
    {
        Customer customer = CustomerConverter.customerDTOToCuster(customerRequestDTO);
        customerRepository.save(customer);
        return "Welcome to Flipdeal! You can start shopping";
    }
}
