package com.example.web_automation.abilities.features;

import com.example.web_automation.tasks.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WebAutomationTest {
    @BeforeClass
    public static void setUp() {
        OnStage.setTheStage(new OnlineCast());
        WebAutomationActor.setup();
    }

    @AfterClass
    public static void tearDown() {
        WebAutomationActor.teardown();
    }

    @Test
    public void userShouldBeAbleToNavigateToReniec() {
        navigateToReniec();
        clickOnPeruanosEnElExtranjero();
        clickOnConsuladosEnElMundo();
        clickOnListaDeConsuladosEnElMundo();
        switchToNewTab();
        performActionsInNewTab();
        switchBackToOriginalTab();
    }
        private void navigateToReniec() {
            WebAutomationActor.user.attemptsTo(
                    NavigateToReniec.url("https://www.reniec.gob.pe/portal/masServiciosLinea.htm")
            );
        }
        private void clickOnPeruanosEnElExtranjero() {
            WebAutomationActor.user.attemptsTo(
                    ClickOnPeruanosEnElExtranjero.option()
            );
        }
        private void clickOnConsuladosEnElMundo() {
            WebAutomationActor.user.attemptsTo(
                    ClickOnConsuladosEnElMundo.option()
            );
        }
        private void clickOnListaDeConsuladosEnElMundo() {
        WebAutomationActor.user.attemptsTo(
                ClickOnListaDeConsuladosEnElMundo.option()
        );
    }
        private void switchToNewTab() {
            WebDriver driver = BrowseTheWeb.as(WebAutomationActor.user).getDriver();
            String originalWindow = driver.getWindowHandle();

            for (String windowHandle : driver.getWindowHandles()) {
                if (!windowHandle.equals(originalWindow)) {
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }
        }
        private void performActionsInNewTab() {
            WebAutomationActor.user.attemptsTo(
                    EnterTextInTextbox.withText("Cuenca"),
                    ClickOnButton.option()
            );
        }
        private void switchBackToOriginalTab() {
            WebDriver driver = BrowseTheWeb.as(WebAutomationActor.user).getDriver();
            String originalWindow = driver.getWindowHandle();
            driver.switchTo().window(originalWindow);
        }
    }
