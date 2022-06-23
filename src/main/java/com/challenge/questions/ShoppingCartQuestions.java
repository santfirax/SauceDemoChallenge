package com.challenge.questions;

import com.challenge.userinterface.CheckoutOverviewItemsPage;
import com.challenge.userinterface.ShoppingCartPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ShoppingCartQuestions {
    private ShoppingCartQuestions() {
        throw new UnsupportedOperationException();
    }

    public static Question<String> firstItemAdded() {
        return actor -> Text.of(ShoppingCartPage.FIRST_ITEM_ADDED).viewedBy(actor).asString();
    }

    public static Question<String> checkOutCompletedTitle() {
        return actor -> Text.of(CheckoutOverviewItemsPage.CHECKOUT_COMPLETED_TITLE).viewedBy(actor).asString();
    }
}
