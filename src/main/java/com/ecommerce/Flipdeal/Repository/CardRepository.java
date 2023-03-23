package com.ecommerce.Flipdeal.Repository;

import com.ecommerce.Flipdeal.Model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Integer>
{
}
