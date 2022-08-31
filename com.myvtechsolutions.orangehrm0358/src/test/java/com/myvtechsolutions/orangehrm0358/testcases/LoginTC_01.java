package com.myvtechsolutions.orangehrm0358.testcases;

import java.awt.peer.LabelPeer;
import java.time.Duration;
import java.util.Set;

import org.apache.poi.poifs.property.Parent;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myvtechsolutions.orangehrm0358.page_object.LoginPage;
import com.myvtechsolutions.orangehrm0358.testbase.TestBase;

import net.bytebuddy.agent.builder.AgentBuilder.Default.NativeMethodStrategy.Disabled;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class LoginTC_01 extends TestBase {

	@Test()
	public void LoginTest(){
		
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName("Admin");
		
		lp.setPassword("admin123");
	
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
		LoginPage lPage =new LoginPage(driver);
		lPage.clickForgotPassword();

	}
	@Test(priority =1 )
	public void swichingMultipleWindow() {
		driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']"));
		driver.findElement(By.xpath("(//*[name()='svg'][@role='presentation'])[2]"));
		driver.findElement(By.xpath("(//*[name()='path'][@class='st0'])[3]"));
		driver.findElement(By.xpath("(//*[name()='svg'][@role='presentation'])[4]"));
		
		
		
	String Parentwindowid = driver.getWindowHandle();
	System.out.println(driver.getTitle());
	if (driver.getTitle().equals(Parentwindowid)) {
		Assert.assertTrue(true);
		System.out.println("parent window id is verified");
		
	}
	else {System.out.println("parent window id is not verified");
		Assert.assertFalse(false);
	}
	Set<String> windowsid = driver.getWindowHandles();
		
		
		
	}
	
	
	
	
	
}
