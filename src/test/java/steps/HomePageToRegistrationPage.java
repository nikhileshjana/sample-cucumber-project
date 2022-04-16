package steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageToRegistrationPage {
	
	WebDriver driver = null;
	
	@Given("I am on home page")
	public void i_am_on_home_page() {
		System.setProperty("webdriver.chrome.driver", "seleniumdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://localhost:4200/");
	}

	@When("I click on Register button")
	public void i_click_on_register_button() {
		System.out.println("Listing out elems");
//		driver.findElement(By.partialLinkText("Register")).click();
		List<WebElement> webElemList = driver.findElements(By.tagName("button"));
		for(final WebElement webElem: webElemList) {
			if(webElem.getText().contains("Register")) {
				webElem.click();
				break;
			}
		}
	}

	@Then("I am taken to register page")
	public void i_am_taken_to_register_page() {
	    System.out.println("Current URL--> " + driver.getCurrentUrl());
	    driver.close();
	}
}
