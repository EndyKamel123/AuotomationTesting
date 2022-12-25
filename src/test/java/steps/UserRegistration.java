package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Deepdive.QardyTestCasesT1.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.userRegisteration;

public class UserRegistration extends TestBase {
	HomePage homeobject;
	LoginPage loginobject;
	userRegisteration registerobject;
	String truemsg;
	@Given("the user in Qardy homepage")
	public void the_user_in_qardy_homepage() {
		
		homeobject = new HomePage(driver);
		homeobject.OpenLoginpage();
		
		loginobject = new LoginPage(driver);
		loginobject.openRegisterationpage();
		
		/*loginobject.Loginuser("e.kamelww@eqardy.com", "dodyEkoko@123");
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals(driver.getCurrentUrl(), "http://qardy-user-frontend.s3-website.us-east-2.amazonaws.com/auth/login");
		*/
	}
	@When("user click on register button")
	public void user_click_on_register_button() {
		Assert.assertTrue(driver.getCurrentUrl().contains("register") );
	}
	/*@When("user enter valid data")
	public void user_enter_valid_data() {
		registerobject = new userRegisteration(driver);
		registerobject.userRegisterdata("azhar.kame103152307@gmail.com", "Endy@123", "Endy@123", "EndyDo", "2019 02 20");
		//registerobject.registarebuttonclicked();
		//registerobject.buttonClEle(driver).clear();
		
		
			registerobject.buttonClEle(driver).click();
			
			//driver.close();
		
		
		System.out.println(driver.getCurrentUrl());
		//registerobject.Regg(driver);
		//String testactual=driver.findElement(By.xpath("/html/body/app-root/body/app-layout/main/app-register/div/div/div[2]/section[2]/form/div[1]/div[1]/div/p")).getText();
		//System.out.println(testactual);
		//Assert.assertEquals(testactual," البريد الإلكتروني مسجل مسبقا ");
		
		//System.out.println(registerobject.sendmsg(driver).getText());
		//registerobject.buttonClEle(driver).findElement(By.cssSelector("button[type=\"submit\"]")).click();
		
		
	}*/
	
	@When("user enter {string},{string},{string},{string},{string} is entered")
	public void user_enter(String email, String Password, String confirmPassword, String name, String dobDate) {
		registerobject = new userRegisteration(driver);
		registerobject.userRegisterdata(email,Password, confirmPassword,name,dobDate);
		registerobject.buttonClEle(driver).click();
		System.out.println(driver.getCurrentUrl());
	}
	@Then("The registration page dispalyed succesfully")
	public void the_registration_page_dispalyed_succesfully() throws InterruptedException {
		
		System.out.println(driver.getCurrentUrl());
		WebElement tryrrr=driver.findElement(By.className("primary-color"));
		System.out.println("rrr"+ tryrrr);
		//boolean wwww = registerobject.Findish(driver).isDisplayed();
		if(tryrrr.isDisplayed()==false)	
		{
			System.out.println("dddTest");
			driver.navigate().to("http://qardy-user-frontend.s3-website.us-east-2.amazonaws.com/message/1");
			System.out.println(driver.getCurrentUrl());
			//registerobject.sendmsg(driver);
			truemsg =registerobject.sendmsg(driver).getText();
			System.out.println(driver.getCurrentUrl());
			System.out.println(truemsg);
			Assert.assertEquals(truemsg,"لقد أرسلنا رابط تفعيل لحسابك. يرجى تفعيل حسابك");

		}

		Thread.sleep(8000);
	}

}
