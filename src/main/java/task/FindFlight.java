package task;


import models.OriginDestiny;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.Visibility;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.HomePage.*;

public class FindFlight implements Task {

    private OriginDestiny OriginDestiny;



    public FindFlight(OriginDestiny origindestiny ){
        this.OriginDestiny = OriginDestiny;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ENTER_COOKIES));
        actor.attemptsTo(Click.on(INPUT_ORIGIN));
        actor.attemptsTo(Enter.theValue(OriginDestiny.getOrigin()).into(INPUT_ORIGIN));
        actor.attemptsTo(Click.on(SELECT_DESTINY));
        actor.attemptsTo(Enter.theValue(OriginDestiny.getDestiny()).into(SELECT_DESTINY));

    }

    public static FindFlight withData(OriginDestiny OrginDestiny) {
        return new FindFlight(OriginDestiny);
    }
}
