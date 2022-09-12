package com.volotea.qa.StepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.FindFlight;
import userinterface.HomePage;

import static userinterface.HomePage.INPUT_ORIGIN;


public class SelectNewFlightDefinitions {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("volotea");
    private HomePage homePage = new HomePage();

    @Given("^enter to volotea flights$")
    public void enterToVoloteaPassengers() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
    }

    @And("^accept cookies and select the button origin$")
    public void acceptCookiesAndSelectTheButtonOrigin() {
       // OnStage.theActorInTheSpotlight().attemptsTo(AcceptCookies.acceptCookies());
    }

    @When("^find a new origin (.*) (.*)$")
    public void findANewOrigin(String origin, String destiny ) {
        actor.attemptsTo(Click.on(INPUT_ORIGIN));
        actor.wasAbleTo
                (FindFlight.conOrigin("String origin", "String destiny" ));
    }
    @Then("^verify the minimun passengers$")
    public void verifyTheMinimunPassengers() {

    }

}


