package co.com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {

    public static Target TXT_SEARCH = Target.the("Input Search")
            .locatedBy("//input[@id='testId-SearchBar-Input']");

    public static Target SHADOW_HOST = Target.the("Div who contains shadow tree")
            .locatedBy("//div[@class='airship-html-prompt-shadow']");

    public static Target BTN_SHADOW_DENY = Target.the("Button to deny")
            .locatedBy("button.airship-btn.airship-btn-deny");

    public static Target COOKIE_HOST = Target.the("Cookie's host")
            .locatedBy("//footer[@class='Footer-module_footerContainer__FyULU Footer-module_rebranding__32k0H Footer-module_has-legal-banner__1_wrC']");

    //button#testId-accept-cookies-btn
    public static Target BTN_COOKIE_ACCEPT = Target.the("Button to accept the cookies")
            .locatedBy("//button[@id='testId-accept-cookies-btn']");
}
