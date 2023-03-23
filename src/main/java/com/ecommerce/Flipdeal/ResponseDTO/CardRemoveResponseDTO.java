package com.ecommerce.Flipdeal.ResponseDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CardRemoveResponseDTO
{
    String cardNo;
    int cvv;
}
