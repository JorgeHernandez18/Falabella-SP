package co.com.falabella.tasks;

import co.com.falabella.interactions.Cookies;
import co.com.falabella.interactions.Search;
import co.com.falabella.interactions.ShadowElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HomeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ShadowElement.shadowClick(),
                Cookies.getCoockies(),
                Search.search()
        );
    }
    public static HomeTask on(){return instrumented(HomeTask.class);}
}
