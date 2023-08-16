package co.com.falabella.interactions;


import co.com.falabella.utils.Random;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.falabella.ui.ConfirmCartUI.TXT_QTY;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class SelectQty implements Interaction {
    private static int qty;
    @Override
    public <T extends Actor> void performAs(T actor) {
        qty = Random.getRandom(20);
        actor.attemptsTo(
                Clear.field(TXT_QTY),
                Enter.theValue( qty+"").into(TXT_QTY).thenHit(Keys.ENTER)
        );
    }
    public static Performable qty(){return instrumented(SelectQty.class);}

    public static int getQty() {
        return qty;
    }
}
