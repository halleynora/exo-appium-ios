package exo.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

@DefaultUrl("https://weather.com/")
public class WeatherChannelHomePage extends PageObject {
    public WeatherChannelHomePage(WebDriver driver) {
        super(driver);
    }
    public WeatherChannelHomePage(URL url, DesiredCapabilities capabilities){

    }
}
