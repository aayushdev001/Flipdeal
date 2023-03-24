package com.ecommerce.Flipdeal.ResponseDTO;

import com.ecommerce.Flipdeal.Enum.ProductStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemViewResponseDTO
{
    String productName;
    int price;
    ProductStatus productStatus;
}
