package com.Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestUtils {

	public static String takeScreenshot(WebDriver driver, String testName) {
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		String screenshotName = testName + "_" + timeStamp + ".png";
		String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName;

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File(destination));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return destination;
	}
	public static boolean isBrokenLink(String url)
	{

		try {
			if(url==null || url.isEmpty()) {
				return false;
				}
			HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			conn.setConnectTimeout(5000);
			conn.connect();
			int ResponseCode=conn.getResponseCode();
			if(ResponseCode>=400)
			{
				System.out.println("Broken" +url+ " "+ ResponseCode);
				return true;
			}
			else
			{
				System.out.println("Valid" +url+ " "+ResponseCode);
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Error:" +url);
			return true;
		}
		return  false;
	}
	public static boolean isImageBroken(WebDriver driver, WebElement img_ele) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		Boolean isImgDisplayed=(Boolean)js.executeScript("return arguments[0].complete &&"+"typeof arguments[0].naturalWidth != 'undefined' && " +
                "arguments[0].naturalWidth > 0;", img_ele);
		
		return !isImgDisplayed;
		
	}
	
	

}
