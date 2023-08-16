package co.com.falabella.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import static co.com.falabella.ui.HomeUI.BTN_SHADOW_DENY;
import static co.com.falabella.ui.HomeUI.SHADOW_HOST;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
/*
* Website where i found information about shadow elements
* https://titusfortner.com/2021/11/22/shadow-dom-selenium.html
* Author: Jorge Hernández
* */
public class ShadowElement implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUntil.the(SHADOW_HOST, isCurrentlyVisible()).forNoMoreThan(20).seconds();
        WebElement shadowHost = SHADOW_HOST.resolveFor(actor);
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector(BTN_SHADOW_DENY.getCssOrXPathSelector()));
        shadowContent.click();
    }

    public static Performable shadowClick(){
        return instrumented(ShadowElement.class);
    }
}
