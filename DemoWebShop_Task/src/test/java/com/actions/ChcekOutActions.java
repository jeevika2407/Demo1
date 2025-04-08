package com.actions;
import com.utils.*;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.CheckOutPage;
import com.pages.HomePage;
import com.utils.HelperClass;
public class ChcekOutActions {
CheckOutPage cp=null;
public ChcekOutActions() {
	this.cp=new CheckOutPage();
	PageFactory.initElements(HelperClass.getDriver(), cp);
}
public void chcekout(String coun) {
	Select s=new Select(cp.cId);
	s.selectByVisibleText(coun);
	cp.terms.click();
}
public String verify(){
	String tit=HelperClass.getDriver().getTitle();
	return tit;
}
public void click() {
	cp.ckout.click();
}
public void addressFilling() throws IOException, InterruptedException{
	String[] data =ExcelReader.getCheckoutData("C:/Users/kirub/Downloads/AddressBilling.xlsx", "Sheet1",0);
	String city=data[0];
	String add1=data[1];
	String add2=data[2];
	String zip=data[3];
	String mob=data[4];
	String fax=data[5];
	Thread.sleep(3000);
	WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(20));
	WebElement add= wait.until(ExpectedConditions.elementToBeClickable(By.id("BillingNewAddress_City")));
	add.sendKeys(add1);
	cp.add2.sendKeys(add2);
	cp.fax.sendKeys(fax);
	cp.zip.sendKeys(zip);
	cp.ph.sendKeys(mob);
	cp.city.sendKeys(city);
	cp.cont.click();
}
}
