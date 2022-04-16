package steps;

import static org.junit.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage_Steps {
	WebDriver driver = null;
	
	@Given("I launch the browser")
	public void i_launch_the_browser() {
		System.setProperty("webdriver.chrome.driver", "seleniumdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://localhost:4200/");
	    System.out.println("Browser launched successfully");
	}

	@When("I paste home page URL")
	public void i_paste_home_page_url() {
		System.out.println(driver.getCurrentUrl());
		if(!driver.getCurrentUrl().endsWith("/welcome")) {
			fail("Navigation to desired URL failed.");
		}
	}

	@Then("The application redirects to welcome page")
	public void the_application_redirects_to_welcome_page() {
		driver.close();
	}
}
