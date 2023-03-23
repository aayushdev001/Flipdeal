package com.ecommerce.Flipdeal.Repository;

import com.ecommerce.Flipdeal.Model.Ordered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderedRepository extends JpaRepository<Ordered, Integer>
{
}
