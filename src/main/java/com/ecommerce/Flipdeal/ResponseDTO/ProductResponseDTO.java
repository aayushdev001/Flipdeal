package com.ecommerce.Flipdeal.ResponseDTO;

import com.ecommerce.Flipdeal.Enum.ProductStatus;
import com.ecommerce.Flipdeal.Model.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductResponseDTO
{
    String name;
    int quantity;
    ProductStatus productStatus;
}
