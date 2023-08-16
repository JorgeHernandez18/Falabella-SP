package co.com.falabella.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import static co.com.falabella.ui.ConfirmCartUI.BTN_GO_CART;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToCart implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        BTN_GO_CART.resolveFor(actor).click();
    }
    public static Performable goCart(){return instrumented(GoToCart.class);}
}
