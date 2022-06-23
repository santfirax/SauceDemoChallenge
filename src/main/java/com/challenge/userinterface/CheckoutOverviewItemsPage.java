package com.challenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutOverviewItemsPage {
    public static final Target FINISH_BUTTON = Target.the("Finish button").located(By.id("finish"));
    public static final Target CHECKOUT_COMPLETED_TITLE = Target.the("Checkout completed title").locatedBy("//span[text()='Checkout: Complete!']");

    private CheckoutOverviewItemsPage() {
        throw new UnsupportedOperationException();
    }
}
