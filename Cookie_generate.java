package com.qait.automation.tatocpom;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class Cookie_generate {
	WebDriver driver;
	public Cookie_generate(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebDriver generate_token()
	{
		driver.findElement(By.linkText("Generate Token")).click();
		String Token = driver.findElement(By.id("token")).getText();
		 System.out.println(Token);
		 String substring1=Token.substring(7);
		 Cookie_generate name = new Cookie_generate("Token", substring1);
		 driver.manage().addCookie(name);
         driver.findElement(By.linkText("Proceed")).click(); 
         return driver;
	}
	

}
