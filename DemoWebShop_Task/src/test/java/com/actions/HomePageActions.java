package com.actions;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.pages.HomePage;
import com.utils.HelperClass;
public class HomePageActions {
	HomePage hp=null;
	public HomePageActions() {
		this.hp=new HomePage();
		PageFactory.initElements(HelperClass.getDriver(), hp);
	}
	// hp=new HomePage();
	public String getHomeText() {
	    try {
	        return hp.welcomeMsg.getText();
	    }
	    catch(StaleElementReferenceException e) {
	        WebElement welcomeMsg=HelperClass.getDriver().findElement(By.xpath("//div[@class='topic-html-content-body']/p[1]"));
	        return welcomeMsg.getText();
	    }
	}

}
