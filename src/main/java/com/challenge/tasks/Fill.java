package com.challenge.tasks;

import com.challenge.userinterface.FillInInformationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Fill implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Jose").into(FillInInformationPage.FIRST_NAME_INPUT),
                Enter.theValue("Molano").into(FillInInformationPage.LAST_NAME_INPUT),
                Enter.theValue("05001").into(FillInInformationPage.ZIP_POSTAL_CODE_INPUT),
                Click.on(FillInInformationPage.CONTINUE_BUTTON)
        );
    }

    public static Task inTheInformation() {
        return Tasks.instrumented(Fill.class);
    }
}
