package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class GmailLogin {
	public static void main(String[] args) throws InterruptedException {
		GmailLogin login=new GmailLogin();
		login.InvokeBrowser();
		login.Test();
		login.quit();
	}
WebDriver driver;
	public void InvokeBrowser()
	{
		try {
		System.setProperty("webdriver.gecko.driver", "C:\\MyJobRelated\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/gmail/about/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	public void Test() throws InterruptedException 
	{
		//Handle new tab
		String ParentWindowhandle=driver.getWindowHandle();
		System.out.println("The Url of the window is"+ ParentWindowhandle);
	
		driver.findElement(By.className("hero_home__link__desktop")).click();
		Thread.sleep(4000);
		System.out.println(driver.getCurrentUrl());
		for(String childTab:driver.getWindowHandles())
		{
			driver.switchTo().window(childTab);
		}
		System.out.println("The window Url is"+ driver.getCurrentUrl());
		
		
		driver.findElement(By.id("FirstName")).sendKeys("madhu");
		Thread.sleep(3000);
		Select Month=new Select(driver.findElement(By.id("BirthMonth")));
		Month.selectByIndex(3);

}
	
	public void quit()
	{
		driver.quit();
	}
	
	
}
