package co.com.falabella.questions;

import co.com.falabella.interactions.SelectQty;
import co.com.falabella.utils.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.falabella.ui.CartUI.QTY_CART;
import static co.com.falabella.ui.CartUI.TITLE_CART;

public class ProductValidationQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Data.extractTo().get(0).get("Validation").equals(TITLE_CART.resolveFor(actor).getText().toString())
                && SelectQty.getQty() == Integer.parseInt(QTY_CART.resolveFor(actor).getValue());
    }
    public static Question<Boolean> from(){
        return new ProductValidationQuestion();
    }
}
