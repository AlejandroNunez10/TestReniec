package com.example.web_automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ClickOnButton implements Task {
    public static final Target BUTTON = Target.the("Button")
            .located(By.cssSelector("a[title='Realiza búsquedas']"));

    public static ClickOnButton option() {
        return new ClickOnButton();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON));
    }
}
