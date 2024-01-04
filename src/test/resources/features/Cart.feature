# sepet test
Feature: User can buy any item from the store

  Background: User is logged in
@wip
  Scenario: Sepete ürün ekleme
      Given user login olur
      When user ana menüden "Kategori" seçer
      And user kategori sayfasından "Alt Kategori" seçer
      And user ilk ürünü seçer
      And user ürünü sepete ekle butonuna tıklar
      Then verify that ürün header sepete eklendi
      Then verify that ürün fiyatı doğru
      Then verify that ürün adedi doğru
      Then verify that ürün toplam fiyatı doğru

Scenario: Sepete ürün ekleme
      Given user login olur
        When user ana menüden "Kategori" seçer
        And user kategori sayfasından "Alt Kategori" seçer
        And user ilk ürünü seçer
        And user ürünü sepete ekle butonuna iki defa tıklar
        Then verify that ürün header sepete eklendi
        Then verify that ürün fiyatı doğru
        Then verify that ürün adedi doğru
        Then verify that ürün toplam fiyatı doğru

  Scenario: Sepete ürün ekleme
    Given user login olur
    When user ana menüden "Kategori" seçer
    And user kategori sayfasından "Alt Kategori" seçer
    And user ilk ürünü seçer
    And user ürünü sepete ekle butonuna tıklar
    Then verify that ürün sepetpage sepete eklendi
    Then verify that ürün fiyatı doğru
    Then verify that ürün adedi doğru
    Then verify that ürün toplam fiyatı doğru

  Scenario: Sepete ürün ekleme
    Given user login olur
    When user ana menüden "Kategori" seçer
    And user kategori sayfasından "Alt Kategori" seçer
    And user ilk ürünü seçer
    And user ürünü sepete ekle butonuna iki defa tıklar
    Then verify that ürün sepetpage sepete eklendi
    Then verify that ürün fiyatı doğru
    Then verify that ürün adedi doğru
    Then verify that ürün toplam fiyatı doğru

  Scenario: Sepete ürün ekleme
    Given user login olur
    When user ana menüden "Kategori" seçer
    And user kategori sayfasından "Alt Kategori" seçer
    And user ilk ürünü seçer
    And user ürünü sepete ekle butonuna tıklar
    Then verify that ürün sipariş özeti sepete eklendi
    Then verify that ürün fiyatı doğru
    Then verify that ürün adedi doğru
    Then verify that ürün toplam fiyatı doğru

  Scenario: Sepete ürün ekleme
    Given user login olur
    When user ana menüden "Kategori" seçer
    And user kategori sayfasından "Alt Kategori" seçer
    And user ilk ürünü seçer
    And user ürünü sepete ekle butonuna iki defa tıklar
    Then verify that ürün sipariş özeti sepete eklendi
    Then verify that ürün fiyatı doğru
    Then verify that ürün adedi doğru
    Then verify that ürün toplam fiyatı doğru






  Scenario: User buys an item
    Given user login successfully
    Given User select "Category" from the main menu
    When User select "subcategory" from the category page
    And User select Marka
    And User select Fiyat Aralığı
    And User select first product on the search result
    And User add the product to the cart


  Scenario: User go to the cart and verify the product
    And User go to the cart
    Then Verify the product is added to the cart
    Then Verify the product price is correct
    Then Verify the product quantity is correct
    Then Verify the product total price is correct

  Scenario: User go to the cart and increase/decrease the quantity of the product
    When User go to the cart
    And User increase the quantity of the product
    And User decrease the quantity of the product
    Then Verify the product quantity is increased

  Scenario: User go to the cart and delete the product
    When User go to the cart
    And User delete the product from the cart
    Then Verify the product is deleted from the cart

  Scenario: User go to the cart and complete the order
    Given user login successfully
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

  Scenario: User go to the cart and complete the order
    Given user login successfully
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

      Given user login successfully
      When User select "Category" from the main menu
      And User select "subcategory" from the category page
      And User types 149 into max price field and clicks filter button
      And User clicks first product from the list and goes product page
      And user adds product to cart
      And user goes cart page
      Then Verify that User see how much more to add for free shipping
@list
Scenario: Test

  Given user login successfully
  When User click yapı market button
  And User click bahce button

#  orders





# others