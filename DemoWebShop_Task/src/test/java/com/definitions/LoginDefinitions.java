package com.definitions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import com.actions.HomePageActions;
import com.actions.LoginActions;
import com.utils.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
@Listeners(com.utils.Listeners.class)
public class LoginDefinitions {
	public static final Logger log=LogManager.getLogger(com.definitions.LoginDefinitions.class);
	LoginActions la=new LoginActions();
	HomePageActions ha=new HomePageActions();
	@Given("the user is on DemoWebShop Login page {string}")
	public void launch(String string) {
		log.info("Launching DemoWebShop Login page");
		HelperClass.getDriver().get(string);
	}
	@When("the user enters valid {string} and {string}")
	public void login(String string, String string2){
	   log.info("Entering login credentials");
	   la.setUsername(string);
	   la.setPassword(string2);
	   log.info("Clicking login button");
	   la.click();
	}
	@Then("the user should see the message {string}")
	public void chcekLogin(String string){
		if(string.equals("Welcome to the new Tricentis store!")) {
			String actual=ha.getHomeText();
			Assert.assertEquals(actual,string);
			log.info("Login validation successful");
		}
		else{
			String actual=ha.getHomeText();
			Assert.assertEquals(actual,string);
			log.info("Invalid login correctly rejected");
		}
	}
}
