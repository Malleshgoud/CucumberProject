package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	private By sign_link= By.linkText("Sign in");
	private By email=By.id("email");
	private By password=By.id("passwd");
	private By login_button=By.id("SubmitLogin");
	
	private By myaccount_text=By.xpath("//h1[contains(text(),'My account')]");
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void click_signIn_link()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(sign_link).click();
	}
	
	public void enterUserName(String userName)
	{
		driver.findElement(email).sendKeys(userName);
	}
	public void enterPassword(String password1)
	{
		driver.findElement(password).sendKeys(password1);
	}
	
	public void click_login()
	{
		driver.findElement(login_button).click();
	}
	
	public void login_user(String emailid,String userpwd)
	{
		
		driver.findElement(email).sendKeys(emailid);
		driver.findElement(password).sendKeys(userpwd);
		driver.findElement(login_button).click();
		
	}
	
	public void verify_user_after_login()
	{
		String actual_text=driver.findElement(myaccount_text).getText();
		String expected="My account";
		
		if(actual_text.equalsIgnoreCase(expected))
		{
			System.out.println("User is successfully login into My Store Application ---POM ");
		}
		
	
	}
	
	
}
