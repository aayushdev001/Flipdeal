package com.ecommerce.Flipdeal.Converter;

import com.ecommerce.Flipdeal.Model.Item;
import com.ecommerce.Flipdeal.ResponseDTO.ItemViewResponseDTO;

public class ItemToItemViewResponseDTOConverter
{
    public static ItemViewResponseDTO itemToItemViewResponseDTO(Item item)
    {
        return ItemViewResponseDTO.builder()
                .productName(item.getProduct().getName())
                .price(item.getProduct().getPrice())
                .productStatus(item.getProduct().getProductStatus())
                .build();
    }
}
