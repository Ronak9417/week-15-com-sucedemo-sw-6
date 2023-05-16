
Feature: Login Test
  As user I want to login into sauce demo website
@sanity @regression
  Scenario: User Should login successfully with valid credentials
    Given I am on homepage
    When I enter username "standard_user"
    And I enter password "secret_sauce"
    And I Click On Login Button
    Then Verify The text "Products"

@smoke @regression
    Scenario: Verify That Six Products Are Displayed On Page
      Given I am on homepage
      When I enter username "standard_user"
      And I enter password "secret_sauce"
      And I Click On Login Button
      Then I should see six products on message



