package steps;

import io.cucumber.java.en.Given;

public class Login {
	
	@Given("I launch the application in chrome browser")
	public void launchApp() {
		System.out.println("application is launched");
	}

}
