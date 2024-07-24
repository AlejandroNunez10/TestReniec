package com.example.web_automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EnterTextInTextbox implements Task {
    private String text;
    public static final Target TEXTBOX = Target.the("Textbox")
            .located(By.id("txtSearch"));

    public EnterTextInTextbox(String text) {
        this.text = text;
    }

    public static EnterTextInTextbox withText(String text) {
        return new EnterTextInTextbox(text);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(text).into(TEXTBOX));
    }
}
