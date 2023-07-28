package com_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class w3schholss extends base_pg_driver{
	
	//x.path
		static By username=By.xpath("//input[@id='modalusername']");
		static By password = By.xpath("//input[@class='PasswordInput_input_field__EWMIU undefined']");
		static By login=  By.xpath("//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']");

		static By tutoril = By.xpath("//a[@id='navbtn_tutorials']");
		static By html_t = By.xpath("(//a[@title=\"HTML Tutorial\"])[1]");
		static By next_t = By.xpath("(//a[@class='w3-right w3-btn'])[1]");
		
		
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

		public static void tutorial_Click() throws Exception
		{
			Thread.sleep(3000);
		     tutorial().click();	     
		}
		 
		public static void html_tc() throws InterruptedException
		{
			Thread.sleep(3000);
			htmlt().click();
		}
	 
		public static void Nextclick()
		{
			
			Next_T().click();
			
		}



	
}
