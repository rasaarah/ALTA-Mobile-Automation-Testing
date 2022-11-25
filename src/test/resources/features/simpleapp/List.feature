@login @android
Feature: List

  Background:
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user go to list menu

  @test @positive
  Scenario: Verify user can do scroll
    And user do scroll

  @longpress
  Scenario: User long press on list page
    When User on list page
    Then User do long press

  @multitap
  Scenario: User do multi taps
    When User on list page
    Then User do multiple taps on the list