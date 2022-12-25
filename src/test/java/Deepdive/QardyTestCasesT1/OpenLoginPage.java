package Deepdive.QardyTestCasesT1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenLoginPage {
	
	ChromeDriver driver;
	@BeforeTest
	public void OpenURL_DirectToHomePage()
	{
		String ChromPathing = System.getProperty("user.dir")+"\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",ChromPathing);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.navigate().to("http://qardy-user-frontend.s3-website.us-east-2.amazonaws.com");
		String title= driver.getTitle();
		System.out.println("The Page Titel is: "+title);
		Assert.assertEquals(title, "Qardy");
		
	}
	
	@Test(priority =0 )
	public void openLoginPage()
	{
		//WebElement LoginBtn = driver.findElement(By.className("btn"));
		//WebElement LoginBtn = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/button"));
		WebElement LoginBtn = driver.findElement(By.cssSelector("button.btn.btn-primary"));
		LoginBtn.click();
		String theexpecterURL = driver.getCurrentUrl(); 
		System.out.println(theexpecterURL);
		Assert.assertEquals(theexpecterURL, "http://qardy-user-frontend.s3-website.us-east-2.amazonaws.com/auth/login");
		
	}
	
	@Test(priority = 1)
	public void FindAllLinksInPageLogin()
	{
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		System.out.println("Number of Links: "+Links.size());
		
		//print each link value
		for (WebElement link : Links) {
			System.out.println(link.getAttribute("href"));
		}
		
	}
	
	@AfterTest
	public void CloseURL() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.quit();
	}

}
