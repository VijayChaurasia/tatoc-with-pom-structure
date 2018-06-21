package com.qait.automation.tatocpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class green_box {
	WebDriver driver;
	public green_box(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public String find_green_box()
	{
		String text=driver.findElement(By.className("greenbox")).getAttribute("class");
		return text;
	}
	

}
