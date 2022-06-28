package exo.weatherchannel;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class WCSearchActions extends UIInteractionSteps {
    private Duration duration = Duration.ofSeconds(15);
    private Duration pollingEvery = Duration.ofSeconds(3);

    public void searchForCity(String searchTerm) {
        waitForCondition().withTimeout(duration).pollingEvery(pollingEvery).until(ExpectedConditions.presenceOfElementLocated(WCLocators.SEARCH_TEXT_INPUT));
        $(WCLocators.SEARCH_TEXT_INPUT).sendKeys(searchTerm);
        $(WCLocators.SEARCH_TEXT_INPUT).sendKeys(Keys.ENTER);
        $(WCLocators.CITY_SANTA_CRUZ_CA).click();
    }

    public void cityIsDisplayed(String city) {
        waitForCondition().withTimeout(duration).pollingEvery(pollingEvery).until(ExpectedConditions.presenceOfElementLocated(WCLocators.CITY_MAIN_NAVIGATION));
        Assert.assertTrue($(WCLocators.CITY_MAIN_NAVIGATION).isDisplayed());
        Assert.assertTrue($(WCLocators.CITY_TOP_NAVIGATION).isDisplayed());
    }

    public void hourlyForecastIsDisplayed() {
        waitForCondition().withTimeout(duration).pollingEvery(pollingEvery).until(ExpectedConditions.presenceOfElementLocated(WCLocators.HOURLY_FORECAST_MAIN_DIV));
        Assert.assertTrue($(WCLocators.HOURLY_FORCAST).isDisplayed());
        Assert.assertTrue($(WCLocators.HOURLY_FORECAST_MAIN_DIV).isDisplayed());
    }

    public void seeDetailsIsDisplayedClickable() {
        waitForCondition().withTimeout(duration).pollingEvery(pollingEvery).until(ExpectedConditions.presenceOfElementLocated(WCLocators.SEE_DETAILS));
        Assert.assertTrue($(WCLocators.SEE_DETAILS).isDisplayed());
        Assert.assertTrue($(WCLocators.HOURLY_FORECAST_MAIN_DIV).isClickable());
    }

    public void windDisplayedHasValue() {
        waitForCondition().withTimeout(duration).pollingEvery(pollingEvery).until(ExpectedConditions.presenceOfElementLocated(WCLocators.TODAYS_DETAILS));
        Assert.assertTrue($(WCLocators.TODAYS_DETAILS).isDisplayed());
        String windValue = $(WCLocators.WIND_VALUE).getText();
        Assert.assertTrue($(WCLocators.WIND_LABEL).isDisplayed());
        Assert.assertTrue($(WCLocators.WIND_VALUE).isDisplayed());
        Assert.assertTrue(!windValue.isEmpty() || windValue != "");
    }

    public void humidityDisplayedValue() {
        waitForCondition().withTimeout(duration).pollingEvery(pollingEvery).until(ExpectedConditions.presenceOfElementLocated(WCLocators.HUMIDITY_LABEL));
        Assert.assertTrue($(WCLocators.HUMIDITY_LABEL).isDisplayed());
        String humidity = $(WCLocators.HUMIDITY_VALUE).getText();
        Assert.assertTrue($(WCLocators.WIND_LABEL).isDisplayed());
        Assert.assertTrue($(WCLocators.WIND_VALUE).isDisplayed());
        Assert.assertTrue(!humidity.isEmpty() || humidity != "");
    }
}
