package com.qait.automation.tatocpom;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	Basic basic_link;
	green_box box;
	color_matching match;
	draganddrop drop;
	launch_popup popup;
	@Test(priority=0)
	public void islinkcorrect()
	{
		WebElement basic2=basic_link.find_Basic_link();
		String linktext=basic2.getText();
		
		Assert.assertEquals("Basic Course",linktext);
		basic2.click();
		box=new green_box(driver);
		
		
	}
	@Test(priority=1)
	public void isGreenBox()
	{
		String actual=box.find_green_box();
		Assert.assertEquals("greenbox", actual);
		driver.findElement(By.className("greenbox")).click();
		match=new color_matching(driver);	
	}
	@Test(priority=2)
	public void isboxmatched()
	{
		driver=match.find_correct_color();
		driver.switchTo().frame("main");
		String s1=driver.findElement(By.xpath("//*[text()[contains(.,'Box 1')]]")).getAttribute("class");
		driver.switchTo().frame("child");
		String s2=driver.findElement(By.xpath("//*[text()[contains(.,'Box 2')]]")).getAttribute("class");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("main");
		Assert.assertEquals(s1,s2);
		driver.findElement(By.linkText("Proceed")).click();
		driver.switchTo().defaultContent();
		drop=new draganddrop(driver);
		
	}
	@Test(priority=3)
	public void isdragperformed()
	{
		String acturl=drop.perform_drag_and_drop();
		Assert.assertEquals("http://10.0.1.86/tatoc/basic/windows", acturl);
		popup=new launch_popup(driver);
		
	}
	@Test(priority=4)
	public void is_window_popped()
	{
		driver=popup.is_popup_launch();
		Assert.assertEquals("http://10.0.1.86/tatoc/basic/cookie", driver.getCurrentUrl());
		
		
	}
	
	
	
	
	
	
	
	
	@BeforeClass
	  public void launchBrowser(){
	      driver = new ChromeDriver();
	      driver.get("http://10.0.1.86/tatoc");
	      basic_link = new Basic(driver);
	  }
	  
	  @AfterClass
	  public void closeBrowser(){
	    // driver.quit();
	  }
	
	
    
}