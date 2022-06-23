package com.challenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class SauceDemoHomePage extends PageObject {
    public static final Target USERNAME_INPUT = Target.the("Username input").located(By.id("user-name"));
    public static final Target PASSWORD_INPUT = Target.the("Password input").located(By.id("password"));
    public static final Target LOGIN_BUTTON = Target.the("Login button").located(By.id("login-button"));

}
