package com.challenge.tasks;

import com.challenge.userinterface.SauceProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

public class Add implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        final String titleOfFirstProduct = Text.of(SauceProductPage.FIRST_PRODUCT_ITEM).viewedBy(actor).asString();
        actor.attemptsTo(
                Click.on(SauceProductPage.ADD_BUTTON),
                Click.on(SauceProductPage.SHOPPING_CART)
        );
        actor.remember("firstProductTitle", titleOfFirstProduct);
    }

    public static Task itemToShoppingCart() {
        return Tasks.instrumented(Add.class);
    }
}
