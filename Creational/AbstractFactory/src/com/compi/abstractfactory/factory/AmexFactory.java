package com.compi.abstractfactory.factory;

import com.compi.abstractfactory.creditcards.CardType;
import com.compi.abstractfactory.creditcards.CreditCard;
import com.compi.abstractfactory.creditcards.AmexGoldCreditCard;
import com.compi.abstractfactory.creditcards.AmexPlatinumCreditCard;
import com.compi.abstractfactory.validators.AmexGoldValidator;
import com.compi.abstractfactory.validators.AmexPlatinumValidator;
import com.compi.abstractfactory.validators.Validator;

public class AmexFactory extends CreditCardFactory {


    @Override
    public CreditCard getCreditCard(CardType cardType) {

        switch (cardType) {
            case GOLD:
                return new AmexGoldCreditCard();

            case PLATINUM:
                return new AmexPlatinumCreditCard();
        }
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new AmexGoldValidator();

            case PLATINUM:
                return new AmexPlatinumValidator();
        }
        return null;
    }
}
