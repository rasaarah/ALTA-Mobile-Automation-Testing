@android @math
Feature: Adding Numbers

  Background:
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login

  @sum
    Scenario Outline: User using calculator for sum
      Given User is on calculator page
      When User input first number <number1>
      When User input second number <number2>
      Then User click button result
      And Result should be <result>
    Examples:
      | number1 | number2 | result       |
      | 1       | 2       | "Hasil : 3"  |
      | 2       | 3       | "Hasil : 5"  |
      | 40      | 20      | "Hasil : 60" |

  @min
  Scenario Outline: User using calculator for sum
    Given User is on calculator page
    When User input first number <number1>
    When User input second number <number2>
    And User click dropdown
    And User click icon '-'
    Then User click button result
    And Result should be <result>

    Examples:
      | number1 | number2 | result       |
      | 2       | 1       | "Hasil : 1"  |
      | 3       | 0       | "Hasil : 3"  |
      | 40      | 20      | "Hasil : 20" |

  @divide
  Scenario Outline: User using calculator for sum
    Given User is on calculator page
    When User input first number <number1>
    When User input second number <number2>
    And User click dropdown
    And User click icon divide
    Then User click button result
    And Result should be <result>

    Examples:
      | number1 | number2 | result      |
      | 2       | 2       | "Hasil : 1" |
      | 6       | 3       | "Hasil : 2" |
      | 50      | 25      | "Hasil : 2" |

  @multiple
  Scenario Outline: User using calculator for sum
    Given User is on calculator page
    When User input first number <number1>
    When User input second number <number2>
    And User click dropdown
    And User click icon multiple
    Then User click button result
    And Result should be <result>
    Examples:
      | number1 | number2 | result         |
      | 1       | 2       | "Hasil : 2"    |
      | 2       | 3       | "Hasil : 6"    |
      | 50      | 20      | "Hasil : 1000" |