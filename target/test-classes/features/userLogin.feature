@tag
Feature: Rahul Shetty Academy

  @tag1
  Scenario Outline: User Student Login
    Given RSA login page to login
    When sign using <username> and <password>
    Then Account opens
    And check more courses

Examples:
|username											|password					|
|david.smile7@gmail.com				|Sagar@143				|
|anshu.smile7@gmail.com				|Anshu@143				|

