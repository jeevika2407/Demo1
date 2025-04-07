package com.utils;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.internal.annotations.IListeners;
public class Listeners implements ITestListener{
  public void onTestStart(ITestResult res) {
	  System.out.println("Started: "+res.getName());
  }
  public void onTestSuccess(ITestResult res) {
	  System.out.println("Passed: "+res.getName());
  }
  public void onTestFailure(ITestResult res) {
	  System.out.println("Failed: "+res.getName());
  }
  public void onTestSkipped(ITestResult res) {
	  System.out.println("Skipped: "+res.getName());
  } 
}
