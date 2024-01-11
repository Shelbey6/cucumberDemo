@E2E
Feature: BookCart Application Demo

 

  @cleanup
  Scenario Outline: Add a product to the cart
    And user should login with "<username>" and "<password>"
    And user search a "<book>"
    When user add the book to the cart
    Then cart badge should be updated

    #@test
    Examples: 
      | username | password   | book |
      | Manny    | Sunday!123 | bir  |
      | Baskar   | Sunday!123 | red  |

    @dev @test
    Examples: 
      | username | password   | book |
      | Manny    | Sunday!123 | hp6  |
      #| Baskar   | Sunday!123 | The Hookup |
