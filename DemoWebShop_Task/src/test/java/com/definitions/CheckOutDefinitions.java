package com.definitions;
import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import com.actions.ChcekOutActions;
import com.utils.HelperClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
@Listeners(com.utils.Listeners.class)
public class CheckOutDefinitions{
	public static final Logger log=LogManager.getLogger(CheckOutDefinitions.class);
	ChcekOutActions ca=new ChcekOutActions();
	@When("the userr enters the checkout Details")
	public void checkout_details(io.cucumber.datatable.DataTable dataTable) {
	    List<String> con=dataTable.asList();
	    String country=con.get(1);
	    ca.chcekout(country);
	}
	@When("Cliks the check out button")
	public void chcekout(){
		log.info("Clicking the checkout button");
	    ca.click();
	}
	@Then("the user should go to the check out page")
	public void verify_checkout() throws IOException, InterruptedException {
	    String ex="Demo Web Shop. Checkout";
	    String act=ca.verify();
	    log.info("Verifying checkout page.");
	    Assert.assertEquals(ex,act);
	    log.info("Checkout page verification successful");
	    ca.addressFilling();
	}
}