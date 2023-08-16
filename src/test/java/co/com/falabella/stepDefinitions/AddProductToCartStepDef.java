package co.com.falabella.stepDefinitions;

import co.com.falabella.questions.ProductValidationQuestion;
import co.com.falabella.tasks.ConfirmCartTask;
import co.com.falabella.tasks.HomeTask;
import co.com.falabella.tasks.ProductsListTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AddProductToCartStepDef {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Given("User open Falabella page and search any product")
    public void user_open_falabella_page_and_search_any_product() {
        theActorCalled("Jorge").wasAbleTo(
                Open.url("https://falabella.com.co/"),
                HomeTask.on()
        );
    }

    @When("user click on add to cart and change the quantity")
    public void user_click_on_add_to_cart_and_change_the_quantity() {
        theActorInTheSpotlight().attemptsTo(
                ProductsListTask.on(),
                ConfirmCartTask.on()
        );
    }

    @Then("user can read the product name and its quantity")
    public void user_can_read_the_product_name_and_its_quantity() {
        theActorInTheSpotlight().should(
                seeThat(
                        ProductValidationQuestion.from()
                )
        );
    }
}
