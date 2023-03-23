package com.ecommerce.Flipdeal.Converter;

import com.ecommerce.Flipdeal.Model.Seller;
import com.ecommerce.Flipdeal.RequestDTO.SellerRequestDTO;

public class SellerConverter
{
    public static Seller SellerDTOToSeller(SellerRequestDTO sellerRequestDTO)
    {
         return Seller.builder()
                 .name(sellerRequestDTO.getName())
                 .email(sellerRequestDTO.getEmail())
                 .panNo(sellerRequestDTO.getPanNo())
                 .build();
    }
}
