package com.challenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillInInformationPage {
    public static final Target FIRST_NAME_INPUT = Target.the("First name input").located(By.id("first-name"));
    public static final Target LAST_NAME_INPUT = Target.the("Last name input").located(By.id("last-name"));
    public static final Target ZIP_POSTAL_CODE_INPUT = Target.the("Zip postal code input").located(By.id("postal-code"));
    public static final Target CONTINUE_BUTTON = Target.the("Continue button").located(By.id("continue"));

    private FillInInformationPage() {
        throw new UnsupportedOperationException();
    }
}
