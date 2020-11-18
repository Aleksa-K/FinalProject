@PageTest

Feature: Buy a product

  Background:
    Given Open the Chrome browser and load the URL


  Scenario: Search a product
    Given Enter "watch" to the search field
    And  Press search button
    When Choose a product brand
    Then Choose TOP product
    And Select a product and click on it
    And Add a product to the cart
    And Go to the cart
    And Accept purchase
    And Choose to buy without authorization



