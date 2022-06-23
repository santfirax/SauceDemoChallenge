package com.challenge.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src//test//resources//features//add_product_to_cart.feature",
        glue = {"com.challenge.stepdefinitions"},
        tags = "",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class AddProductTestRunner {
}