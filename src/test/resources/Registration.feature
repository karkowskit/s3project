Feature: Test of s3froup registration page

  Scenario Outline: Validation of registration page
    Given registration form
    When user push form with wrong data - <test case>
    Then page presents validation message - <test case>
  Examples:
    |test case|
    |empty frist name|
    |empty last name|
#    |empty company|
#    |empty job title|
#    |empty email|
#    |empty password|
#    |empty confirm password|
#    |empty street address|
#    |empty city address|
#    |empty state address|
#    |empty country address|
#    |empty phone|