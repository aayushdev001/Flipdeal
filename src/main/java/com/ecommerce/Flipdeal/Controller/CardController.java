package com.ecommerce.Flipdeal.Controller;

import com.ecommerce.Flipdeal.RequestDTO.CardRemoveRequestDTO;
import com.ecommerce.Flipdeal.RequestDTO.CardRequestDTO;
import com.ecommerce.Flipdeal.ResponseDTO.CardRemoveResponseDTO;
import com.ecommerce.Flipdeal.ResponseDTO.CardResponseDTO;
import com.ecommerce.Flipdeal.Service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/card")
public class CardController
{
    @Autowired
    CardService cardService;

    @PostMapping("/add")
    public CardResponseDTO addCard(@RequestBody CardRequestDTO cardRequestDTO)
    {
        return cardService.addCard(cardRequestDTO);
    }

    @DeleteMapping("/delete")
    public CardRemoveResponseDTO deleteCard(@RequestBody CardRemoveRequestDTO cardRemoveRequestDTO)
    {
        return cardService.deleteCard(cardRemoveRequestDTO);
    }
}
