package com.ecommerce.Flipdeal.RequestDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequestDTO
{
    String name;

    int age;

    String mobNo;

    String email;
}
