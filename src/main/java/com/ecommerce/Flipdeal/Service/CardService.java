package com.ecommerce.Flipdeal.Service;

import com.ecommerce.Flipdeal.Converter.CardConverter;
import com.ecommerce.Flipdeal.Model.Card;
import com.ecommerce.Flipdeal.Model.Customer;
import com.ecommerce.Flipdeal.Repository.CardRepository;
import com.ecommerce.Flipdeal.Repository.CustomerRepository;
import com.ecommerce.Flipdeal.RequestDTO.CardRemoveRequestDTO;
import com.ecommerce.Flipdeal.RequestDTO.CardRequestDTO;
import com.ecommerce.Flipdeal.ResponseDTO.CardRemoveResponseDTO;
import com.ecommerce.Flipdeal.ResponseDTO.CardResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService
{
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    CardRepository cardRepository;

    public CardResponseDTO addCard(CardRequestDTO cardRequestDTO)
    {
        System.out.println(cardRequestDTO.getCustomerId());
        Customer customer = customerRepository.findById(cardRequestDTO.getCustomerId()).get();
        Card card = CardConverter.cardrequestDTOToCard(cardRequestDTO);
        card.setCustomer(customer);
        customer.getCardList().add(card);

        customerRepository.save(customer);

        return CardConverter.cardToCardResponseDTO(card, customer);
    }

    public CardRemoveResponseDTO deleteCard(CardRemoveRequestDTO cardRemoveRequestDTO)
    {
        Customer customer = customerRepository.findById(cardRemoveRequestDTO.getCustomerId()).get();
        Card card = cardRepository.findById(cardRemoveRequestDTO.getCardId()).get();
        customer.getCardList().remove(card);
        return new CardRemoveResponseDTO(card.getCardNo(), card.getCvv());
    }
}
