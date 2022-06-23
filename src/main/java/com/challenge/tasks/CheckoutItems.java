package com.challenge.tasks;

import com.challenge.questions.ShoppingCartQuestions;
import com.challenge.userinterface.SauceProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class CheckoutItems implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        final String firstProductTitle = actor.recall("firstProductTitle");
        actor.should(
                seeThat("First product item", ShoppingCartQuestions.firstItemAdded(), equalTo(firstProductTitle))
        );
        actor.attemptsTo(
                Click.on(SauceProductPage.CHECKOUT_BUTTON)
        );
    }
}
