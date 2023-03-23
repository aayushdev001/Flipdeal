package com.ecommerce.Flipdeal.ResponseDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class CardResponseDTO
{
    String name;
    List<CardDTO> cardDTOList;
}
