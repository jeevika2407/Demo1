Feature: Login Feature
  @validDetails
  Scenario Outline: Login with valid details
    Given the user is on DemoWebShop Login page "https://demowebshop.tricentis.com/login"
    When the user enters valid "<username>" and "<password>"
    Then the user should see the message "<message>"
  Examples:
    | username         | password | message                                																							|
    | jeevbalajj@gmail.com  | 123456   | Welcome to the new Tricentis store!    																							|
    | 123@gmail.com   | 123456   | Put your login / registration information here. You can edit this in the admin site.|                   
