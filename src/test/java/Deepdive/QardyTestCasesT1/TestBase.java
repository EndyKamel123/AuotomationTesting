package Deepdive.QardyTestCasesT1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class TestBase extends AbstractTestNGCucumberTests {

	public static WebDriver driver;
	
	@BeforeSuite
	public void StartDriver()
	{
		String ChromPathing = System.getProperty("user.dir")+"\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",ChromPathing);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://qardy-user-frontend.s3-website.us-east-2.amazonaws.com/");
	}
	
	
	@AfterSuite
	public void CloseURL() throws InterruptedException 
	{
		Thread.sleep(9900);
		driver.quit();
	}
}
