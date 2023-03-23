package com.ecommerce.Flipdeal.Service;

import com.ecommerce.Flipdeal.Converter.ProductConverter;
import com.ecommerce.Flipdeal.Enum.Category;
import com.ecommerce.Flipdeal.Exception.SellerNotFoundException;
import com.ecommerce.Flipdeal.Model.Product;
import com.ecommerce.Flipdeal.Model.Seller;
import com.ecommerce.Flipdeal.Repository.ProductRepository;
import com.ecommerce.Flipdeal.Repository.SellerRepository;
import com.ecommerce.Flipdeal.RequestDTO.ProductRequestDTO;
import com.ecommerce.Flipdeal.ResponseDTO.ProductResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService
{
    @Autowired
    ProductRepository productRepository;
    @Autowired
    SellerRepository sellerRepository;

    public ProductResponseDTO addProduct(ProductRequestDTO productRequestDTO) throws Exception
    {
        Product product = ProductConverter.productDTOToProduct(productRequestDTO);
        Seller seller;

        try{
            seller = sellerRepository.findById(productRequestDTO.getSellerId()).get();
        }
        catch(Exception e){
            throw new SellerNotFoundException("Invalid Seller Id");
        }
        product.setSeller(seller);
        seller.getProductList().add(product);
        sellerRepository.save(seller);

        return ProductConverter.productToProductReposnseDTO(product);
    }

    public List<ProductResponseDTO> getProductsByCategory(Category category)
    {
        List<Product> products = productRepository.findAllByCategory(category);

        List<ProductResponseDTO> list = new ArrayList<>();

        for(Product product : products)
        {
            list.add(ProductConverter.productToProductReposnseDTO(product));
        }
        return list;
    }
}
