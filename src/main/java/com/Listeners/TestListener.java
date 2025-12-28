package com.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.WebDriver;
import com.Utilities.ScreenshotUtils;
import com.QA.pages.BaseClass;

public class TestListener extends BaseClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		Object testClass = result.getInstance();
		// WebDriver driver = ((BaseClass) testClass).getDriver();
		System.out.println("Test Failed: " + result.getName());

		String testName = result.getName();

		String path = ScreenshotUtils.takeScreenshot(driver, testName);
		System.out.println("📸 Screenshot saved at: " + path);
	}

	// Optional overrides for other events
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started: " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed: " + result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped: " + result.getName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test failed but within test success %: " + result.getName());

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Suite Started: " + context.getName());

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Suite Started: " + context.getName());

	}

}
