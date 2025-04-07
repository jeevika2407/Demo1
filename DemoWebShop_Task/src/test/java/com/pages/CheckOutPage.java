package com.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class CheckOutPage {
	@FindBy(xpath="//select[@id=\"CountryId\"]")
	public WebElement cId;
	@FindBy(id="termsofservice")
	public WebElement terms;
	@FindBy(id="checkout")
	public WebElement ckout;
	@FindBy(id="BillingNewAddress_City")
	public WebElement add1;
	@FindBy(id="BillingNewAddress_Address2")
	public WebElement add2;
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	public WebElement zip;
	@FindBy(id="BillingNewAddress_PhoneNumber")
	public WebElement ph;
	@FindBy(id="BillingNewAddress_FaxNumber")
	public WebElement fax;
	@FindBy(id="BillingNewAddress_City")
	public WebElement city;
	@FindBy(xpath="//div[@id=\"billing-buttons-container\"]/input")
	public WebElement cont;
	
	
}
