package com.utils;
import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class HelperClass {
	private static HelperClass helperClass;
	private static WebDriver driver;
	private static WebDriverWait wait;
	public final static int TIMEOUT=10;
	public static final Logger log=LogManager.getLogger(HelperClass.class);
	HelperClass(){
		driver=new ChromeDriver();
		wait=new WebDriverWait(driver,Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
	}
	public void openPage(String url){
		log.info("Opening the Browser");
		driver.get(url);
	}
	public static WebDriver getDriver(){
		return driver;
	}
	public static void setDriver(){
		if(helperClass==null){
			helperClass=new HelperClass();
		}
	}
	public static void tearDown(){
		if(driver!=null){
			log.info("Closing the Browser");
			//driver.close();
			driver.quit();
			driver=null;
		}
		helperClass=null;
	}
}
