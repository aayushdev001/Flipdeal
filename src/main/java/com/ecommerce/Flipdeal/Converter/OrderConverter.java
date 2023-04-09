package com.ecommerce.Flipdeal.Converter;

import com.ecommerce.Flipdeal.Model.Ordered;
import com.ecommerce.Flipdeal.ResponseDTO.OrderResponseDTO;
import org.hibernate.criterion.Order;

import java.util.Date;

public class OrderConverter
{
    public static Ordered orderRequestDTOToOrder(int totalCost, int deliveryCharge, String cardUsedForPayment)
    {
        return Ordered.builder()
                .orderDate(new Date())
                .cardUsedForPayment(cardUsedForPayment)
                .deliveryCharge(deliveryCharge)
                .totalCost(totalCost)
                .build();
    }
    public static OrderResponseDTO orderToOrderResponseDTO(Ordered order)
    {
        return OrderResponseDTO.builder()
                .cardUsed(order.getCardUsedForPayment())
                .totalAmount(order.getTotalCost())
                .build();
    }
}
