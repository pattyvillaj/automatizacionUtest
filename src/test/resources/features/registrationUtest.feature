# Actor: Ana

@stories
  Feature: Utest Platform
    As a software developer, I want to register on the Utest platform

  @scenario1
  Scenario: Platform registration
    Given than Ana wants to register on the Utest platform

    When she enters her data in the registration form
      |firstName   |   lastName  | emailAddress  |  month |    day   |  year  |  city   |  zip    | country  | yourComputer  | version    | language  | device   | model   | operatingSystem | password |
      |  María       | Alvarez | maria123@gmail.com | April  | 20    | 1995   |Medellín | 050042  |  Colombia|     MacOs     | Os X 10.6  |  Spanish  |Apple     |iPhone 6 |iOS 10.0         |Asdfghj_1234567|

    Then she will see the welcome message

