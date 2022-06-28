package exo.weatherchannel;

import org.openqa.selenium.By;

public class WCLocators {
    public static final By SEARCH_TEXT_INPUT = By.id("LocationSearch_input");
    public static final By CITY_SANTA_CRUZ_CA = By.id("LocationSearch_listbox-0");
    public static final By CITY_TOP_NAVIGATION = By.xpath("//span[@class='styles--locationName--DD-D9']");
    public static final By CITY_MAIN_NAVIGATION = By.cssSelector(".CurrentConditions--location--kyTeL");
    public static final By HOURLY_FORCAST = By.xpath("//h2[.='Hourly Forecast']");
    public static final By HOURLY_FORECAST_MAIN_DIV = By.cssSelector("[data-testid='HourlyWeatherModule']");
    public static final By SEE_DETAILS = By.xpath("//a[.='Next 48 Hours']");
    public static final By TODAYS_DETAILS = By.cssSelector("[data-testid='TodaysDetailsModule']");
    public static final By WIND_LABEL = By.xpath("//div[.='Wind']");
    public static final By WIND_VALUE = By.xpath("//span[.='Wind Direction6 mph']");
    public static final By HUMIDITY_LABEL = By.xpath("//div[.='Humidity']");
    public static final By HUMIDITY_VALUE = By.cssSelector("[data-testid='PercentageValue']");
    public static final By DEWPOINT_LABEL = By.xpath("//div[.='Dew Point']");
    public static final By DEWPOINT_VALUE = By.cssSelector(".TodayDetailsCard--detailsContainer--16Hg0 > div:nth-of-type(4) > .WeatherDetailsListItem--wxData--2s6HT");
    public static final By PRESSURE_LABEL = By.xpath("//div[@class='TodayDetailsCard--detailsContainer--16Hg0']//div[.='Pressure']");
    public static final By PRESSURE_VALUE = By.cssSelector(".Pressure--pressureWrapper--3UYAZ");
    public static final By UVINDEX_LABEL = By.xpath("//div[.='UV Index']");
    public static final By UVINDEX_VALUE = By.cssSelector("[data-testid='UVIndexValue']");
    public static final By SUNRISE_LABEL = By.xpath("//div[.='UV Index']");
    public static final By SUNRISE_VALUE = By.cssSelector("[data-testid='UVIndexValue']");
    public static final By SUNSET_LABEL = By.xpath("//div[.='UV Index']");
    public static final By SUNSET_VALUE = By.cssSelector("[data-testid='UVIndexValue']");
    public static final By HOURLY_TRENDS = By.cssSelector(".HourlyForecast--Card--1OYs4");
}
