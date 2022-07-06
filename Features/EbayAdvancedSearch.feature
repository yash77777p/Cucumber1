Feature: Advanced Search Page Scenarios

  @p6
  Scenario: Ebay Logo On Advanced Search Page
    Given I am on Advanced Search Page
    When I clicked on the Ebay Logo
    Then I am navigated to Ebay Home Page

  @p22
  Scenario: Adavnced search on item
    Given I am on Advanced Search Page
    When I serach the idem with advanced search fileds
      | Keword | Exclude     | Min | Max |
      | Oppo   | Refurbished |  300 | 900 |
    Then I validate the results count greather than 100000 'advanced'
