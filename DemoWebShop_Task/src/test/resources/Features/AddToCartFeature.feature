Feature: CheckOut the Product
@Checkout_the_product
Scenario Outline: Check out the product from the cart
		Given the user is on DemoWebShop Login page "https://demowebshop.tricentis.com/login"
   	When the user enters valid "<username>" and "<password>"
    Then the user should see the message "<message>"
    Then Go to the shopping cart
		And verify the product added to the cart
		When the userr enters the checkout Details
		|country|
		|India  |
		And Cliks the check out button
		Then the user should go to the check out page
Examples:
    | username         | password | message                            |
    | gayu3@gmail.com  | 123456   | Welcome to the new Tricentis store!|
