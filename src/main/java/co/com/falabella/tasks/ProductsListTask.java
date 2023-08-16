package co.com.falabella.tasks;

import co.com.falabella.interactions.ClickRandomProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProductsListTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickRandomProduct.clickRandom()
        );
    }
    public static ProductsListTask on(){return instrumented(ProductsListTask.class);}
}
