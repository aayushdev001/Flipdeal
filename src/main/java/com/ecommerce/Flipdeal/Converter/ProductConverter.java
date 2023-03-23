package com.ecommerce.Flipdeal.Converter;

import com.ecommerce.Flipdeal.Enum.ProductStatus;
import com.ecommerce.Flipdeal.Model.Product;
import com.ecommerce.Flipdeal.RequestDTO.ProductRequestDTO;
import com.ecommerce.Flipdeal.ResponseDTO.ProductResponseDTO;

public class ProductConverter
{
    public static Product productDTOToProduct(ProductRequestDTO productRequestDTO)
    {
        return Product.builder()
                .category(productRequestDTO.getCategory())
                .name(productRequestDTO.getProductName())
                .price(productRequestDTO.getPrice())
                .quantity(productRequestDTO.getQuantity())
                .productStatus(ProductStatus.AVAILABLE)
                .build();
    }
    public static ProductResponseDTO productToProductReposnseDTO(Product product)
    {
        return ProductResponseDTO.builder()
                .productStatus(product.getProductStatus())
                .quantity(product.getQuantity())
                .name(product.getName())
                .build();
    }
}
