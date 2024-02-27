package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login {
	
	@Given("I launch the application in chrome browser")
	public void launchApp() {
		System.out.println("application is launched");
	}
	
	@When("I enter valid user name and password")
	public void enterCredentials() {
		System.out.println("entered valid username and password");
	}

}
