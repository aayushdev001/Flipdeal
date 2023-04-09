package com.ecommerce.Flipdeal.Controller;

import com.ecommerce.Flipdeal.Exception.CustomerNotFoundException;
import com.ecommerce.Flipdeal.Exception.ProductNotFoundException;
import com.ecommerce.Flipdeal.RequestDTO.OrderRequestDTO;
import com.ecommerce.Flipdeal.ResponseDTO.OrderResponseDTO;
import com.ecommerce.Flipdeal.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/order")
@RestController
public class OrderController
{
    @Autowired
    OrderService orderService;

    @PostMapping("/place")
    public OrderResponseDTO order(@RequestBody OrderRequestDTO orderRequestDTO) throws CustomerNotFoundException, ProductNotFoundException
    {
        return orderService.order(orderRequestDTO);
    }
}
