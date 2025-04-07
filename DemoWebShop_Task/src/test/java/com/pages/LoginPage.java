package com.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LoginPage{
@FindBy(xpath="//input[@id=\"Email\"]")
public WebElement email;

@FindBy(xpath="//input[@id=\"Password\"]")
public WebElement pword;

@FindBy(xpath="//input[@class=\"button-1 login-button\"]")
public WebElement login;

@FindBy(xpath="//div[@class='validation-summary-errors']/ul")
public WebElement error;
}
