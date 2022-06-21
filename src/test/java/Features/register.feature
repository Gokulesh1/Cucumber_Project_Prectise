

@test
  Feature:As a user should be able register successfully
    Scenario:user should be able to register successfully after clicking on register button and can see success massage


      Given I am on registration page
      When I enter required registration details
      And I click on register button
      Then I should be able to register successfully
