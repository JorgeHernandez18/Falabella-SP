package co.com.falabella.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import static co.com.falabella.ui.HomeUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Coockies implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        COOCKIE_HOST.resolveFor(actor).findBy(BTN_COOCKIE_ACCEPT.getCssOrXPathSelector()).click();
    }
    public static Performable getCoockies(){return instrumented(Coockies.class);}
}
