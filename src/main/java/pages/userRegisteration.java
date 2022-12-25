package pages;



import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class userRegisteration extends pagesBase {

	public userRegisteration(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(name = "email")
	WebElement EmailTxt;
	
	@FindBy(name = "password")
	WebElement PasswordTxt;
	
	@FindBy(name = "confirmPassword")
	WebElement confirmPasswordTxt;
	
	@FindBy(name = "name")
	WebElement nameTxt;
	
	@FindBy (name ="dob")
	WebElement dobDateTxt;
	
	
	
	By buttonCl = By.id("registerSubmit");
	
	public WebElement buttonClEle(WebDriver driver)
	{
		WebElement buttonTo = driver.findElement(buttonCl);
		return buttonTo;
	}
	By sussmsg = By.className("message");
	public WebElement sendmsg(WebDriver driver)
	{
		WebElement buttonTosuss = driver.findElement(sussmsg);
		return buttonTosuss;
	}
	
	
	
	public void userRegisterdata(String email,String password, String confirmPassword, String name, String dobDate )
	{
		EmailTxt.sendKeys(email);
		PasswordTxt.sendKeys(password);
		confirmPasswordTxt.sendKeys(confirmPassword);
		nameTxt.sendKeys(name);
		dobDateTxt.sendKeys(dobDate);
		
		dobDateTxt.sendKeys(Keys.ENTER);
		
	}
	
	

	

}
