package co.com.is.serenity.demo.retoCatalina.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateProductCreated implements Question<Object> {
    @Override
    public Object answeredBy(Actor actor) {
        return null;
    }

    public static Question<Object> on(){
        return new ValidateProductCreated();
    }
}
