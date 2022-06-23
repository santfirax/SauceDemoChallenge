package com.challenge.tasks;

import com.challenge.userinterface.SauceDemoHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class Log implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(SauceDemoHomePage.class),
                Enter.theValue("standard_user").into(SauceDemoHomePage.USERNAME_INPUT),
                Enter.theValue("secret_sauce").into(SauceDemoHomePage.PASSWORD_INPUT),
                Click.on(SauceDemoHomePage.LOGIN_BUTTON)
        );
    }

    public static Task in() {
        return Tasks.instrumented(Log.class);
    }
}

