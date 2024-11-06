package stepdefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class datawithheader {
	WebDriver driver;
	@Given("^the user should navigate to hrm login page$")
	public void the_user_should_navigate_to_hrm_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^the user gives correct credentials$")
	public void the_user_gives_correct_credentials(DataTable arg1) throws Throwable {
		List<Map<String, String>> credentials = arg1.asMaps(String.class, String.class);
		String user = credentials.get(0).get("username");
		String pwd = credentials.get(0).get("password");
		WebElement username = driver.findElement(By.name("username"));
		   username.sendKeys(user);
		   WebElement password = driver.findElement(By.name("password"));
		   password.sendKeys(pwd);
	}

	@When("^press login button$")
	public void press_login_button() throws Throwable {
		 WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		   login.click();
	}

	@Then("^the user will be logged in$")
	public void the_user_will_be_logged_in() throws Throwable {
		WebElement text = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img"));
		 Boolean status =  text.isDisplayed();
		 if(status) {
			 System.out.println(status);
		 }
	}
}
