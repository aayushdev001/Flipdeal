package com.ecommerce.Flipdeal.Converter;

import com.ecommerce.Flipdeal.Model.Customer;
import com.ecommerce.Flipdeal.RequestDTO.CustomerRequestDTO;

public class CustomerConverter
{
    public static Customer customerDTOToCuster(CustomerRequestDTO customerRequestDTO)
    {
        return Customer.builder()
                .age(customerRequestDTO.getAge())
                .email(customerRequestDTO.getEmail())
                .name(customerRequestDTO.getName())
                .mobNo(customerRequestDTO.getMobNo())
                .build();
    }
}
