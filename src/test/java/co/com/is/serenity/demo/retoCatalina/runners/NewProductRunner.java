package co.com.is.serenity.demo.retoCatalina.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/crearNuevoProducto.feature",
        glue = "co.com.is.serenity.demo.retoCatalina.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class NewProductRunner {
}
