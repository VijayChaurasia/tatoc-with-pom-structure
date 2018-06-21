package com.qait.automation.tatocpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Basic 
{
	WebDriver driver;
	public Basic(WebDriver driver)
	{
		this.driver=driver;
	}
	/*public WebDriver getdriver()
	{
		driver.get("http://10.0.1.86/tatoc");
		return new AppTest(driver);
		
	}*/
	public WebElement find_Basic_link()
	{
		
		WebElement link=driver.findElement(By.linkText("Basic Course"));
		return link;
		
	}
	
    
}
