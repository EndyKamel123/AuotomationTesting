package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class pagesBase {
	
	
	public pagesBase(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}

}
