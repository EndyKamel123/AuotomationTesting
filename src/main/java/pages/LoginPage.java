package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends pagesBase {

	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(name = "email")
	WebElement EmailTxt;
	
	@FindBy(name = "password")
	WebElement PasswordTxt;
	
	@FindBy(id ="login-btn")
	WebElement LoginBtn;
	
	@FindBy(css = "section.content-header")
	public WebElement SuccessMSg;
	
	@FindBy(id  = "registerPage")
	WebElement Registerlink;
	public void openRegisterationpage()
	{
		
		Registerlink.click();
	}
	
	
	
	public void LoginuserOnClick(String Emailuser ,String Passworduser) 
	{
		EmailTxt.sendKeys(Emailuser);
		PasswordTxt.sendKeys(Passworduser);
		LoginBtn.click();
		
	}
	
	/*
	By buttonloginclicked = By.xpath("/html/body/app-root/body/app-layout/main/app-login/div/div/div[2]/section[2]/form/div[2]/button");
	
	public WebElement buttonloginclick(WebDriver driver)
	{
		WebElement buttonTocli = driver.findElement(buttonloginclicked);
		return buttonTocli;
	}
	
*/

}
