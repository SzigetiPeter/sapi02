package ro.sapientia.mesteri2015.test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SCRUMDeleteCheckerDefinition {
	
	protected WebDriver driver;
	private String deleteID = "story-1";

	@Before
	public void setup() {
		driver = new FirefoxDriver();
	}
	
	@Given("^I select an existing story$")
	public void I_select_an_existing_story() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://localhost:8080/");
	}

	@When("^I press the delete button$")
	public void I_press_the_delete_button() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		WebElement addButton = driver.findElement(By.id(deleteID));
		addButton.click();
		//driver.wait(1000);
		WebElement updateButton = driver.findElement(By.id("delete-story-link"));
		updateButton.click();
		
		
		WebElement deleteStoryButton = driver.findElement(By.id("delete-story-button"));
		deleteStoryButton.click();
	}

	@Then("^I should see the updated story list$")
	public void I_should_see_the_updated_story_list() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		WebElement addButton = driver.findElement(By.id(deleteID));
		driver.close();
	}
	
	@After
	public void closeBrowser() {
		driver.quit();
	}


}
