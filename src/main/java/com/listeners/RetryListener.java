package com.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer {
	int count;
	int maxCount;
	public boolean retry(ITestResult result) {
		
		if(count<maxCount) {
			count++;
			return true;
		}
		return false;
	}

}
