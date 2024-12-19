package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	public ChromeDriver driver;
	
	
	@Given("Launch the browser")
	public void launch_the_browser() {
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	}
	@Given("Load the url")
	public void load_the_url() {
	   driver.get("http://leaftaps.com/opentaps/control/main");
	}
	
	@When("Enter the username as {string}")
	public void enter_the_username_as_demosalesmanager(String username) {
	    driver.findElement(By.id("username")).sendKeys(username);
	}
	
	
	@When("Enter the password as {string}")
	public void enter_the_password_as_crmsfa(String password) {
	    driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("Click the Login button")
	public void click_the_login_button() {
	   driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@When("It throws error message")
	public void it_throws_error_message() {
	    System.out.println("Throws error message");
	}

	@Then("It should navigate to the next page")
	public void it_should_navigate_to_the_next_page() {
		 WebElement findElement = driver.findElement(By.xpath("//h2[text()='Welcome ']"));
		 String text = findElement.getText();
		 if (text.contains("Welcome")) {
			System.out.println("Page is navigated");
		}
		 else {
			 System.out.println("Page is not navigated");
		 }
		 
	}

}
