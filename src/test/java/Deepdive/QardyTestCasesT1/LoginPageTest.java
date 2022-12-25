package Deepdive.QardyTestCasesT1;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	HomePage homeobject;
	LoginPage loginobject;
	
	
	@Test(enabled = false)
	public void userCanLoginsuccessfully() 
	{
		
		homeobject = new HomePage(driver) ;
		
		homeobject.OpenLoginpage();
		
		loginobject = new LoginPage(driver);
		loginobject.LoginuserOnClick("e.kamel@eqardy.com", "dodyEkoko@123");
		System.out.println(loginobject.SuccessMSg.getText());
		Assert.assertTrue(loginobject.SuccessMSg.getText().contains("تسجيل دخول"));
		
	}
	
	@Test
	public void userCanotLoginsuccessfully() 
	{
		
		homeobject = new HomePage(driver) ;
		
		homeobject.OpenLoginpage();
		
		loginobject = new LoginPage(driver);
		loginobject.LoginuserOnClick("e.kamelww@eqardy.com", "dodyEkoko@123");
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals(driver.getCurrentUrl(), "http://qardy-user-frontend.s3-website.us-east-2.amazonaws.com/auth/login");
	}

}
