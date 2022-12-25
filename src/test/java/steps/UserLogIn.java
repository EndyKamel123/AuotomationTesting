package steps;

import org.testng.Assert;

import Deepdive.QardyTestCasesT1.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class UserLogIn extends TestBase {
	HomePage homeobject1;
	LoginPage loginobject1;
	@Given("The user get into Qardy homepage")
	public void The_user_get_into_qardy_homepage()
	{
		
		homeobject1 = new HomePage(driver);
		homeobject1.OpenLoginpageTest();
		System.out.println(driver.getCurrentUrl());
		//driver.navigate().to("http://qardy-user-frontend.s3-website.us-east-2.amazonaws.com/auth/login");
		
		
		
		
	}
	@When("user click on login button")
	public void user_click_on_register_button() {
		Assert.assertTrue(driver.getCurrentUrl().contains("login") );
	}
	
	@When("user enter {string},{string} is entered")
	public void user_enter(String email, String Password)
	{
		loginobject1 = new LoginPage(driver);
		loginobject1.LoginuserOnClick(email, Password);
		//System.out.println("rrrqqqqgggDriver"+driver.getCurrentUrl());
		String ttt=driver.getCurrentUrl();
		System.out.println(ttt);
		//driver.navigate().to("http://qardy-user-frontend.s3-website.us-east-2.amazonaws.com");
		
	}
	@Then("User succesfully LogIn")
	public void User_succesfully_LogIn() throws InterruptedException
	{
		//System.out.println(loginobject1.SuccessMSg.getText());
		//Assert.assertTrue(loginobject1.SuccessMSg.getText().contains("تسجيل دخول"));
		System.out.println("ttttqqqq"+driver.getCurrentUrl());
		Thread.sleep(9600);
	}
	
	

}
