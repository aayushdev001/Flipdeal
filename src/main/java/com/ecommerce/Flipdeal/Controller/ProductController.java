package com.ecommerce.Flipdeal.Controller;

import com.ecommerce.Flipdeal.Enum.Category;
import com.ecommerce.Flipdeal.RequestDTO.ProductRequestDTO;
import com.ecommerce.Flipdeal.ResponseDTO.ProductResponseDTO;
import com.ecommerce.Flipdeal.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController
{
    @Autowired
    ProductService productService;
    @PostMapping("/add-product")
    public ProductResponseDTO addProduct(@RequestBody ProductRequestDTO productRequestDTO) throws Exception
    {
        return productService.addProduct(productRequestDTO);
    }

    @GetMapping("/get/{category}")
    public List<ProductResponseDTO> getProductsByCategory(@PathVariable Category category)
    {
        return productService.getProductsByCategory(category);
    }
}
