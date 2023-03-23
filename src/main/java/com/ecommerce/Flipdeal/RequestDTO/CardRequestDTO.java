package com.ecommerce.Flipdeal.RequestDTO;

import com.ecommerce.Flipdeal.Enum.CardType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardRequestDTO
{
    int customerId;

    String cardNo;

    int cvv;

    CardType cardType;
}
