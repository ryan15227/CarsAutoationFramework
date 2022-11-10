Feature: Car search

  Background:
    Given User is on Cars.com

    @search
    Scenario: Search for Rolls Royce
      When User selects New/used dropdown user chooses Used
      Then User selects Rolls -Royce from Make Dropdown
      And Model should be set to All Models
      Then the price should be set to No Max Price within the Price Dropdown
      And ZIP should be set to 15241
