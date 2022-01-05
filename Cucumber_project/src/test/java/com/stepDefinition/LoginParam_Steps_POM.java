package com.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.LoginPage;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginParam_Steps_POM {
	
	WebDriver driver;
	LoginPage loginpage;
	
@Given("User is on my store home page")
public void launch_browser() {
   
	//ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		System.out.println("executed-launchBrowser()-Mallesh");
		
		
	
}

@When("User clicks on login button")
public void user_clicks_on_login_button() {
	
	//driver.findElement(By.linkText("Sign in")).click();
	loginpage=new LoginPage(driver);
	loginpage.click_signIn_link();
	
	
	System.out.println("executed-click_signIn()");
}

@When("^User enters (.*) and (.*)$")
public void user_enters_username_and_password(String username,String password) {
    
//driver.findElement(By.id("email")).sendKeys(username);
	
	//driver.findElement(By.id("passwd")).sendKeys(password);
	
	//driver.findElement(By.id("SubmitLogin")).click();
	loginpage=new LoginPage(driver);
	loginpage.login_user(username, password);
	
}

@Then("User should be navigate my store index page")
public void user_should_be_navigate_my_store_index_page() {
	loginpage=new LoginPage(driver);
	loginpage.verify_user_after_login();
	driver.close();
}



	
}
