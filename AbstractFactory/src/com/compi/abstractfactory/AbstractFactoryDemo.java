package com.compi.abstractfactory;

import com.compi.abstractfactory.creditcards.CardType;
import com.compi.abstractfactory.creditcards.CreditCard;
import com.compi.abstractfactory.factory.CreditCardFactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(550);

        CreditCard card = abstractFactory.getCreditCard(CardType.GOLD);
        System.out.println(card.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(780);

        CreditCard card1 = abstractFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(card1.getClass());

    }
}
