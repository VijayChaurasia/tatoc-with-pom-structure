package com.qait.automation.tatocpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	WebDriver driver;
	public draganddrop(WebDriver driver)
	{
		this.driver=driver;
	}
	public String  perform_drag_and_drop()
	{
		WebElement from=driver.findElement(By.id("dragbox"));
		WebElement to=driver.findElement(By.id("dropbox"));
		Actions builder=new Actions(driver);
		builder.clickAndHold(from).moveToElement(to).release(to).build().perform();
		driver.findElement(By.linkText("Proceed")).click();
		String url1=driver.getCurrentUrl();
		return url1;
		
		
		
		
	}

}
