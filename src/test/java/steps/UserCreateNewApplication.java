package steps;



import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;



import Deepdive.QardyTestCasesT1.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.createNewApplication;


public class UserCreateNewApplication extends TestBase  {
	
	createNewApplication createNewApplicationpage;
	
	@Given("User click on create New Application")
	public void user_click_create_New_Application_button() {
		//System.out.println("ssss100000  "+driver.getCurrentUrl());
		//driver.navigate().to(null);
		//System.out.println("ssss1");
		createNewApplicationpage = new createNewApplication(driver);
		createNewApplicationpage.getNewApplicationLink(driver);
		
	}
	
	@When("Add All Data For The New Application")
	public void Add_All_Data_New_Applicatio() {
		//System.out.println("ssss2");
		assertFalse(createNewApplicationpage.loanReasonIdListoptions().isMultiple()); 
		assertFalse(createNewApplicationpage.loanSubreasonIdListoptions().isMultiple());
		assertEquals(4, createNewApplicationpage.loanReasonIdListoptions().getOptions().size());
		System.out.println(createNewApplicationpage.LanguageOfPage.getText());
		if(createNewApplicationpage.LanguageOfPage.getText().contains("ar"))
		{
			createNewApplicationpage.loanReasonIdListoptions().selectByValue("663A6");
			assertEquals("الاثنان معا",createNewApplicationpage.loanReasonIdListoptions().getFirstSelectedOption().getText());
			
			createNewApplicationpage.loanSubreasonIdListoptions().selectByIndex(4);
			assertEquals("شراء مباني",createNewApplicationpage.loanSubreasonIdListoptions().getFirstSelectedOption().getText());
			
			createNewApplicationpage.loanTypeIdListoptions().selectByIndex(1);
			assertEquals("قرض بضمانات",createNewApplicationpage.loanTypeIdListoptions().getFirstSelectedOption().getText());
			
			createNewApplicationpage.loanAmountIdListoptions().selectByIndex(2);
			assertEquals("500,001-1,000,000",createNewApplicationpage.loanAmountIdListoptions().getFirstSelectedOption().getText());
			
			createNewApplicationpage.loanPeriodIdListoptions().selectByIndex(1);
			assertEquals("اقل من سنة",createNewApplicationpage.loanPeriodIdListoptions().getFirstSelectedOption().getText());
			
			createNewApplicationpage.buttonSubmitClicking(driver);
		}
		else if (createNewApplicationpage.LanguageOfPage.getText().contains("en"))
		{
			createNewApplicationpage.loanReasonIdListoptions().selectByValue("663A6");
			assertEquals("Both",createNewApplicationpage.loanReasonIdListoptions().getFirstSelectedOption().getText());
			
			createNewApplicationpage.loanSubreasonIdListoptions().selectByIndex(4);
			assertEquals("Buildings",createNewApplicationpage.loanSubreasonIdListoptions().getFirstSelectedOption().getText());
			
			createNewApplicationpage.loanTypeIdListoptions().selectByIndex(1);
			assertEquals("Loan Secured",createNewApplicationpage.loanTypeIdListoptions().getFirstSelectedOption().getText());
			
			createNewApplicationpage.loanAmountIdListoptions().selectByIndex(2);
			assertEquals("500,001-1,000,000",createNewApplicationpage.loanAmountIdListoptions().getFirstSelectedOption().getText());
			
			createNewApplicationpage.loanPeriodIdListoptions().selectByIndex(1);
			assertEquals("less than 1 year",createNewApplicationpage.loanPeriodIdListoptions().getFirstSelectedOption().getText());
			
			createNewApplicationpage.buttonSubmitClicking(driver);
		}
		//driver.switchTo().window(driver.getWindowHandle());
		//System.out.println("Where  "+driver.switchTo().window(driver.getWindowHandle()));
		// driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		try {
			Thread.sleep (9000);
			System.out.println("Hello From Asser "+ driver.getCurrentUrl());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Where  "+ driver.getCurrentUrl());

		
	}
	@Then("find where the application progress to enter data")
	public void find_where_the_application_progress_to_enter_data()
	{
		createNewApplicationpage.Clickoncompany_infoSubmitClicking(driver);
		try {
			Thread.sleep (9000);
			System.out.println("Find URL Comp info "+ driver.getCurrentUrl());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		////    ---- company-info ---
		
		if(driver.getCurrentUrl().contains("company-info")) 
		{
			createNewApplicationpage.company_info_PutTXT("TestingCompanyKaremE", "12456398752dee", 
					"123rlty", "El Manial 55 Abbas bridge", "4", "25522222", "01245369874", "", "5", 
					"company for first Addation testing qardy", "Land line production field");
			createNewApplicationpage.application_issuingDayListoptions().selectByValue("23");
			createNewApplicationpage.application_issuingMonthListoptions().selectByValue("11");
			createNewApplicationpage.application_issuingYearListoptions().selectByValue("2022");
			createNewApplicationpage.coTypeIdListoptions().selectByIndex(3);
			createNewApplicationpage.yearOfEstablishmentListoptions().selectByValue("1976");
			createNewApplicationpage.governorateIdListoptions().selectByIndex(4);
			createNewApplicationpage.cityIdListoptions().selectByIndex(11);
			createNewApplicationpage.headcountIdListoptions().selectByIndex(1);
			createNewApplicationpage.storageNumIdListoptions().selectByIndex(1);
			createNewApplicationpage.businessTypeIdListoptions().selectByIndex(3);
			createNewApplicationpage.businessLineIdListoptions().selectByIndex(10);
			//createNewApplicationpage.loansExistYesClicked();
			//createNewApplicationpage.loansExistNoClicked();
			//System.out.println("Valid  ttt " + createNewApplicationpage.loansExistYes.isSelected());
			//System.out.println("Valid  ttt No " + createNewApplicationpage.loansExistNo.isSelected());
			createNewApplicationpage.loansExistYesClicked();
			if(createNewApplicationpage.loansExistYes.isSelected()==true)
			{
				
				createNewApplicationpage.prevCompanyLoanReasonId0Listoptions().selectByIndex(1);
				createNewApplicationpage.prevCompanyLoanSubreasonId0Listoptions().selectByIndex(2);
				createNewApplicationpage.prevCompanyLoanTypeId0Listoptions().selectByIndex(2);
				createNewApplicationpage.prevCompanyLoanAmountId0Listoptions().selectByIndex(4);
			}
			
			
			createNewApplicationpage.compInfoSavebtnClick();
			
			createNewApplicationpage.ceoInfoBtnLinkclick();
			try {
				Thread.sleep (9000);
				//System.out.println("Hi dody kokyyy"+driver.getCurrentUrl());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		  ////    ---- personal-info ---
		if(driver.getCurrentUrl().contains("personal-info")) 
		{
			
		}
		 
		  ////    ---- ceo-info ---
		if(driver.getCurrentUrl().contains("ceo-info")) 
		{
			System.out.println("Find URL ceo info "+ driver.getCurrentUrl());
			createNewApplicationpage.ceoInsertTXT("Ali karem Mohamed","01234567891","","Maadi behind Al Naser street 90","F.dd@sss","wdr.jjs@ss","2.3");
			createNewApplicationpage.titleIdListoptions().selectByIndex(1);
			createNewApplicationpage.ceoapplication_birthDayListoptions().selectByIndex(13);
			createNewApplicationpage.ceoapplication_birthMonthListoptions().selectByIndex(4);
			createNewApplicationpage.ceoapplication_birthYearListoptions().selectByValue("1980");
			
			createNewApplicationpage.ceoNationalitytitleIdListoptions().selectByValue("b5376");
			createNewApplicationpage.ceonationalIdListoptions("12345678912305");
			//update Not Egyptian
			//createNewApplicationpage.ceoNationalitytitleIdListoptions().selectByValue("865Ac");
			//createNewApplicationpage.ceoresidenceNumberListoptions("123456789123654");
			
			createNewApplicationpage.ceoapplication_nationalIdExpiryDayListoptions().selectByIndex(29);
			createNewApplicationpage.ceoapplication_nationalIdExpiryMonthListoptions().selectByIndex(12);
			createNewApplicationpage.ceoapplication_nationalIdExpiryYearListoptions().selectByValue("2025");
			
			//createNewApplicationpage.ceoapplication_residenceExpiryDayListoptions().selectByIndex(29);
			//createNewApplicationpage.ceoapplication_residenceExpiryMonthListoptions().selectByIndex(8);
			//createNewApplicationpage.ceoapplication_residenceExpiryYearListoptions().selectByValue("2026");
			
			createNewApplicationpage.ceoeducationLevelIdListoptions().selectByIndex(5);;
			createNewApplicationpage.ceomaritalStatusIdListoptions().selectByIndex(2);;
			createNewApplicationpage.ceoexperienceYearIdListoptions().selectByIndex(4);;
			
			createNewApplicationpage.ceoInfoSaveBtnClick();
			createNewApplicationpage.clientssuppliersBtnLinkclick();
			
			try {
				Thread.sleep (9000);
				//System.out.println("Hi dody kokyyy"+driver.getCurrentUrl());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		 ////    ---- clients-suppliers ---
		if(driver.getCurrentUrl().contains("clients-suppliers")) 
		{
			createNewApplicationpage.supplier0TxTEnter("Hager gogo Mohe","01235694256","h.g@shsh","october 17");
			createNewApplicationpage.supplier1TxTEnter("Azhar zozo Ali","01123658425","a.z@kks","Dokki 47");
			createNewApplicationpage.supplier2TxTEnter("Endy Dodo Kamel","01236528941","e.jh@rtt","Naser 58");
			createNewApplicationpage.clientSuppSaveClick();
			createNewApplicationpage.FinancialStatementsBtnLinkclick();
			
			try {
				Thread.sleep (9000);
				//System.out.println("Hi dody kokyyy"+driver.getCurrentUrl());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		if(driver.getCurrentUrl().contains("mini-fs"))
		{
			createNewApplicationpage.yearSpanrevenuesTXTEnter("910000","85555","74000","63000");
			createNewApplicationpage.yearSpancost_of_salesTXTEnter("2500","1000","2000","3000");
			createNewApplicationpage.yearSpanfinancing_expensesTXTEnter("50000","2990","3000","2430");
			createNewApplicationpage.yearSpanpaid_in_capitalTXTEnter("110000","15600","32660","45025");
			createNewApplicationpage.FStatementSaveBtnLinkclick();
			
		}
		
		
		
	}

}
