@Regression
Feature: Add order to cart

  @SmokeTest
  Scenario: Add first item of product page
    Given Santiago logs in
    When Santiago Adds order to the cart
    Then Santiago Should checkout his product
    Then Santiago Fills in his information
    Then Santiago Overview his checkout