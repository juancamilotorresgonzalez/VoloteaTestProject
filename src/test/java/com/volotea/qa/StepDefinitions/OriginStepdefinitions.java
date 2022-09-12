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

public class OriginStepdefinitions {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("volotea");
    private HomePage homePage = new HomePage();

    @Given("^enter the volotea\\.com page$")
    public void enterTheVoloteaComPage() {

        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
    }

    @And("^accept all cookies, select passenger area and origin-destiny$")
    public void acceptAllCookiesSelectPassengerAreaAndOriginDestiny() {

    }


    @When("^the user select trip (.*) (.*)$")
    public void theUserSelectTrip(String origin, String destiny) {

        actor.attemptsTo(Click.on(INPUT_ORIGIN));
        actor.wasAbleTo
                (FindFlight.conOrigin("String origin", "String destiny" ));
    }

    @Then("^verify the trip selected origin ,destiny$")
    public void verifyTheTripSelectedOriginDestiny() {

    }



}



