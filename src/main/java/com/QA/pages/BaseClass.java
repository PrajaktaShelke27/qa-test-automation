package com.QA.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	protected static WebDriver driver;
	protected static Properties prop;

	public BaseClass() {

		try {
			prop = new Properties();
			FileInputStream is = new FileInputStream(
					"\\Users\\Shri sai\\Documents\\PrajaktaS\\AutomationTesting\\TestAutomation\\src\\main\\java\\com\\QA\\config\\config.properties");
			prop.load(is);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//@SuppressWarnings("deprecation")
	public static void initialization() {
		try {
			String browsername = prop.getProperty("browser");
			if (browsername.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", prop.getProperty("chromedriverpath"));
				driver = new ChromeDriver();
			} else if (browsername.equals("FF")) {
				System.setProperty("webdriver.gecodriver.driver", prop.getProperty("ffdriverpath"));
				driver = new FirefoxDriver();

			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(prop.getProperty("url"));

		} catch (TimeoutException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public WebDriver getdriver() {
		return driver;
	}
}
