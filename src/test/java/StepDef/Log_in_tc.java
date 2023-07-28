package StepDef;

import Utility.Common_methoD;
import Utility.Validation;
import com_Pages.Constant_Method;
import com_Pages.Log_in_page;
import com_Pages.Tutorials;
import com_Pages.base_pg_driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Log_in_tc {

	@Given("w3schools login Page")
	public void w3schools_login_page() throws Exception {
		Common_methoD.currentURL();
		Validation.IsTrue(Common_methoD.currentURL(), Constant_Method.homepageurl, "home page is not display");
		//Validation.IsDsiplayed(Log_in_page., null);
	}

	@Given("enter email")
	public void enter_email() {
		Log_in_page.User();
		
		
	}

	@Given("enter password")
	public void enter_password() {
		Log_in_page.password();
	}

	@Given("click login")
	public void click_login() {
		Log_in_page.click();
		
	}
	
	@Then("I logout")
	public void i_logout() {
		base_pg_driver.driver_close();
	}
	
	
	

	

}
