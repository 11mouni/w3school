package StepDef;

import com_Pages.Log_in_page;
import com_Pages.Tutorials;
import io.cucumber.java.en.Given;

public class tutorial_html {
	@Given("I am at the w3schools home page to login as prerequsite")
	public void i_am_at_the_w3schools_home_page_to_login_as_prerequsite() {
		Log_in_page.User();
		Log_in_page.password();
		Log_in_page.click();
	}

	@Given("I click on tutorials")
	public void i_click_on_tutorials() {
		Tutorials.tutorial_Click();

	}

	@Given("I click on learn html")
	public void i_click_on_learn_html() {
		Tutorials.html_tc();

	}

	@Given("I click on next")
	public void i_click_on_next() {
		Tutorials.Nextclick();

	}

}
