package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class cucumberoptions {
	WebDriver driver;
	@Given("^the user should open chrome browser$")
	public void the_user_should_open_chrome_browser() throws Throwable {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		   driver = new ChromeDriver();
		   
	}

	@When("^the user gives the url to navigate$")
	public void the_user_gives_the_url_to_navigate() throws Throwable {
		driver.navigate().to("https://www.google.com/");
	}

	@When("^the user selects tamil$")
	public void the_user_selects_tamil() throws Throwable {
	  WebElement tamil = driver.findElement(By.linkText("தமிழ்"));
	  tamil.click();
	}

	@Then("^the user should the page in tamil$")
	public void the_user_should_the_page_in_tamil() throws Throwable {
	   WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[2]"));
	   Boolean status = element.isDisplayed();
	  // Assert.assertEquals("அதிர்ஷ்டம் என் பக்கம்", "அதிர்ஷ்டம் என் பக்கம்");
	   Assert.assertTrue(status);
		/*
		 * if(status) { System.out.println("successfully launched google"); }
		 */
	}

}
