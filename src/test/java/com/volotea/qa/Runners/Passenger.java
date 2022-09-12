package com.volotea.qa.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Passenger.feature"
        , glue = "com.volotea.qa.StepDefinitions"
        , tags =""
        , snippets = SnippetType.CAMELCASE)


public class Passenger {


}
