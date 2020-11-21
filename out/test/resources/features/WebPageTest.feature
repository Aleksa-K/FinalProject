@PageTest

Feature: Buy a product

  Background:
    Given Open the Chrome browser and load the URL
    And Validate that page has been loaded


  Scenario: Search a product
    Given Enter watch to the search field
    And  Press search button
    When Choose a product brand
    Then Choose TOP product
    And Select a product and click on it
    And Add a product to the cart
    And Go to the cart
    And Validate product name
    And Accept purchase
    And Choose to buy without authorization
    And Validate page has been loaded
    And Fill the shipping form
    And Select shipping method
    And Validate if a page has loaded
    And Select payment method
    And Validate product price



