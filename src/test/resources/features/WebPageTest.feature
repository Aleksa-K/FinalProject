@PageTest

  Feature: Buy a product

    Background:
      Given Open the Chrome browser and load the URL


    Scenario: Search a product
      When Enter data to the search field
      And  Press search button
      Then Select a product and click on it
      And Add a product to the cart
      And Go to the cart
      And Accept purchase



