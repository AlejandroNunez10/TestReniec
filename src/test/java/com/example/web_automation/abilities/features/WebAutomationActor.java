package com.example.web_automation.abilities.features;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAutomationActor {
    public static Actor user;
    public static void setup(){
        WebDriver driver = new ChromeDriver();
        user = Actor.named("User");
        user.can(BrowseTheWeb.with(driver));
    }
    public static void teardown() {
        BrowseTheWeb.as(user).getDriver().quit();
    }
}
