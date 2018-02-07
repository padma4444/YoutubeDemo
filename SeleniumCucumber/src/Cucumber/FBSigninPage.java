package Cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBSigninPage {
   public WebDriver driver;
	@Given("^Open  FB website with valid Url$")
	public void open_FB_website_with_valid_Url() throws Throwable {
     System.setProperty("webdriver.gecko.driver", "C:\\MyJobRelated\\geckodriver.exe");
	 driver=new FirefoxDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.get("https://www.facebook.com");
     Thread.sleep(2000);
	}

	@When("^Give valid details for all fields$")
	public void give_valid_details_for_all_fields() throws Throwable {
	driver.findElement(By.name("firstname")).sendKeys("madhulika");
	Thread.sleep(2000);
	driver.findElement(By.name("lastname")).sendKeys("challa");
	Thread.sleep(2000);
	driver.findElement(By.name("reg_email__")).sendKeys("challmadhu@gmail.com");
	Thread.sleep(2000);
	
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("challmadhu@gmail.com");
	driver.findElement(By.name("reg_passwd__")).sendKeys("1234chall");
	Thread.sleep(2000);
	Select day=new Select(driver.findElement(By.id("day")));
	day.selectByIndex(3);
	Thread.sleep(2000);
	Select month=new Select(driver.findElement(By.id("month")));
	month.selectByValue("3");
	Select Year=new Select(driver.findElement(By.id("year")));
	Year.selectByVisibleText("1988");
	Thread.sleep(2000);
	
	
	}

	@When("^Click Creat Account Button$")
	public void click_Creat_Account_Button() throws Throwable {
	   
	}

	@Then("^Close the window$")
	public void close_the_window() throws Throwable {
	    //driver.quit();
	}

}
