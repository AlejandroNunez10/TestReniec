package com.example.web_automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateToReniec implements Task {
    private String url;

    public NavigateToReniec(String url) {
        this.url = url;
    }

    public static NavigateToReniec url(String url) {
        return new NavigateToReniec(url);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }
}
