package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class logindata {
	WebDriver driver;
	@Given("^the user should navigate to the application$")
	public void the_user_should_navigate_to_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^the user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_and(String arg1, String arg2) throws Throwable {
		 WebElement username = driver.findElement(By.name("username"));
		   username.sendKeys(arg1);
		   WebElement password = driver.findElement(By.name("password"));
		   password.sendKeys(arg2);
	}

	@When("^when the user login$")
	public void when_the_user_login() throws Throwable {
		 WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		   login.click();
	}

	@Then("^the user should be able to see the dashboard page$")
	public void the_user_should_be_able_to_see_the_dashboard_page() throws Throwable {
		WebElement text = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img"));
		 Boolean status =  text.isDisplayed();
		 Assert.assertTrue(status);
		 }
	}


