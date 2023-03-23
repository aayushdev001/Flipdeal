package com.ecommerce.Flipdeal.Converter;

import com.ecommerce.Flipdeal.Model.Card;
import com.ecommerce.Flipdeal.Model.Customer;
import com.ecommerce.Flipdeal.RequestDTO.CardRequestDTO;
import com.ecommerce.Flipdeal.ResponseDTO.CardDTO;
import com.ecommerce.Flipdeal.ResponseDTO.CardResponseDTO;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


public class CardConverter
{
    public static Card cardrequestDTOToCard(CardRequestDTO cardRequestDTO)
    {
        return Card.builder()
                .cardNo(cardRequestDTO.getCardNo())
                .cvv(cardRequestDTO.getCvv())
                .cardType(cardRequestDTO.getCardType())
                .build();
    }
    public static CardResponseDTO cardToCardResponseDTO(Card card, Customer customer)
    {
        List<CardDTO> list = new ArrayList<>();
        for(Card c : customer.getCardList())
        {
            list.add(new CardDTO(c.getCardNo(), c.getCardType()));
        }
        return CardResponseDTO.builder()
                .name(customer.getName())
                .cardDTOList(list)
                .build();
    }
}
