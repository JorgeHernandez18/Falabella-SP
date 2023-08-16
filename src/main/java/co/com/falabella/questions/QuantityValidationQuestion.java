package co.com.falabella.questions;

import co.com.falabella.interactions.SelectQty;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.falabella.ui.CartUI.QTY_CART;

public class QuantityValidationQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return SelectQty.getQty() == Integer.parseInt(QTY_CART.resolveFor(actor).getValue());
    }
    public static Question<Boolean> from(){
        return new QuantityValidationQuestion();
    }
}
