package com.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

	WebDriver driver;

@Given("User is on home page")
public void launchBrower() {
   
	//ChromeOptions chromeOptions = new ChromeOptions();
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();

	System.out.println("executed-launchBrowser()");
	
	
}

@When("User click on Login button")
public void click_signIn() {
   
	//boolean results = driver.findElement(By.xpath("//div[@class='header_user_info']//a")).isDisplayed();

	//Assert.assertTrue(results);

	driver.findElement(By.linkText("Sign in")).click();
	System.out.println("executed-click_signIn()");
	
}


@And("User enter UserName and Password")
public void login_test() {
   
	driver.findElement(By.id("email")).sendKeys("mallesh@gmail.com");
	
	driver.findElement(By.id("passwd")).sendKeys("admin@123");
	
	driver.findElement(By.id("SubmitLogin")).click();
}



@Then("User should be navigate Index page")
public void user_should_be_navigate_index_page() {
   
	
	String actual_text=driver.findElement(By.xpath("//h1[contains(text(),'My account')]")).getText();
	String expected="My account";
	
	if(actual_text.equalsIgnoreCase(expected))
	{
		System.out.println("User is successfully logged In");
	}
	
	driver.close();
	
}

	
	
	
}
