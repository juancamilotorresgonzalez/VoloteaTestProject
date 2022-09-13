package com.volotea.qa.StepDefinitions;

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


public class Passenger {



    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("volotea");
    private HomePage homePage = new HomePage();


    @Given("^enter to volotea\\.com page$")
    public void enterToVoloteaComPage() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
    }

    @When("^the user select number of passengers  (\\d+) (\\d+)$")
    public void theUserSelectNumberOfPassengers(String arg1, String arg2) {
        actor.attemptsTo(Click.on(INPUT_ORIGIN));
        actor.wasAbleTo
                (FindFlight.conOrigin("String origin", "String destiny" ));

    }

    @Then("^verify the number of passengers selected  (\\d+) (\\d+)$")
    public void verifyTheNumberOfPassengersSelected(String arg1, String arg2) {

    }


}
