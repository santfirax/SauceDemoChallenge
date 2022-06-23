package com.challenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SauceProductPage {
    public static final Target FIRST_PRODUCT_ITEM = Target.the("first item of products page").locatedBy("(//div[@class='inventory_item_name'])[1]");
    public static final Target ADD_BUTTON = Target.the("Add button of first product").located(By.id("add-to-cart-sauce-labs-backpack"));
    public static final Target SHOPPING_CART = Target.the("Shopping cart").located(By.className("shopping_cart_link"));
    public static final Target CHECKOUT_BUTTON = Target.the("Checkout button").located(By.id("checkout"));

    private SauceProductPage() {
        throw new UnsupportedOperationException();
    }
}
