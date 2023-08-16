package co.com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductsListUI {

    public static Target LBL_PRODUCT_NAME = Target.the("Product name")
            .locatedBy("//b[@class='jsx-1576191951 title2 primary  jsx-2889528833 bold       pod-subTitle subTitle-rebrand']");

    //Mismo boton para diferentes elementos
    public static Target BTN_ADD_CART = Target.the("Button to add product to cart")
            .locatedBy("//button[@class='jsx-2166277967 button button-mkp-primary-medium']");

    public static Target LBL_ALTERNAL_PRODUCT_NAME = Target.the("Alternal product name")
            .locatedBy("//b[@class='jsx-1833870204 copy2 primary  jsx-2889528833 normal       pod-subTitle subTitle-rebrand']");
}
