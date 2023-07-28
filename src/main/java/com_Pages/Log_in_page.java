package com_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Log_in_page extends base_pg_driver {
	//x.path
	static By username=By.xpath("//input[@id='modalusername']");
	static By password = By.xpath("//input[@class='PasswordInput_input_field__EWMIU undefined']");
	static By login=  By.xpath("//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']");

	//webelemt
	public static WebElement userelement() 
	{

		return driver.findElement(username);
		
	}

	public static WebElement passwordelement() 
	{
		return driver.findElement(password);
		
	}

	public static WebElement loginelement() 
	{
		return driver.findElement(login);
			
	}
	
	
	//action
	public static void User()
	{
		userelement().sendKeys("deardad100@gmail.com");
	}
	
	public static void password()
	{
		passwordelement().sendKeys("Vijay@100");
	}
	
	public static void click()
	{
		loginelement().click();
	}



}
