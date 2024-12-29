package com.developer.cards.dto;

import lombok.Data;

@Data
public class CardsDto {
    private String mobileNumber;
    private String cardNumber;
    private String cardType;
    private int cardLimit;
    private int amountUsed;
    private int cardBalance;
}
