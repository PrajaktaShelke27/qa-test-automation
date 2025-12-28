package com.test.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.QA.pages.BaseClass;
import com.QA.pages.DemoQA_Mainpage;

public class Mainpage_Testcases extends BaseClass {

	DemoQA_Mainpage DM;

	public Mainpage_Testcases() {
		super();
	}
@BeforeTest
public void checkBT()
{
	System.out.print("Before Test");
}
	
	@BeforeMethod
	public void setup() {
		initialization();
		DM = new DemoQA_Mainpage();

	}

	@Test
	public void validatelogoimg() {
		boolean flag = DM.validatelogo();
		Assert.assertTrue(flag);
		String imgstrexp = "https://demoqa.com/images/WB.svg";
		String imgstract = DM.getimgsrc();
		System.out.println("Img is visible img name is:" + imgstract);
		Assert.assertEquals(imgstrexp, imgstract);
	}

	@Test
	public void validateEle_pageClick() {
		DM.ValidateElePage();
		System.out.println("Page click successful");
	}
	
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@AfterTest
	public void checkAT()
	{
		System.out.print("After Test");
	}

}
