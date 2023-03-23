package com.ecommerce.Flipdeal.ResponseDTO;

import com.ecommerce.Flipdeal.Enum.CardType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardDTO
{
    String cardNo;
    CardType cardType;
}
