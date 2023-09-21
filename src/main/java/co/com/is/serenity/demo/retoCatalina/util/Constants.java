package co.com.is.serenity.demo.retoCatalina.util;


import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;


public class Constants {

    public static final EnvironmentVariables CONF = SystemEnvironmentVariables.createEnvironmentVariables();

    public static final String DEFAULT_BROWSER = CONF.getProperty("config.browser.default");
    public static final String EDGE = "Edge";
    public static final String CHROME = "Chrome";

}
