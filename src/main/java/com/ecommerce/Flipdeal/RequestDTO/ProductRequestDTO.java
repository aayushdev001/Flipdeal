package com.ecommerce.Flipdeal.RequestDTO;

import com.ecommerce.Flipdeal.Enum.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductRequestDTO
{
    int sellerId;
    String productName;
    int price;
    int quantity;
    Category category;
}
