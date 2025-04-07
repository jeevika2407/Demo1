package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class HomePage {
	@FindBy(xpath="//div[@class='topic-html-content-body']/p[1]")
	public WebElement welcomeMsg;
	
}
