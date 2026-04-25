Feature: Filter functionality 
  Scenario:
    Given  user open amazon website
    When user search for "saree"
    And  user apply filters "cotton"
    Then user see the expected result
