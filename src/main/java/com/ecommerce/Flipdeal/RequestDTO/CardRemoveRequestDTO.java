package com.ecommerce.Flipdeal.RequestDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardRemoveRequestDTO
{
    int customerId;
    int cardId;
}
