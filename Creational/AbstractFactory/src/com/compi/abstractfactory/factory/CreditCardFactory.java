package com.compi.abstractfactory.factory;

import com.compi.abstractfactory.creditcards.CardType;
import com.compi.abstractfactory.creditcards.CreditCard;
import com.compi.abstractfactory.validators.Validator;

//Abstract Factory
public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if(creditScore > 650) {
            return new AmexFactory();
        }
        else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
