Feature: Ebay Home Page Scenario

  @p1
  Scenario: Advanced search link
    Given I am on Ebay Home Page
    When I click on the Advanced link
    Then I navigate to advanced search page

  @p3
  Scenario: Search the item count
    Given I am on Ebay Home Page
    When I search for the 'oneplus' with category '15032'
    Then I validate the results count greather than 1000 'normal'

  @p3
  Scenario: Search the item count2
    Given I am on Ebay Home Page
    When I search for the 'cars' with category '220'
    Then I validate the results count greather than 100 'normal'

  @p4
  Scenario: login to the application
    Given I am on Ebay Home Page
    When I clicked on the sign in link
    Then I validate the login operation with valid credentials
	@p5 @Smoke
  Scenario Outline: Home Page Links Validation
    Given I am on Ebay Home Page
    When I clicked on the '<link>'
    Then I validate page navigate to the correct '<url>' and title contains '<title>'

    Examples: 
      | link        | url                                                                                               | title       |
      | Electronics | https://www.ebay.com/b/Electronics/bn_7000259124                                                  | Electronics |
      | Fashion     | https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545                                | Clothing     |
      | Motors      | https://www.ebay.com/sch/6028/i.html?_from=R40&_nkw=Auto+Parts+Accessories&_blrs=recall_filtering | auto parts  |
