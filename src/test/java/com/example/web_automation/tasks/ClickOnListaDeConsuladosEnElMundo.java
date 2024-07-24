package com.example.web_automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ClickOnListaDeConsuladosEnElMundo implements Task {
    public static final Target LISTA_DE_CONSULADOS_EN_EL_MUNDO = Target.the("Lista de Consulados en el mundo")
            .located(By.xpath("//a[contains(text(), 'Lista de Consulados en el mundo')]"));
    public static ClickOnListaDeConsuladosEnElMundo option() {
        return new ClickOnListaDeConsuladosEnElMundo();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LISTA_DE_CONSULADOS_EN_EL_MUNDO));
    }
}
