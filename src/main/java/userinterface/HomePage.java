package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.volotea.com/en/")
public class HomePage extends PageObject {




    public static final Target ENTER_COOKIES = Target
            .the("push the passenger button by cookies")
            .located(By.id("onetrust-accept-btn-handler"));


    //public static final Target ENTER_PASSAGE = Target
            //.the("push the passenger button")
           // .located(By.xpath("(//input[@id='input-text_sf-passenger'])[1]"));

    public static final Target INPUT_ORIGIN =Target
            .the("where the search is done")
            .located(By.id("input-text_sf-origin"));

    public static final Target SELECT_DESTINY =Target
            .the("select the destiny")
            .located(By.xpath("//input[@id='destination']"));



    public static final Target BUTTON_FIND =Target
            .the("button find flight")
            .located(By.className("v7-btn__text v7-btn__text--icon ng-star-inserted"));
}
