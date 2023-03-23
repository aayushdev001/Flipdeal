package com.ecommerce.Flipdeal.Repository;

import com.ecommerce.Flipdeal.Enum.Category;
import com.ecommerce.Flipdeal.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>
{
    List<Product> findAllByCategory(Category category);
}
