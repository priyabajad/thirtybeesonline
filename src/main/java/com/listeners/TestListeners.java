package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.thirtybees.base.TestBase;

public class TestListeners extends TestBase implements ITestListener	{					

public void onTestStart(ITestResult result) {
   log.info("Test case is starting with name: "+result.getName());
}

public void onTestSuccess(ITestResult result) {
	  log.info("Test case is passed  with name: "+result.getName());
	
}

public void onTestFailure(ITestResult result) {
	log.info("Test case is failed  with name: "+result.getName());
//	getScreenshot(result.getName());
	log.info("screenshot captured for failed testcases");
		
}

public void onTestSkipped(ITestResult result) {
	
	log.info("Test case is skipped with name: "+result.getName());
}


public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
}

public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
}
}