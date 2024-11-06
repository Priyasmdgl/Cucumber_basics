package stepdefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class datawithoutheader {
	WebDriver driver;
	@Given("^the user should go to the login page$")
	public void the_user_should_go_to_the_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^the user gives the credentials$")
	public void the_user_gives_the_credentials(DataTable arg1) throws Throwable {
	List<String> credentials =	arg1.asList(String.class);
	String user = credentials.get(0);
	String pwd = credentials.get(1);
		WebElement username = driver.findElement(By.name("username"));
		   username.sendKeys(user);
		   WebElement password = driver.findElement(By.name("password"));
		   password.sendKeys(pwd);
	}

	@When("^login$")
	public void login() throws Throwable {
		 WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		   login.click();
	}

	@Then("^the user should see the dashboard page$")
	public void the_user_should_see_the_dashboard_page() throws Throwable {
		WebElement text = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img"));
		 Boolean status =  text.isDisplayed();
		 Assert.assertTrue(status);
	}


}
