package com.actions;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pages.LoginPage;
import com.pages.SearchPage;
import com.utils.HelperClass;
public class SearchActions {
    File file;
    FileInputStream fis;
    Properties prop;
    SearchPage sp=null;
    public SearchActions(){
    	this.sp=new SearchPage();
    	PageFactory.initElements(HelperClass.getDriver(),sp);
       try {
            file=new File("C:\\Users\\kirub\\Documents\\DemoWebShop_Task\\DemoWebShop_Task\\src\\test\\resources\\SearchOptions.properties");
            fis=new FileInputStream(file);
            prop=new Properties();
            prop.load(fis);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void searchh() {
    	String sv=prop.getProperty("search");
    	sp.search.sendKeys(sv+Keys.ENTER);
    }
    public void filter() {
    	sp.advanceSet.click();
    	sp.from.sendKeys(prop.getProperty("from"));
    	sp.to.sendKeys(prop.getProperty("to"));
    	Select s=new Select(sp.dd);
    	String t1=prop.getProperty("category");
    	String t2=prop.getProperty("sort");
    	s.selectByVisibleText(t1);
    	sp.submit.click();
    	Select ss=new Select(sp.sort);
    	ss.selectByVisibleText(t2);
    }
    public void addToCart() {
    	sp.addToCart.click();
    }
    public void cart() {
    	sp.cartLink.click();
    }
    public String proText() {
    	return sp.pro.getText();
    }
}
