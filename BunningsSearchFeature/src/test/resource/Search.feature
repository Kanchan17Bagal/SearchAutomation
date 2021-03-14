Feature: Search

 # Scenario Outline: Search using valid search term
 # Given I open bunnings website
 # When I enter "<searchtext>" in search box
 #   And I click on search button
 #  Then Search result is displayed
  #  Examples:
   #   | searchtext |
  #    | Shade      |


  #Scenario Outline: Search using invalid search term
   # Given I open bunnings website
   # When I enter "<invalidsearchtext>" in search box
   # And I click on search button
   # Then Search result is not displayed
  #  Examples:
   #   | invalidsearchtext |
    #  | @@@@@@      |

  Scenario Outline: Search using invalid search term
    Given I open bunnings website
    When I enter "<searchtext>" in search box
    And I select the first suggestion
    Then Search result displayed
    Examples:
      | searchtext |
      | Shade      |