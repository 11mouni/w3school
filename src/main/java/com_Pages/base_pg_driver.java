package com_Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_pg_driver {
	
public static WebDriver driver;
    
	public static void openurl()
	{	
		driver= new ChromeDriver();
		driver.get("https://profile.w3schools.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}
	
	public static void driver_close()
	{
		driver.quit();
	}

}
