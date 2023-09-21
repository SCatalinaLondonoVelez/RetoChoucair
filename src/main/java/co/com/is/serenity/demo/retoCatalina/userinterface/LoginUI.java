package co.com.is.serenity.demo.retoCatalina.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {
    public static final Target BTN_INICIO_SESION = Target.the("INICIO SESION").located(By.id("LoginPanel0_LoginButton"));
    public static final Target BTN_NORTHWIND = Target.the("INICIO SESION").locatedBy("//span[contains(text(),'Northwind')]");
}
