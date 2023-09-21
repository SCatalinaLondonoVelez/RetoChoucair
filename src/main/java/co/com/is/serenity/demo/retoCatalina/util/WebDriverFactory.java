package co.com.is.serenity.demo.retoCatalina.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Collections;
import java.util.HashMap;


public class WebDriverFactory {

    public static WebDriver driver;

    private WebDriverFactory(){}

    public static WebDriver goToWeb(String url) {
        driver = getDriver();
        driver.get(url);
        return driver;
    }
    private static WebDriver getChromeDriver() {

        HashMap<String, Object> preferences = new HashMap<>();
        preferences.put("profile.managed_default_content_settings.javascript", 1);
        preferences.put("profile.default_content_settings.popups", 1);
        preferences.put("profile.content_settings.exceptions.plugins.*,*.setting", 1);
        preferences.put("download.prompt_for_download", "false");
        preferences.put("profile.default_content_setting_values.automatic_downloads", 1);
        preferences.put("profile.managed_default_content_settings.geolocation", 2);


        DesiredCapabilities capabilities = new DesiredCapabilities();
        ChromeOptions options = new ChromeOptions();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(capabilities);
        options.addArguments(
                "--incognito",
                "--disable-infobars",
                "enable-automation",
                "--force-device-scale-factor=0.95",
                "--start-maximized",
                "--disable-popup-blocking",
                "--use-fake-device-for-media-stream",
                "--use-fake-ui-for-media-stream",
                "--ignore-certificate-errors",
                "--disable-gpu",
                "--no-sandbox",
                "--disable-download-notification",
                "--disable-notifications",
                "--test-type",
                "--disable-extensions",
                "--disable-translate",
                "--allow-running-insecure-content",
                "--disable-dev-shm-usage",
                "--disable-browser-side-navigation"
        );

        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("prefs", preferences);
        
        return WebDriverManager.chromedriver().capabilities(options).create();
    }
    private static WebDriver getDriver() {
        return (Constants.DEFAULT_BROWSER.equals(Constants.CHROME)) ? getEdgeDriver() : getChromeDriver();
    }

    private static WebDriver getEdgeDriver() {

        EdgeOptions options = new EdgeOptions();
        options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        return WebDriverManager.edgedriver().capabilities(options).create();
    }
}
