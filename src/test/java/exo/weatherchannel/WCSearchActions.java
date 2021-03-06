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

    public void dewPointDisplayedValue() {
        waitForCondition().withTimeout(duration).pollingEvery(pollingEvery).until(ExpectedConditions.presenceOfElementLocated(WCLocators.DEWPOINT_LABEL));
        Assert.assertTrue($(WCLocators.DEWPOINT_LABEL).isDisplayed());
        String dewPoint = $(WCLocators.DEWPOINT_VALUE).getText();
        Assert.assertTrue($(WCLocators.DEWPOINT_LABEL).isDisplayed());
        Assert.assertTrue($(WCLocators.DEWPOINT_LABEL).isDisplayed());
        Assert.assertTrue(!dewPoint.isEmpty() || dewPoint != "");
    }

    public void pressureDisplayedValue() {
        waitForCondition().withTimeout(duration).pollingEvery(pollingEvery).until(ExpectedConditions.presenceOfElementLocated(WCLocators.PRESSURE_LABEL));
        Assert.assertTrue($(WCLocators.PRESSURE_LABEL).isDisplayed());
        String pressure = $(WCLocators.PRESSURE_VALUE).getText();
        Assert.assertTrue($(WCLocators.PRESSURE_LABEL).isDisplayed());
        Assert.assertTrue($(WCLocators.PRESSURE_LABEL).isDisplayed());
        Assert.assertTrue(!pressure.isEmpty() || pressure != "");
    }

    public void uvIndexDisplayedValue() {
        waitForCondition().withTimeout(duration).pollingEvery(pollingEvery).until(ExpectedConditions.presenceOfElementLocated(WCLocators.UVINDEX_LABEL));
        Assert.assertTrue($(WCLocators.UVINDEX_LABEL).isDisplayed());
        String uvIndex = $(WCLocators.UVINDEX_VALUE).getText();
        Assert.assertTrue($(WCLocators.UVINDEX_LABEL).isDisplayed());
        Assert.assertTrue($(WCLocators.UVINDEX_LABEL).isDisplayed());
        Assert.assertTrue(!uvIndex.isEmpty() || uvIndex != "");
    }

    public void sunriseDisplayedValue() {
        waitForCondition().withTimeout(duration).pollingEvery(pollingEvery).until(ExpectedConditions.presenceOfElementLocated(WCLocators.SUNRISE_LABEL));
        Assert.assertTrue($(WCLocators.SUNRISE_LABEL).isDisplayed());
        String sunrise = $(WCLocators.SUNRISE_VALUE).getText();
        Assert.assertTrue($(WCLocators.SUNRISE_LABEL).isDisplayed());
        Assert.assertTrue($(WCLocators.SUNRISE_LABEL).isDisplayed());
        Assert.assertTrue(!sunrise.isEmpty() || sunrise != "");
    }

    public void sunsetDisplayedValue() {
        waitForCondition().withTimeout(duration).pollingEvery(pollingEvery).until(ExpectedConditions.presenceOfElementLocated(WCLocators.SUNSET_LABEL));
        Assert.assertTrue($(WCLocators.SUNSET_LABEL).isDisplayed());
        String sunset = $(WCLocators.SUNSET_VALUE).getText();
        Assert.assertTrue($(WCLocators.SUNSET_LABEL).isDisplayed());
        Assert.assertTrue($(WCLocators.SUNSET_LABEL).isDisplayed());
        Assert.assertTrue(!sunset.isEmpty() || sunset != "");
    }

    public void clickSeeDetailsButton() {
        waitForCondition().withTimeout(duration).pollingEvery(pollingEvery).until(ExpectedConditions.presenceOfElementLocated(WCLocators.SEE_DETAILS));
        Assert.assertTrue($(WCLocators.SEE_DETAILS).isDisplayed());
        Assert.assertTrue($(WCLocators.HOURLY_FORECAST_MAIN_DIV).isClickable());
        $(WCLocators.SEE_DETAILS).click();
    }

    public void trendingGraphsDisplayed() {
        waitForCondition().withTimeout(duration).pollingEvery(pollingEvery).until(ExpectedConditions.presenceOfElementLocated(WCLocators.HOURLY_FORCAST));
        Assert.assertTrue($(WCLocators.HOURLY_FORCAST).isDisplayed());
        Assert.assertTrue($(WCLocators.HOURLY_FORCAST).isCurrentlyVisible());

    }
}
