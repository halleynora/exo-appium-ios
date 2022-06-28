package exo.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import exo.navigation.NavigateTo;
import exo.navigation.WeatherChannelHomePage;
import exo.weatherchannel.WCSearchActions;

import java.net.MalformedURLException;

public class SearchStepDefinitions {
//
//    @Given("{actor} is researching things on the internet")
//    public void researchingThings(Actor actor) {
//        actor.wasAbleTo(NavigateTo.theWeatherChannelHomePage());
//    }
//
//    @When("{actor} looks up {string}")
//    public void searchesFor(Actor actor, String term) {
//        actor.attemptsTo(
//                LookForInformation.about(term)
//        );
//    }
//
//    @Then("{actor} should see information about {string}")
//    public void should_see_information_about(Actor actor, String term) {
//        actor.attemptsTo(
//                Ensure.that(WikipediaArticle.HEADING).hasText(term)
//        );
//    }

    WeatherChannelHomePage weatherChannelHomePage;

    @Steps
    NavigateTo navigateTo;

    @Steps
    WCSearchActions wcSearchActions;

    @Given("Weather Channel home page is loaded")
    public void weatherChannelHomePageIsLoaded() throws MalformedURLException {
        navigateTo.theWeatherChannelHomePage();
    }

    @When("Search term {string} is entered")
    public void searchTermIsEntered(String searchTerm) {
        wcSearchActions.searchForCity(searchTerm);
    }

    @Then("the city {string} should be displayed")
    public void theCityShouldBeDisplayed(String city) {
        wcSearchActions.cityIsDisplayed(city);
    }

    @Then("assert Hourly Forecast section is displayed")
    public void assertHourlyForecastSectionIsDisplayed() {
        wcSearchActions.hourlyForecastIsDisplayed();
    }

    @Then("assert See Details button is displayed and clickable")
    public void assertSeeDetailsButtonIsDisplayedAndClickable() {
        wcSearchActions.seeDetailsIsDisplayedClickable();
    }

    @Then("assert in Today's Details that Wind has a value")
    public void assertInTodaySDetailsThatWindHasAValue() {

    }

    @Then("assert in Today's Details that Humidity has a value")
    public void assertInTodaySDetailsThatHumidityHasAValue() {
    }

    @Then("assert in Today's Details that Dew Point has a value")
    public void assertInTodaySDetailsThatDewPointHasAValue() {
    }

    @Then("assert in Today's Details that Pressure has a value")
    public void assertInTodaySDetailsThatPressureHasAValue() {
    }

    @Then("assert in Today's Details that UV Index has a value")
    public void assertInTodaySDetailsThatUVIndexHasAValue() {
    }

    @Then("assert in Today's Details that Sunrise has a value")
    public void assertInTodaySDetailsThatSunriseHasAValue() {
    }

    @Then("assert in Today's Details that Sunset has a value")
    public void assertInTodaySDetailsThatSunsetHasAValue() {
    }

    @When("See Details button is clicked")
    public void seeDetailsButtonIsClicked() {
    }

    @Then("assert trending condition is displayed for each graph")
    public void assertTrendingConditionIsDisplayedForEachGraph() {
    }


}
