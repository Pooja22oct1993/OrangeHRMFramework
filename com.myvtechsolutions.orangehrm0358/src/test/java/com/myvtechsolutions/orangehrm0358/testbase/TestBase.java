package com.myvtechsolutions.orangehrm0358.testbase;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.myvtechsolutions.orangehrm0358.utility.ConfigDataProvider;
import com.myvtechsolutions.orangehrm0358.utility.ConstantVariable;
import com.myvtechsolutions.orangehrm0358.utility.ExcelDataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public WebDriver driver;
	public static ConfigDataProvider configDataProvider;
	
	
	@BeforeSuite
	public void init() {
		configDataProvider=new ConfigDataProvider(ConstantVariable.configdatapath);
	}
	
	
	

	@BeforeTest
	@Parameters({ "brname" })
	public void setUp(@Optional("Chrome") String browser, String url) {

		if (browser.equals("Chrome")) {
			//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();

		} else if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			//WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		} else {
			System.out.println("browser exe doesn't match with require browser");
		}
		driver.manage().window().maximize();
		driver.get(configDataProvider.getAppUrl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.getCurrentUrl());
	}
	
	

	@AfterTest

	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();

	}

}
