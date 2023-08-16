package co.com.falabella.tasks;

import co.com.falabella.interactions.GoToCart;
import co.com.falabella.interactions.SelectQty;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConfirmCartTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectQty.qty(),
                GoToCart.goCart()
        );
    }
    public static ConfirmCartTask on(){return instrumented(ConfirmCartTask.class);}
}
