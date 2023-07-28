package StepDef;

import com_Pages.base_pg_driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class cucumber_basePage {
	@Before
	public static void driver_call()
	{
		base_pg_driver.openurl();
	}
	
	@After
	public static void driverClose()
	{
		base_pg_driver.driver_close();
	}

}
