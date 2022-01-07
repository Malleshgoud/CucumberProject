package com.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.pageFactory.HomePage_PF;
import com.pageFactory.LoginPage_PageFactory;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_TestProjStep {

	WebDriver driver;
	
	LoginPage_PageFactory loginfact;
	HomePage_PF homepagePf;
	
	@Given("User is on testProjectApp")
	public void user_is_on_test_project_app() {
	
		System.out.println("step1");
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://example.testproject.io/web/");
		driver.manage().window().maximize();

		System.out.println("executed-launchBrowser()-Mallesh");
	}
	
	
	@When("^User should enters (.*) and (.*)$")
	public void login_username_password(String username,String password) {
		System.out.println("step2");
		loginfact=new LoginPage_PageFactory(driver);
		loginfact.user_login(username,password);
	}

	@And("User clicks on login button in testProject App")
	public void user_clicks_on_login_button_in_test_project_app() {
		System.out.println("step3");
		
		loginfact.click_login_button();
	}

	@Then("User should be navigate testProject App home page")
	public void user_should_be_navigate_test_project_app_home_page() {
		System.out.println("step4");
		homepagePf=new HomePage_PF(driver);
		homepagePf.validate_logout_display();
	}
	
	
}
