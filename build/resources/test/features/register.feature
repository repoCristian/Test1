#lenguaje:en

Feature: Register

  Scenario Outline:Sing up
    Given the user has opened URL
    When the user click on join today button
    And the user fills out the registration 1 and 2 steps
      | FirstName   | LastName  | Email   | Month   | Day   | Year   | Language   | City   | ZipCode   | Country   |
      | <firstName> | <lasName> | <email> | <month> | <day> | <year> | <language> | <city> | <zipcode> | <country> |
    And the  user continue 3 and 4 steps registration
      | Computer   | Version   | Language1   | Password   |
      | <computer> | <version> | <language1> | <password> |

    Then the user should welcome message
    Examples:
      | firstName | lasName | email       | month | day | year | language | city     | zipcode | country  | computer | version | language1 | password     |
      | Jota      | posada  | 123@123.com | March | 19  | 1980 | Spanish  | Medellin | 05500   | Colombia | Linux    | Debian  | English   | Cristian123! |

