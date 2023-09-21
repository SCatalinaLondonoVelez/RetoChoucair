package co.com.is.serenity.demo.retoCatalina.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import static co.com.is.serenity.demo.retoCatalina.userinterface.LoginUI.BTN_NORTHWIND;

public class ValidateLogin implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return BTN_NORTHWIND.resolveFor(actor).isVisible();
    }

    public static Question<Boolean> on(){
        return new ValidateLogin();
    }
}
