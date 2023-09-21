package co.com.is.serenity.demo.retoCatalina.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;


import static co.com.is.serenity.demo.retoCatalina.userinterface.NewProductUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class SearchProductTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Click.on(BTN_NORTHWIND),
                //Click.on(BTN_PRODUCTS),

                WaitUntil.the(LIST_FILTER_DISCONTINUED, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(LIST_FILTER_DISCONTINUED),
                WaitUntil.the(INP_FILTER_DISCONTINUED, isClickable()).forNoMoreThan(10).seconds(),
                Enter.keyValues("yes").into(INP_FILTER_DISCONTINUED),
                Enter.keyValues(Keys.ENTER).into(INP_FILTER_DISCONTINUED),

                Click.on(LIST_FILTER_SUPPLIER),
                WaitUntil.the(INP_FILTER_SUPPLIER, isClickable()).forNoMoreThan(10).seconds(),
                Enter.keyValues("Bigfoot Breweries").into(INP_FILTER_SUPPLIER),
                Enter.keyValues(Keys.ENTER).into(INP_FILTER_SUPPLIER),

                WaitUntil.the(LIST_FILTER_CATEGORY, isVisible()).forNoMoreThan(10).seconds(),
                Enter.keyValues("Beverages").into(LIST_FILTER_CATEGORY),
                Enter.keyValues(Keys.ENTER).into(LIST_FILTER_CATEGORY)

        );
    }

    public static SearchProductTask on(){
        return Tasks.instrumented(SearchProductTask.class);
    }
}
