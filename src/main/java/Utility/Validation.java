package Utility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Validation {
	public static void IsTrue(String actual, String Exepected, String Message)throws Exception
	{

		if(!actual.equals(Exepected))
		{
			throw new Exception(Message);
		}
	}

	public static void IsDsiplayed(WebElement webElement, String Message) throws Exception
	{

		if(!webElement.isDisplayed())
		{
			throw new Exception(Message);
		}
	}

	public static boolean IsDropdownOptionFound(Select dropdown, String optionValue)
	{
		boolean flag=false;

		List<WebElement> ele_AllOptions = dropdown.getOptions();


		for(WebElement ele:ele_AllOptions)
		{
			String eleOptionValue = ele.getText().trim();
			if(optionValue.equals(eleOptionValue))
			{
				flag=true;
				break;
			}
		}

		return flag;

	}


}
