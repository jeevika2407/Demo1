package com.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class SearchPage {
	@FindBy(xpath="//input[@id=\"small-searchterms\"]")
	public WebElement search;
	
	@FindBy(xpath="//input[@id=\"As\"]")
	public WebElement advanceSet;
	
	@FindBy(xpath="//input[@id='Pf']")
	public WebElement from;
	
	@FindBy(xpath="//input[@id='Pt']")
	public WebElement to;
	
	@FindBy(xpath="//select[@id=\"Cid\"]")
	public WebElement dd;
	
	@FindBy(xpath="//input[@class=\"button-1 search-button\"]")
	public WebElement submit;

	@FindBy(xpath="//select[@id=\"products-orderby\"]")
	public WebElement sort;
	
	@FindBy(xpath="(//input[@class=\"button-2 product-box-add-to-cart-button\"])[1]")
	public WebElement addToCart;
	
	@FindBy(xpath="(//span[@class=\"cart-label\"])[1]")
	public WebElement cartLink;
	
	@FindBy(xpath="//a[@class=\"product-name\"]")
	public WebElement pro;
	
	
	
}
