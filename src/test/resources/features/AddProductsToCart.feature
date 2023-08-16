Feature: Add product to cart
  As a user, wants to add a product to cart

  Scenario: Add a product to cart success
    Given User open Falabella page and search any product
    When user click on add to cart and change the quantity
    Then user can read the product name and its quantity