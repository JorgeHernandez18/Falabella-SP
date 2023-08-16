package co.com.falabella.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.falabella.ui.CartUI.TITLE_CART;

public class ProductValidationQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return actor.recall("title").toString().equals(TITLE_CART.resolveFor(actor).getText().toString());
    }
    public static Question<Boolean> from(){
        return new ProductValidationQuestion();
    }
}
