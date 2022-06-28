Feature: Search by keyword

  Scenario: Searching for a city
    Given Weather Channel home page is loaded
    When Search term "Santa Cruz, California" is entered
    Then the city "Santa Cruz, CA" should be displayed
    Then assert Hourly Forecast section is displayed
    Then assert See Details button is displayed and clickable
    Then assert in Today's Details that Wind has a value
    Then assert in Today's Details that Humidity has a value
    Then assert in Today's Details that Dew Point has a value
    Then assert in Today's Details that Pressure has a value
    Then assert in Today's Details that UV Index has a value
    Then assert in Today's Details that Sunrise has a value
    Then assert in Today's Details that Sunset has a value
    When See Details button is clicked
    Then assert trending condition is displayed for each graph








