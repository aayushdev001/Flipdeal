package com.ecommerce.Flipdeal.Controller;

import com.ecommerce.Flipdeal.Exception.ProductNotFoundException;
import com.ecommerce.Flipdeal.ResponseDTO.ItemViewResponseDTO;
import com.ecommerce.Flipdeal.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/item")
@RestController
public class ItemController
{
    @Autowired
    ItemService itemService;

    @GetMapping("/view/{productId}")
    public ItemViewResponseDTO viewItem(@PathVariable int productId) throws ProductNotFoundException
    {
        return itemService.viewItem(productId);
    }
}
