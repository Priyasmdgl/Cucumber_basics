package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Opengoogle {
	WebDriver driver;
	
	@Given("^user navigates to Google\\.com$")
	public void user_navigates_to_Google_com() throws Throwable {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.navigate().to("https://www.google.com/");
	}

	@When("^the user enters the search term \"([^\"]*)\"$")
	public void the_user_enters_the_search_term(String arg1) throws Throwable {
	   WebElement searchbox = driver.findElement(By.name("q"));
	   searchbox.sendKeys(arg1);
	}

	@When("^click on search button$")
	public void click_on_search_button() throws Throwable {
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys(Keys.ENTER);
	}

	@Then("^the user should get the results for Dindigul$")
	public void the_user_should_get_the_results_for_Dindigul() throws Throwable {
		WebElement result = driver.findElement(By.partialLinkText("Land of Locks and Tannery"));
		Boolean status = result.isDisplayed();
		if(status) {
			System.out.println("success");
		}
	    
	}


}
