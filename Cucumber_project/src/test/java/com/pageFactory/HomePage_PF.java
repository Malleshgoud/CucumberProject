package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
	
	@FindBy(id="logout")
	WebElement logout_button;
	
WebDriver driver;
	
public HomePage_PF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, HomePage_PF.class);
		
	}

public void  validate_logout_display()
{
	logout_button.isDisplayed();
}
	
	

}
