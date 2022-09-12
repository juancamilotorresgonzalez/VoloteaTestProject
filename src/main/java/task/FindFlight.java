package task;


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

    private String origin;
    private String destiny;


    public FindFlight(String origin, String destiny ){
        this.origin = origin;
        this.destiny = destiny;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(Visibility.of(ENTER_COOKIES).viewedBy(actor).asBoolean())
            actor.attemptsTo(Click.on(ENTER_COOKIES));
      actor.attemptsTo(
              Enter.theValue(origin).into(INPUT_ORIGIN),
              SelectFromOptions.byVisibleText(destiny).from(SELECT_DESTINY),
              Hit.the(Keys.ENTER).into(INPUT_ORIGIN),
              Click.on(BUTTON_FIND.of(origin))
      );
    }

    public static FindFlight conOrigin(String origin, String destiny) {
        return instrumented(FindFlight.class, origin, destiny);
    }
}
