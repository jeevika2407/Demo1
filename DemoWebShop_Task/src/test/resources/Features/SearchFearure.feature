Feature: Search For the Product
  @Searching_for_product
  Scenario Outline: Search for the product
    Given the user is on DemoWebShop Login page "https://demowebshop.tricentis.com/login"
    When the user enters valid "<username>" and "<password>"
    Then the user should see the message "<message>"
    When search the product in search bar
		And user apply the filter options and clicks saves
		And clicks the Add to cart button
		Then Go to the shopping cart
		And verify the product added to the cart
		
  Examples:
    | username         | password | message                            |
    | jeevbalajj@gmail.com  | 123456   | Welcome to the new Tricentis store!|