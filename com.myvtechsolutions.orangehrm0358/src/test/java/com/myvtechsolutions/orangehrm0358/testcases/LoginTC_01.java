package com.myvtechsolutions.orangehrm0358.testcases;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myvtechsolutions.orangehrm0358.page_object.LoginPage;
import com.myvtechsolutions.orangehrm0358.testbase.TestBase;




public class LoginTC_01 extends TestBase {
	
	 LoginPage lp;

	@Test
	public void loginTC_01(){
		
		
		 lp = new LoginPage(driver);
		lp.setUserName(configDataProvider.getUserName());
		
		lp.setPassword(configDataProvider.getPassword());
	
		lp.clickLoginButton();
		if(driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText().equals("PIM")) {
			
			Assert.assertTrue(true);
			System.out.println("Login Success");
			
		}
		else {
			System.out.println("Login Failed");
			Assert.assertTrue(false);
		}
		
		
		

	}

	

	@Test(priority = 2)
	public void verifyloginpageTitle() {
		if (driver.getTitle().equals("OrangeHRM")) {
			Assert.assertTrue(true);
			System.out.println("Title is verified");

		} else {
			System.out.println("Title is not verified");
			Assert.assertTrue(false);

		}

	}
	@Test(priority = 5)
	public void verifyForgotLinkPassword() {
		
		lp.clickForgotPassword();

	}
	
	
}
