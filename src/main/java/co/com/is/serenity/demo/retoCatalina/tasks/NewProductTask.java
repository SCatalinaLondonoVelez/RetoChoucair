package co.com.is.serenity.demo.retoCatalina.tasks;


import co.com.is.serenity.demo.retoCatalina.models.DataInjection;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;


import static co.com.is.serenity.demo.retoCatalina.userinterface.NewProductUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class NewProductTask implements Task {

    DataInjection dataInjection = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_NORTHWIND),
                Click.on(BTN_PRODUCTS),
                Click.on(BTN_NEW_PRODUCT),
                WaitUntil.the(INP_PRODUCT_NAME, isVisible()).forNoMoreThan(10).seconds(),
                Enter.keyValues(dataInjection.getProductName()).into(INP_PRODUCT_NAME),
                Enter.keyValues(dataInjection.getImage()).into(INP_PRODUCT_IMAGE),
                WaitUntil.the(IMAGE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CHK_DISCONTINUED),
                WaitUntil.the(LIST_SUPPLIER, isClickable()).forNoMoreThan(10).seconds(),

                Click.on(LIST_SUPPLIER),
                WaitUntil.the(INP_SUPPLIER, isClickable()).forNoMoreThan(10).seconds(),
                Enter.theValue(dataInjection.getSupplier()).into(INP_SUPPLIER),
                Enter.keyValues(Keys.ENTER).into(INP_SUPPLIER),

                Click.on(LIST_CATEGORY),
                WaitUntil.the(INP_CATEGORY, isClickable()).forNoMoreThan(10).seconds(),
                Enter.keyValues(dataInjection.getCategory()).into(INP_CATEGORY),
                Enter.keyValues(Keys.ENTER).into(INP_CATEGORY),


                Enter.keyValues(dataInjection.getQuantityPerUnit()).into(INP_QUANTITY_PER_UNIT),
                Enter.keyValues(dataInjection.getUnitPrice()).into(INP_UNIT_PRICE),
                Clear.field(INP_UNIT_IN_STOCK),
                Enter.keyValues(dataInjection.getUnitsInStock()).into(INP_UNIT_IN_STOCK),
                Clear.field(INP_UNIT_ON_ORDER),
                Enter.keyValues(dataInjection.getUnitsOnOrder()).into(INP_UNIT_ON_ORDER),
                Clear.field(INP_REORDER_LEVEL),
                Enter.keyValues(dataInjection.getReorderLevel()).into(INP_REORDER_LEVEL),
                Scroll.to(BTN_SAVE),
                WaitUntil.the(BTN_SAVE, isClickable()).forNoMoreThan(20).seconds(),
               Click.on(BTN_SAVE)


        );
    }

    public static NewProductTask on(){
        return Tasks.instrumented(NewProductTask.class);
    }
}
