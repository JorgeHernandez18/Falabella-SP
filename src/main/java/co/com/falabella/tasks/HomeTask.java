package co.com.falabella.tasks;

import co.com.falabella.interactions.Coockies;
import co.com.falabella.interactions.Search;
import co.com.falabella.interactions.ShadowElement;
import co.com.falabella.utils.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.falabella.ui.HomeUI.TXT_SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HomeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ShadowElement.shadowClick(),
                Coockies.getCoockies(),
                Search.search()
        );
    }
    public static HomeTask on(){return instrumented(HomeTask.class);}
}
