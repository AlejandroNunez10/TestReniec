package com.example.web_automation.steps;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CucumberHooks {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
}
