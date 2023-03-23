package com.ecommerce.Flipdeal.Service;

import com.ecommerce.Flipdeal.Converter.SellerConverter;
import com.ecommerce.Flipdeal.Model.Seller;
import com.ecommerce.Flipdeal.Repository.SellerRepository;
import com.ecommerce.Flipdeal.RequestDTO.SellerRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService
{
    @Autowired
    SellerRepository sellerRepository;

    public String addSeller(SellerRequestDTO sellerRequestDTO)
    {
        System.out.println(sellerRequestDTO.getEmail());
        Seller seller = SellerConverter.SellerDTOToSeller(sellerRequestDTO);
        sellerRepository.save(seller);
        return "Now, you can sell your products";
    }

    public Seller findByPan(String panNo)
    {
        return sellerRepository.findSellerByPanNo(panNo);
    }
}
