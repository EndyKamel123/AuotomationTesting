package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends pagesBase {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(css =  "button.btn.btn-primary")
	WebElement loginBtn;

	public void OpenLoginpage()
	{
		loginBtn.click();
	}
	
	
	/*@FindBy(className ="secondary-color")
	WebElement Registerlink;
	public void openRegisterationpage()
	{
		Registerlink.click();
	}*/
	@FindBy(css =  "button.btn.btn-primary")
	WebElement loginBtnTest;

	public void OpenLoginpageTest()
	{
		loginBtn.click();
	}
	
}
