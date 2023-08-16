package co.com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartUI {

    public static Target TITLE_CART = Target.the("Product's title on the cart")
            .locatedBy("//a[@class='chakra-link css-qpfo7l']");
    public static Target QTY_CART = Target.the("Product's quantity on the cart")
            .locatedBy("//input[@class='chakra-input css-1k2vvg6']");
}
