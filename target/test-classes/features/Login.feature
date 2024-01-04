
Feature: Login Functionality
  As a user, I should be able to create an account.
  As a user, I should be able to login.




  Scenario: Login with valid credentials by clicking login button
    When Go to login page
    And Enter valid username in username field
    And Enter valid password in password field
    And Click on the login button
    Then Verify that user can login


  Scenario: Login with valid credentials  by hitting  "Enter" key from the keyboard
    When Go to login page
    And Enter valid username in username field and password in password field
      | username | alpacino.1@gmail.com |
      | password | Alpaçino.1 |
    And hit enter key word
    Then Verify that user can login


  Scenario Outline: user can not login with invalid credentials
    When Go to login page
    And Enter referred credentials "<username>" "<password>"
    And Click on the login button
    Then user should not be login and  see the message "Kullanıcı adınız veya şifreniz yanlış."

    Examples:

      | username    | password    |
      | Employee130@abc.com |Alpaçino.1|
      | alpacino.1@gmail.com| asde123|


  Scenario: user can not login with blank credentials
    When Go to login page
    And User enter credentials "Employee130" "Alpaçino.1"
    Then User should see message for typosMessageForEmail"E-posta adresinizi doğru yazdığınızdan emin olun."
    And User enter credentials " " "Alpaçino.1"
    Then User should see message for blankMessageForEmail"Bu alanı doldurmanız gerekir."
    And User enter credentials "Employee130@abc.com" " "
    Then User should see message for blankMessageForPassword"Bu alanı doldurmanız gerekir."
    And Click on the login button
    Then User should not be login and  see the pop-up message "Formu göndermeden önce sistemdeki eksik alanları doldurunuz."
    And User enter credentials " " " "
    Then User should see message for blank"Bu alanı doldurmanız gerekir."
    And  Click on the login button
    Then User should not be login and  see the pop-up message "Formu göndermeden önce sistemdeki eksik alanları doldurunuz."


  Scenario: user can see password in a form of dots by default after entering password
    When Go to login page
    And Enter username "Employee130" in username field
    And Enter password "Employee123" in password field
    Then User can see the password in a form of dots by default


  Scenario:Verify that user can see the password explicitly if needed
    When Go to login page
    And Enter password "Employee123" in password field
    And Click eye sign in password field
    Then  user should be able to see the password explicitly


  Scenario: Verify user can see the "Reset Password" button on the next page after clicking on forget password link
    When Go to login page
    And Check Forget password? link on the login page
    And Click  Forget password? link
    Then User can see the Reset password button on the next page


  Scenario:Verify that user can see valid placeholders on Username and Password fields
    When Go to login page
    And Check username and password field
    Then user can see expected placeholders in related field
      | in_username | E-Posta |
      | in_password | Şifrenizi girin |


  Scenario: User can create an account with valid credentials
    When Go to login page
    And Click on the create an account button
    And Enter valid name in name field
    And Enter valid surname in surname field
    And Enter valid email address in email field
      And Enter valid telephone number in telephone field
    And Enter valid password in parola field
    And Enter valid password in parola tekrar field
    And Select the checkbox of Gender
    And Select the checkbox of Terms of Use
    Then Verify that user can create an account




  #Declarative Example:

#  Scenario: Verify login
#
#    Given user navigate to the Website
#
#    When user enters credentials
#
#    Then the user clicks on the sign-in button
#
#    Then validate the title after login

