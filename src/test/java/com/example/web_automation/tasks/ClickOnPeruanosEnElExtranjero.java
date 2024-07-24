package com.example.web_automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ClickOnPeruanosEnElExtranjero implements Task {
    public static final Target PERUANOS_EN_EL_EXTRANJERO = Target.the("Peruanos en el Extranjero")
            .located(By.xpath("//a[contains(text(), 'Peruanos en el Extranjero')]"));
    public static ClickOnPeruanosEnElExtranjero option() {
        return new ClickOnPeruanosEnElExtranjero();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PERUANOS_EN_EL_EXTRANJERO));
    }
}
