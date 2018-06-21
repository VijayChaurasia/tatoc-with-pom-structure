package com.qait.automation.tatocpom;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class launch_popup {
	WebDriver driver;
	public launch_popup(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebDriver is_popup_launch()
	{
		driver.findElement(By.linkText("Launch Popup Window")).click();
		String main=driver.getWindowHandle();
		java.util.Set<String> sub= driver.getWindowHandles();
		Iterator<String> i1=sub.iterator();
		while(i1.hasNext())
		{
			String child=i1.next();
			if(!main.equalsIgnoreCase(child))			
	            {    		
	                    driver.switchTo().window(child);	                                                                                                           
	                    driver.findElement(By.id("name")).sendKeys("vijay");                			
	                    
	                    driver.findElement(By.id("submit")).click();			
//	                        driver.close();		
	            }		
		}
		System.out.println("Size : "+driver.getWindowHandles().size());
		driver.switchTo().window(main);
		System.out.println("Current : "+driver.getWindowHandle());
		driver.findElement(By.linkText("Proceed")).click();
		return driver;
		
	}

}
