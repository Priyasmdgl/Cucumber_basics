package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginpage {
	WebDriver driver;
	@Given("^the user should go to the login page of the application$")
	public void the_user_should_go_to_the_login_page_of_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^the user enters the correct username and password$")
	public void the_user_enters_the_correct_username_and_password() throws Throwable {
	   WebElement username = driver.findElement(By.name("username"));
	   username.sendKeys("Admin");
	   WebElement password = driver.findElement(By.name("password"));
	   password.sendKeys("admin123");
	}

	@When("^clicks on the login button$")
	public void clicks_on_the_login_button() throws Throwable {
	   WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	   login.click();
	}

	@Then("^the user should be logged in and should see the dashboard page$")
	public void the_user_should_be_logged_in_and_should_see_the_dashboard_page() throws Throwable {
	   WebElement text = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img"));
	 Boolean status =  text.isDisplayed();
	 if(status) {
		 System.out.println("Logged in");
	 }
	}

}
