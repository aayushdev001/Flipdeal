package com.ecommerce.Flipdeal.ResponseDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class OrderResponseDTO
{
    final String orderStatus = "Order Confirmed";
    int totalAmount;
    String cardUsed;
}
