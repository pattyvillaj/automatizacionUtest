# Actor: Maria

@stories
  Feature: Utest Plataform
    As a software delevop I want register on the utest plataform

@scenario1
Scenario: Utest registration

  Given than Sonia want register on the utest plataform

  When she enters her data in the registration form
  | firstname | lastname |         email         | month  |   day  | year | city  |  zip   | country | yourComputer |   version    | language | device |   model   | operatingSystem | password | ConfirmPassword |
  | Maria     | Villamil   | marivilla@gmail.com | May    |   12   | 1999 | Cucuta | 025120 | Colombia|     Linux    | vista 64-bit | Spanish  | Apple  | iPhone 3G |     iOS 3.0     | 9517538246Pat | 9517538246Pat|

  Then the registration is completed by clicking on the button Complete Setup