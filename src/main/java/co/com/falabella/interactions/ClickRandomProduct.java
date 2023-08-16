package co.com.falabella.interactions;

import co.com.falabella.utils.EscrituraExcel;
import co.com.falabella.utils.Random;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.HoverOverTarget;

import java.util.List;

import static co.com.falabella.ui.ProductsListUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickRandomProduct implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        int indexRandom;
        List<WebElementFacade> buttons = BTN_ADD_CART.resolveAllFor(actor);
        if(LBL_PRODUCT_NAME.resolveFor(actor).isVisible()){
            List<WebElementFacade> titles = LBL_PRODUCT_NAME.resolveAllFor(actor);
            indexRandom = Random.getRandom(titles.size());
            EscrituraExcel.escrituraExcel(
                    "src/test/resources/Data/Data.xlsx",
                    titles.get(indexRandom).getText(),1,1);
            actor.remember("title", titles.get(indexRandom).getText());
        } else {
            List<WebElementFacade> titles = LBL_ALTERNAL_PRODUCT_NAME.resolveAllFor(actor);
            indexRandom = Random.getRandom(titles.size());;
            EscrituraExcel.escrituraExcel(
                    "src/test/resources/Data/Data.xlsx",
                    titles.get(indexRandom).getText(),1,1);
            actor.remember("title", titles.get(indexRandom).getText());
            actor.attemptsTo(
                    HoverOverTarget.over(titles.get(indexRandom))
            );
        }
        buttons.get(indexRandom).click();
    }
    public static Performable clickRandom(){return instrumented(ClickRandomProduct.class);}
}
