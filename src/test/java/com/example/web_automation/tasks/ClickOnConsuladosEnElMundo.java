package com.example.web_automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ClickOnConsuladosEnElMundo implements Task {
    public static final Target CONSULADOS_EN_EL_MUNDO = Target.the("CONSULADOS EN EL MUNDO")
            .located(By.xpath("//a[contains(text(), 'CONSULADOS EN EL MUNDO')]"));
    public static ClickOnConsuladosEnElMundo option() {
        return new ClickOnConsuladosEnElMundo();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CONSULADOS_EN_EL_MUNDO));
    }
}
