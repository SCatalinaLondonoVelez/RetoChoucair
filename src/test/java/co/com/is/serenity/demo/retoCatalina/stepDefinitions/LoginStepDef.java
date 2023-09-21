package co.com.is.serenity.demo.retoCatalina.stepDefinitions;


import co.com.is.serenity.demo.retoCatalina.questions.ValidateLogin;
import co.com.is.serenity.demo.retoCatalina.tasks.LoginTask;
import co.com.is.serenity.demo.retoCatalina.util.WebDriverFactory;
import cucumber.api.java.Before;
import cucumber.api.java.es.*;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDef {

    @Before
    public void prepareActorStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario se encuentra en la pagina de inicio$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicio() {
        //OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(WebDriverFactory.goToWeb("https://demo.serenity.is/"))));
        OnStage.theActorCalled("actor").can(BrowseTheWeb.with(WebDriverFactory.goToWeb("https://demo.serenity.is/")));

    }

    @Cuando("^ingresa las respectivas credenciales$")
    public void ingresaLasRespectivasCredenciales() {
        OnStage.theActor("actor").attemptsTo(LoginTask.on());
    }

    @Entonces("^valida que haya ingresado a la pagina principal correctamente$")
    public void validaQueHayaIngresadoALaPaginaPrincipalCorrectamente() {
        OnStage.theActor("actor").should(seeThat(
                ValidateLogin.on(),
                equalTo(true)
        ));
    }
}
