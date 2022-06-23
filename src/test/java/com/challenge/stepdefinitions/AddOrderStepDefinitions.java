package com.challenge.stepdefinitions;

import com.challenge.tasks.Add;
import com.challenge.tasks.Checkout;
import com.challenge.tasks.Fill;
import com.challenge.tasks.Log;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

public class AddOrderStepDefinitions {
    @Given("{actor} logs in")
    public void santiagoLogsIn(Actor actor) {
        actor.attemptsTo(
                Log.in()
        );

    }

    @When("{actor} Adds order to the cart")
    public void santiagoAddsOrderToTheCart(Actor actor) {
        actor.attemptsTo(
                Add.itemToShoppingCart()
        );
    }

    @Then("{actor} Should checkout his product")
    public void santiagoShouldSeeHisProductInTheShoppingCart(Actor actor) {
        actor.attemptsTo(
                Checkout.items()
        );
    }

    @Then("{actor} Fills in his information")
    public void santiagoFillsInHisInformation(Actor actor) {
        actor.attemptsTo(
                Fill.inTheInformation()
        );
    }

    @Then("{actor} Overview his checkout")
    public void santiagoOverviewHisCheckout(Actor actor) {
        actor.attemptsTo(
                Checkout.overview()
        );
    }
}
