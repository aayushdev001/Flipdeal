package com.ecommerce.Flipdeal.RequestDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class SellerRequestDTO
{
    String name;
    String email;
    String panNo;
}
