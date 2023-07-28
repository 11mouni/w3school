package com_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utility.Validation;

public class Tutorials extends base_pg_driver{
	
	//x.path
	static By tutoril = By.xpath("//a[@id='navbtn_tutorials']");
	static By html_t = By.xpath("(//a[@title=\"HTML Tutorial\"])[1]");
	static By next_t = By.xpath("(//a[@class='w3-right w3-btn'])[1]");
	
	
	//webelement
	public static WebElement tutorial()
	{
		return driver.findElement(tutoril);		
	}
	
	public static WebElement htmlt()
	{
		return driver.findElement(html_t);
		
	}
	
	public static WebElement Next_T()
	{
		return driver.findElement(next_t);
		
	}
	
	//action
	public static void tutorial_Click()
	{
	     tutorial().click();	     
	}
	 
	public static void html_tc()
	{
		htmlt().click();
	}
 
	public static void Nextclick()
	{
		Next_T().click();
		
	}
}
