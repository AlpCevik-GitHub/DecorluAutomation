luFeature: User can buy any item from the store

  Background: User is logged in


  @1234
  Scenario: User buys an item
    Given I am logged in as a user
    Given User select "Mobilya" category
    When User select "Bahçe Mobilyaları" subcategory
    And User select Marka
    And User select Fiyat Aralığı
    And User select first product on the search result
    And User add the product to the cart

  @1234
  Scenario: User go to the cart and verify the product
    And User go to the cart
    Then Verify the product is added to the cart
    Then Verify the product price is correct
    Then Verify the product quantity is correct
    Then Verify the product total price is correct
  @1234
  Scenario: User go to the cart and increase/decrease the quantity of the product
    When User go to the cart
    And User increase the quantity of the product
    And User decrease the quantity of the product
    Then Verify the product quantity is increased
  @1234
  Scenario: User go to the cart and delete the product
    When User go to the cart
    And User delete the product from the cart
    Then Verify the product is deleted from the cart
  @1234 @12345
  Scenario: User go to the cart and complete the order
    Given I am logged in as a user
    When User go to the cart
    And User confirm the cart
    And User select delivery address
    And User select payment method
    And User select first payment option
    Then Verify that total amount equals order summary amount
    And User select terms of conditions
    And User click make the payment button
    And User enter sms code "283126" and click submit button
    Then Verify that order is completed successfully
    And User click continueShoppingButton button
    Then Verify that user is on the main page
    @wip123
  Scenario: User go to the cart and complete the order
    Given I am logged in as a user
    When User go to the cart
    And User confirm the cart
    And User select delivery address
    And User select payment method
    And User enter card information
    Then Verify that total amount equals order summary amount
    And User select terms of conditions
    And User click make the payment button
    And User enter sms code "283126" and click submit button
    Then Verify that order is completed successfully
    And User click continueShoppingButton button
    Then Verify that user is on the main page

  Scenario: User controls order completion
    Given User is logged in
    When User click my orders button
    Then Verify that order is listed in my orders page
    And User click the order
    Then Verify that order details are correct
    And User click the return button
    Then Verify that return page is opened
    And User click the return reason

  Scenario: User controls my orders

    When User click my orders button
    And User click "Ongoing Orders" button
    Then Verify that order is listed in my orders page
    And User click the order
    Then Verify that order details are correct

   Scenario: User should see how much more to add for free shipping

      // In this scenario, free shipping limit was dynamically set to 150 from the administrator.

      Given user login successfully.
      When user goes handmade category
      And User types 149 into max price field and clicks filter button
      And User clicks first product from the list and goes product page
      And user adds product to cart
      And user goes cart page
      Then Verify that User see how much more to add for free shipping correctly


