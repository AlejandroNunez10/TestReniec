package com.example.web_automation.steps;

import com.example.web_automation.tasks.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class NavigateToReniecSteps {
    @Given("el usuario navega a la página de RENIEC")
    public void elUsuarioNavegaALaPaginaDeRENIEC() {
        theActorCalled("User").attemptsTo(NavigateToReniec.url("https://www.reniec.gob.pe/portal/masServiciosLinea.htm"));
    }

    @When("el usuario hace click en Peruanos en el Extranjero")
    public void elUsuarioHaceClickEnPeruanosEnElExtranjero() {
        theActorInTheSpotlight().attemptsTo(ClickOnPeruanosEnElExtranjero.option());
    }

    @When("el usuario hace click en Consulados en el Mundo")
    public void elUsuarioHaceClickEnConsuladosEnElMundo() {
        theActorInTheSpotlight().attemptsTo(ClickOnConsuladosEnElMundo.option());
    }

    @When("el usuario hace click en Lista de Consulados en el Mundo")
    public void elUsuarioHaceClickEnListaDeConsuladosEnElMundo() {
        theActorInTheSpotlight().attemptsTo(ClickOnListaDeConsuladosEnElMundo.option());
        theActorInTheSpotlight().attemptsTo(ChangeToNewTab.toNewTab());
    }

    @When("el usuario ingresa {string} en el campo de búsqueda")
    public void elUsuarioIngresaEnElCampoDeBusqueda(String texto) {
        theActorInTheSpotlight().attemptsTo(EnterTextInTextbox.withText(texto));
    }

    @When("el usuario hace click en el botón de búsqueda")
    public void elUsuarioHaceClickEnElBotonDeBusqueda() {
        theActorInTheSpotlight().attemptsTo(ClickOnButton.option());
    }

    @Then("el usuario debería ver los resultados de búsqueda")
    public void elUsuarioDeberiaVerLosResultadosDeBusqueda() {
    }
}
