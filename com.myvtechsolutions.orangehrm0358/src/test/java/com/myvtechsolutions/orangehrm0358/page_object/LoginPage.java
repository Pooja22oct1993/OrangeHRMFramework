package com.myvtechsolutions.orangehrm0358.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	// Repository
	@FindBy(xpath = "//input[@placeholder='Username']")
	
	WebElement txtUsername;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement txtPassword;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement btnLogin;
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	WebElement forgotElement; 

	
	public LoginPage(WebDriver driver) {
      this.driver = driver;
		PageFactory.initElements(driver, this);
		}

	

	public  void setUserName(String username) {
		try {
			txtUsername.clear();
			txtUsername.sendKeys(username);

		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	public void setPassword(String password) {
		try {
			txtPassword.clear();
			txtPassword.sendKeys(password);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void clickLoginButton() {
		try {
			btnLogin.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void clickForgotPassword() {
		try {forgotElement.click();
			
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
