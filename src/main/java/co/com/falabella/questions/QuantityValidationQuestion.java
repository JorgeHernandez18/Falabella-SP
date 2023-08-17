package co.com.falabella.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.falabella.ui.CartUI.QTY_CART;

public class QuantityValidationQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Integer.parseInt(actor.recall("qty").toString()) == Integer.parseInt(QTY_CART.resolveFor(actor).getValue());
    }
    public static Question<Boolean> from(){
        return new QuantityValidationQuestion();
    }
}
