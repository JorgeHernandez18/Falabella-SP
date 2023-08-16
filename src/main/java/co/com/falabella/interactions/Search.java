package co.com.falabella.interactions;

import co.com.falabella.utils.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.falabella.ui.HomeUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Search implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(Data.extractTo().get(0).get("Search")).into(TXT_SEARCH).thenHit(Keys.ENTER)
        );
    }

    public static Performable search(){
        return instrumented(Search.class);
    }
}
