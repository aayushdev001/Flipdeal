package com.ecommerce.Flipdeal.Controller;

import com.ecommerce.Flipdeal.Model.Seller;
import com.ecommerce.Flipdeal.RequestDTO.SellerRequestDTO;
import com.ecommerce.Flipdeal.Service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/seller")
@RestController
public class SellerController
{
    @Autowired
    SellerService sellerService;

    @PostMapping("/add-seller")
    public String addSeller(@RequestBody SellerRequestDTO sellerRequestDTO)
    {
        return sellerService.addSeller(sellerRequestDTO);
    }

    @GetMapping("/find-by-pan")
    public Seller findByPan(@RequestParam String panNo)
    {
        return sellerService.findByPan(panNo);
    }
}
