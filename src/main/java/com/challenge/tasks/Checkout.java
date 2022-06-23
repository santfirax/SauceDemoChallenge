package com.challenge.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Checkout {
    private Checkout() {
    }

    public static Task items() {
        return Tasks.instrumented(CheckoutItems.class);
    }

    public static Task overview() {
        return Tasks.instrumented(CheckoutOverview.class);
    }
}
