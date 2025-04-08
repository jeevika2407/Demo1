package com.definitions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Listeners;
import com.actions.SearchActions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
@Listeners(com.utils.Listeners.class)
public class SearchDefinitions {
	public static final Logger log=LogManager.getLogger(com.definitions.SearchDefinitions.class);
	SearchActions sa=new SearchActions();
	@When("search the product in search bar")
	public void search_the_product(){
		log.info("Searching the product using the search bar.");
	    sa.searchh();
	}
	@When("user apply the filter options and clicks saves")
	public void filter(){
	   log.info("Applying filter options and clicking save.");
	   sa.filter();
	}
	@When("clicks the Add to cart button")
	public void clicks_the_add_to_cart_button() {
		log.info("Clicking 'Add to Cart' button.");
	    sa.addToCart();
	}
	@Then("Go to the shopping cart")
	public void shopping_cart() {
	   log.info("Navigating to the shopping cart.");
	   sa.cart();
	}
	@Then("verify the product added to the cart")
	public void verify_the_product_added_to_the_cart() {
	    String ex="Computing and Internet";
	    String ac=sa.proText();
	    Assert.assertEquals(ex,ac);
	    log.info("Product successfully added to cart and verification passed.");
	}
}
