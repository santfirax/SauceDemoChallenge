package com.challenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartPage {
    public static final Target FIRST_ITEM_ADDED = Target.the("First product added").locatedBy("(//div[@class='inventory_item_name'])[1]");

    private ShoppingCartPage() {
    }
}
