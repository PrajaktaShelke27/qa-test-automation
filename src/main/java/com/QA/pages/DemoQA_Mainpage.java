package com.QA.pages;

import java.time.Duration;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQA_Mainpage extends BaseClass {
	
	@FindBy (xpath="//img[contains(@class, 'banner-image')]")
	WebElement bannerimg;
	@FindBy (xpath="//div[ \"div#card-body\"]//following::h5[contains(text(),\"Elements\")]")
	WebElement element;
	@FindBy (xpath="//div[ \"div#card-body\"]//following::h5[contains(text(),\"Forms\")]")   //div[ "div#card-body"]//following::h5[contains(text(),"Elements")]);
	WebElement formwe;
	
	public DemoQA_Mainpage()
	{
		PageFactory.initElements(driver, this);

	}
	
	//div[ "div#card-body"]//following::h5[contains(text(),"Forms")]
	public String getimgsrc()
	{
		return bannerimg.getAttribute("src");
	}
	
	public boolean validatelogo()
	{
		return bannerimg.isDisplayed();
	}
	
	public ElementPage ValidateElePage()
	{
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);  
		//behavior: 'smooth', block: 'nearest'

		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		//element.click();
		return new ElementPage();

		
	}
}

