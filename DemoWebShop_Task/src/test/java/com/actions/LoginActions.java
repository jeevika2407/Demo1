package com.actions;
import org.openqa.selenium.support.PageFactory;
import com.pages.LoginPage;
import com.utils.HelperClass;
public class LoginActions {
LoginPage lp=null;
public LoginActions(){
	this.lp=new LoginPage();
	PageFactory.initElements(HelperClass.getDriver(),lp);
}
public void setUsername(String un) {
	lp.email.sendKeys(un);
}
public void setPassword(String pw) {
	lp.pword.sendKeys(pw);
}
public void click() {
	lp.login.click();
}
public String getError(){
	return lp.error.getText();
}
}
