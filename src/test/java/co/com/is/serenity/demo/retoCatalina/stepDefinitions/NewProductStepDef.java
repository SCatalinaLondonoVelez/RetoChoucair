package co.com.is.serenity.demo.retoCatalina.stepDefinitions;


import co.com.is.serenity.demo.retoCatalina.tasks.NewProductTask;
import co.com.is.serenity.demo.retoCatalina.tasks.SearchProductTask;
import cucumber.api.java.Before;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class NewProductStepDef {
    @Before
    public void prepareActorStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Y("^llena el formulario para crear un nuevo producto$")
    public void llenaElFormularioParaCrearUnNuevoProducto() {
        OnStage.theActor("actor").attemptsTo(
                NewProductTask.on(),
                SearchProductTask.on()
        );
    }

    @Entonces("^valida que el producto se cree correctamente$")
    public void validaQueElProductoSeCreeCorrectamente() {
    }
}
