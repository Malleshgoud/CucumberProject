package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginHooksSteps {

	WebDriver driver;
	
	@Before 
	public void browserSetup()
	{
		System.out.println("I am inside - browserSetup()");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		
		
	}
	
	@After
	public void tearDown()
	{
		driver.close();
		driver.quit();
		System.out.println("i am inside tearDown()");
	}
	

	@BeforeStep

	public void beforestep()
	{
		System.out.println("before step");
	}
	
	@AfterStep
	
	public void afterstep()
	{
		System.out.println("After step");
	}
	
@Given("user is on login page Hook")
public void user_is_on_login_page_hook() {
}

@When("user enters valid username and password")
public void user_enters_valid_username_and_password() {
   
}

@And("user clicks on login button")
public void user_clicks_on_login_button() {
   
}

@Then("user navigate to homepage")
public void user_navigate_to_homepage() {
   
}

}
