package com.compi.abstractfactory.factory;

import com.compi.abstractfactory.creditcards.CardType;
import com.compi.abstractfactory.creditcards.CreditCard;
import com.compi.abstractfactory.creditcards.VisaGoldCreditCard;
import com.compi.abstractfactory.creditcards.VisaPlatinumCreditCard;
import com.compi.abstractfactory.validators.Validator;
import com.compi.abstractfactory.validators.VisaGoldValidator;
import com.compi.abstractfactory.validators.VisaPlatinumValidator;

public class VisaFactory extends CreditCardFactory {


    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case PLATINUM:
                return new VisaPlatinumCreditCard();
            case GOLD:
                return new VisaGoldCreditCard();
        }
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case PLATINUM:
                return new VisaPlatinumValidator();
            case GOLD:
                return new VisaGoldValidator();
        }
        return null;
    }
}
