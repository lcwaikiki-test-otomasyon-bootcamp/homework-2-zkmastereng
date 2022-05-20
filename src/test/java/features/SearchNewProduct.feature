@Search
Feature: Search New Product

  @SearchNewProduct
  Scenario: Find a blue t-shirt for men
    Given Website is opened
    When Writing to search bar "Mavi t-shirt"
    When Click on Search Button
    Then Checking out whether page is loaded
    Then Click first product
    Then Add to cart