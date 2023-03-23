package com.ecommerce.Flipdeal.Controller;

import com.ecommerce.Flipdeal.RequestDTO.CustomerRequestDTO;
import com.ecommerce.Flipdeal.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController
{
    @Autowired
    CustomerService customerService;

    @PostMapping("/add")
    public String addCustomer(@RequestBody CustomerRequestDTO customerRequestDTO)
    {
        return customerService.addCustomer(customerRequestDTO);
    }
}
