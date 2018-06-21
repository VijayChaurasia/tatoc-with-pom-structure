package com.qait.automation.tatocpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class color_matching {
	WebDriver driver;
	color_matching(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebDriver find_correct_color()
	{
		boolean flag=true;
		driver.switchTo().frame("main");
		String s1=driver.findElement(By.xpath("//*[text()[contains(.,'Box 1')]]")).getAttribute("class");
		while(flag)
		{
			driver.switchTo().frame("child");
			String s2=driver.findElement(By.xpath("//*[text()[contains(.,'Box 2')]]")).getAttribute("class");
			driver.switchTo().defaultContent();
			driver.switchTo().frame("main");
			if(s1.equals(s2))
			{
				flag=false;
				//driver.findElement(By.xpath("//*[text()[contains(.,'Proceed')]]")).click();;
			}
			else
			{
				driver.findElement(By.xpath("//*[text()[contains(.,'Repaint Box 2')]]")).click();
			}
		}
		
		driver.switchTo().defaultContent();
		return driver;
	}
	

}
