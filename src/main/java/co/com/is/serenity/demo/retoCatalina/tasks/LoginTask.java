package co.com.is.serenity.demo.retoCatalina.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.is.serenity.demo.retoCatalina.userinterface.LoginUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_INICIO_SESION),
                WaitUntil.the(BTN_NORTHWIND, isVisible()).forNoMoreThan(10).seconds()
        );
    }

    public static LoginTask on(){
        return Tasks.instrumented(LoginTask.class);
    }
}
