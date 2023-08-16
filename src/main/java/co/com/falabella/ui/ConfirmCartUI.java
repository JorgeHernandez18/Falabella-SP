package co.com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmCartUI {

    public static Target TXT_QTY = Target.the("Input to select quantity")
            .locatedBy("//input[@id='testId-stepper-input']");
    public static Target BTN_GO_CART = Target.the("Button to go cart")
            .locatedBy("//a[@id='linkButton']");
}
