package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class createNewApplication extends pagesBase {

	public createNewApplication(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(css =  "button.btn.btn-primary")
	WebElement loginBtn;
	
	//List<WebElement> Links=driver.findElements(By.tagName("a"));
	By NewApplication = By.id("startApplication");
	public void getNewApplicationLink(WebDriver driver)
	{
		WebElement NewApplicationLink = driver.findElement(NewApplication);
		String link =NewApplicationLink.getAttribute("href");
		driver.navigate().to(link);
		
	}
	
	@FindBy(id = "userDropdown1")
	public WebElement LanguageOfPage;
	
	@FindBy(name = "loanReasonId")
	WebElement loanReasonId;
	//By loanReasonId = By.name("loanReasonId");
	public Select loanReasonIdListoptions()
	{
		Select loanReasonIdList= new Select(loanReasonId);
		
		return loanReasonIdList;
	}
	
	@FindBy(name ="loanSubreasonId")
	WebElement loanSubreasonId;
	public Select loanSubreasonIdListoptions() 
	{
		Select loanSubreasonIdList= new Select(loanSubreasonId);
		return loanSubreasonIdList;
	}
	@FindBy(name ="loanTypeId")
	WebElement loanTypeId;
	public Select loanTypeIdListoptions() 
	{
		Select loanTypeIdList= new Select(loanTypeId);
		return loanTypeIdList;
	}
	
	@FindBy(name ="loanAmountId")
	WebElement loanAmountId;
	public Select loanAmountIdListoptions() 
	{
		Select loanAmountIdList= new Select(loanAmountId);
		return loanAmountIdList;
	}
	
	@FindBy(name ="loanPeriodId")
	WebElement loanPeriodId;
	public Select loanPeriodIdListoptions() 
	{
		Select loanPeriodIdList= new Select(loanPeriodId);
		return loanPeriodIdList;
	}
	
	
	By buttonSubmit = By.id("startSubmit");
	
	public void buttonSubmitClicking(WebDriver driver)
	{
		WebElement buttonbuttonSubmitToclick = driver.findElement(buttonSubmit);
		buttonbuttonSubmitToclick.click();
		System.out.println("In Side "+driver.getCurrentUrl());
	}
	
	//  company-info
	
	By Clickoncompany_info = By.id("companyInfo");
	
	public void Clickoncompany_infoSubmitClicking(WebDriver driver)
	{
		WebElement Clickoncompany_infoSubmitToclick = driver.findElement(Clickoncompany_info);
		Clickoncompany_infoSubmitToclick.click();
		System.out.println("In Sidecooom "+driver.getCurrentUrl());
	}
	
	@FindBy(id ="name")
	WebElement companyName;
	
	@FindBy(name ="commercialRegistrationNumber")
	WebElement commercial_Registration_Number;
	
	@FindBy(name ="office")
	WebElement Office_of_issuance;
	
	@FindBy(name ="application.issuingDay")
	WebElement application_issuingDay;
	
	@FindBy(name ="application.issuingMonth")
	WebElement application_issuingMonth;
	
	@FindBy(name ="application.issuingYear")
	WebElement application_issuingYear;
	
	@FindBy(css  ="div[class=\"error-container\"]")
	WebElement error_container;
	
	@FindBy(name="coTypeId")
	WebElement coTypeId;
	
	@FindBy(name="yearOfEstablishment")
	WebElement yearOfEstablishment;
	
	@FindBy(id="comp_address")
	WebElement comp_address;
	
	@FindBy(name="floor")
	WebElement floor;
	
	@FindBy(name="governorateId")
	WebElement governorateId;
	
	@FindBy(name="cityId")
	WebElement cityId;
	
	@FindBy(name="landline")
	WebElement landline;
	
	@FindBy(name="mobile")
	WebElement mobile;
	
	@FindBy(id="website")
	WebElement website;
	
	@FindBy(id="branches")
	WebElement branches;
	
	@FindBy(name="headcountId")
	WebElement headcountId;
	
	@FindBy(id="desc")
	WebElement description;
	
	@FindBy(name="storageNumId")
	WebElement storageNumId;
	
	@FindBy(id="products")
	WebElement products;
	
	@FindBy(name="businessTypeId")
	WebElement businessTypeId;
	
	@FindBy(name="businessLineId")
	WebElement businessLineId;
	
	@FindBy(xpath ="/html/body/app-root/body/app-layout/main/app-loan-application-layout/div[2]/div/app-company-info/section[2]/div/div/form/div[3]/div/div[1]/div/label[2]/input")
	public WebElement loansExistYes;
	
	@FindBy(xpath = "/html/body/app-root/body/app-layout/main/app-loan-application-layout/div[2]/div/app-company-info/section[2]/div/div/form/div[3]/div/div[1]/div/label[3]/input")
	public WebElement loansExistNo;
	
	@FindBy(name="prevCompanyLoanReasonId0")
	WebElement prevCompanyLoanReasonId0;
	
	@FindBy(name="prevCompanyLoanSubreasonId0")
	WebElement prevCompanyLoanSubreasonId0;
	
	@FindBy(name="prevCompanyLoanTypeId0")
	WebElement prevCompanyLoanTypeId0;
	
	@FindBy(name="prevCompanyLoanAmountId0")
	WebElement prevCompanyLoanAmountId0;
	
	@FindBy(id="compInfoSave")
	WebElement compInfoSavebtn;
	
	public void company_info_PutTXT(String companyNameT,String commercial_Registration_NumberT , String Office_of_issuanceT, String comp_addressT
			,String floorT , String landlineT , String mobileT ,String websiteT ,String branchesT ,String descriptionT , String productsT ) 
	{
		companyName.sendKeys(companyNameT);
		commercial_Registration_Number.sendKeys(commercial_Registration_NumberT);
		Office_of_issuance.sendKeys(Office_of_issuanceT);
		comp_address.sendKeys(comp_addressT);
		floor.sendKeys(floorT);
		landline.sendKeys(landlineT);
		mobile.sendKeys(mobileT);
		website.sendKeys(websiteT);
		branches.sendKeys(branchesT);
		description.sendKeys(descriptionT);
		products.sendKeys(productsT);
		
	}
	public Select application_issuingDayListoptions() 
	{
		Select application_issuingDayList= new Select(application_issuingDay);
		return application_issuingDayList;
	}
	public Select application_issuingMonthListoptions() 
	{
		Select application_issuingMonthList= new Select(application_issuingMonth);
		return application_issuingMonthList;
	}
	public Select application_issuingYearListoptions() 
	{
		Select application_issuingYearList= new Select(application_issuingYear);
		return application_issuingYearList;
	}
	public Select coTypeIdListoptions() 
	{
		Select coTypeIdList= new Select(coTypeId);
		return coTypeIdList;
	}
	public Select yearOfEstablishmentListoptions() 
	{
		Select yearOfEstablishmentList= new Select(yearOfEstablishment);
		return yearOfEstablishmentList;
	}
	public Select governorateIdListoptions() 
	{
		Select governorateIdList= new Select(governorateId);
		return governorateIdList;
	}
	public Select cityIdListoptions() 
	{
		Select cityIdList= new Select(cityId);
		return cityIdList;
	}
	public Select headcountIdListoptions() 
	{
		Select headcountIdList= new Select(headcountId);
		return headcountIdList;
	}
	public Select storageNumIdListoptions() 
	{
		Select storageNumIdList= new Select(storageNumId);
		return storageNumIdList;
	}
	public Select businessTypeIdListoptions() 
	{
		Select businessTypeIdList= new Select(businessTypeId);
		return businessTypeIdList;
	}
	public Select businessLineIdListoptions() 
	{
		Select businessLineIdList= new Select(businessLineId);
		return businessLineIdList;
	}
	public void loansExistYesClicked() 
	{
		loansExistYes.click();
	}
	public void loansExistNoClicked() 
	{
		loansExistNo.click();
		
	}
	public Select prevCompanyLoanReasonId0Listoptions() 
	{
		Select prevCompanyLoanReasonId0List= new Select(prevCompanyLoanReasonId0);
		return prevCompanyLoanReasonId0List;
	}
	public Select prevCompanyLoanSubreasonId0Listoptions() 
	{
		Select prevCompanyLoanSubreasonId0List= new Select(prevCompanyLoanSubreasonId0);
		return prevCompanyLoanSubreasonId0List;
	}
	public Select prevCompanyLoanTypeId0Listoptions() 
	{
		Select prevCompanyLoanTypeId0List= new Select(prevCompanyLoanTypeId0);
		return prevCompanyLoanTypeId0List;
	}
	public Select prevCompanyLoanAmountId0Listoptions() 
	{
		Select prevCompanyLoanAmountId0List= new Select(prevCompanyLoanAmountId0);
		return prevCompanyLoanAmountId0List;
	}
	public void compInfoSavebtnClick()
	{
		compInfoSavebtn.click();
	}
	
	
	// ceoInfo
	
	
	@FindBy(id="ceoInfo")
	WebElement ceoInfoBtnLink;
	public void ceoInfoBtnLinkclick()
	{
		ceoInfoBtnLink.click();
	}
	@FindBy(css="select.form-control.ng-untouched.ng-pristine.ng-valid")
	WebElement ceotitleId;
	
	@FindBy(id="name")
	WebElement ceoname;
	
	@FindBy(name="application.birthDay")
	WebElement ceoapplication_birthDay;
	
	@FindBy(name="application.birthMonth")
	WebElement ceoapplication_birthMonth;
	
	@FindBy(name="application.birthYear")
	WebElement ceoapplication_birthYear;
	
	@FindBy(name="mobile")
	WebElement ceomobile;
	
	@FindBy(id="email")
	WebElement ceoemail;
	
	@FindBy(xpath = "/html/body/app-root/body/app-layout/main/app-loan-application-layout/div[2]/div/app-ceo-info/section[2]/div/div/form/div[1]/div/div[6]/div[2]/select")
	public WebElement ceoNationalitytitleId;
	
	@FindBy(name="residenceNumber")
	WebElement ceoresidenceNumber;
	
	@FindBy(name="nationalId")
	WebElement ceonationalId;
	
	@FindBy(name="application.nationalIdExpiryDay")
	WebElement ceoapplication_nationalIdExpiryDay;
	
	@FindBy(name="application.nationalIdExpiryMonth")
	WebElement ceoapplication_nationalIdExpiryMonth;
	
	@FindBy(name="application.nationalIdExpiryYear")
	WebElement ceoapplication_nationalIdExpiryYear;
	
	@FindBy(name="application.residenceExpiryDay")
	WebElement ceoapplication_residenceExpiryDay;
	
	@FindBy(name="application.residenceExpiryMonth")
	WebElement ceoapplication_residenceExpiryMonth;
	
	@FindBy(name="application.residenceExpiryYear")
	WebElement ceoapplication_residenceExpiryYear;
	
	@FindBy(name="educationLevelId")
	WebElement ceoeducationLevelId;
	
	@FindBy(name="maritalStatusId")
	WebElement ceomaritalStatusId;
	
	@FindBy(id="ceo_address")
	WebElement ceo_address;
	
	@FindBy(id="fb")
	WebElement fb;
	
	@FindBy(id="linkedin")
	WebElement linkedin;
	
	@FindBy(id="ownership")
	WebElement ownership;
	
	@FindBy(name="experienceYearId")
	WebElement ceoexperienceYearId;
	
	@FindBy(id="ceoInfoSave")
	WebElement ceoInfoSavebtn;
	
	public Select titleIdListoptions() 
	{
		Select titleIdList= new Select(ceotitleId);
		return titleIdList;
	}
	public Select ceoapplication_birthDayListoptions() 
	{
		Select ceoapplication_birthDayList= new Select(ceoapplication_birthDay);
		return ceoapplication_birthDayList;
	}
	
	public Select ceoapplication_birthMonthListoptions() 
	{
		Select ceoapplication_birthMonthList= new Select(ceoapplication_birthMonth);
		return ceoapplication_birthMonthList;
	}
	public Select ceoapplication_birthYearListoptions() 
	{
		Select ceoapplication_birthYearList= new Select(ceoapplication_birthYear);
		return ceoapplication_birthYearList;
	}
	
	public Select ceoNationalitytitleIdListoptions() 
	{
		Select ceoNationalitytitleIdList1= new Select(ceoNationalitytitleId);
		return ceoNationalitytitleIdList1;
	}
	
	public void ceoresidenceNumberListoptions(String ceoresidenceNumberTXT) 
	{
		ceoresidenceNumber.sendKeys(ceoresidenceNumberTXT);
		
	}
	public void ceonationalIdListoptions(String ceonationalIdTXT) 
	{
		ceonationalId.sendKeys(ceonationalIdTXT);
		
	}
	public Select ceoapplication_nationalIdExpiryDayListoptions() 
	{
		Select ceoapplication_nationalIdExpiryDayList= new Select(ceoapplication_nationalIdExpiryDay);
		return ceoapplication_nationalIdExpiryDayList;
	
	}
	
	public Select ceoapplication_nationalIdExpiryMonthListoptions() 
	{
		Select ceoapplication_nationalIdExpiryMonthList= new Select(ceoapplication_nationalIdExpiryMonth);
		return ceoapplication_nationalIdExpiryMonthList;
	}
	
	public Select ceoapplication_nationalIdExpiryYearListoptions() 
	{
		Select ceoapplication_nationalIdExpiryYearList= new Select(ceoapplication_nationalIdExpiryYear);
		return ceoapplication_nationalIdExpiryYearList;
	}
	//
	public Select ceoapplication_residenceExpiryDayListoptions() 
	{
		Select ceoapplication_residenceExpiryDayList= new Select(ceoapplication_residenceExpiryDay);
		return ceoapplication_residenceExpiryDayList;
	
	}
	
	public Select ceoapplication_residenceExpiryMonthListoptions() 
	{
		Select ceoapplication_residenceExpiryMonthList= new Select(ceoapplication_residenceExpiryMonth);
		return ceoapplication_residenceExpiryMonthList;
	}
	
	public Select ceoapplication_residenceExpiryYearListoptions() 
	{
		Select ceoapplication_residenceExpiryYearList= new Select(ceoapplication_residenceExpiryYear);
		return ceoapplication_residenceExpiryYearList;
	}
	public Select ceoeducationLevelIdListoptions() 
	{
		Select ceoeducationLevelIdList= new Select(ceoeducationLevelId);
		return ceoeducationLevelIdList;
	}
	public Select ceomaritalStatusIdListoptions() 
	{
		Select ceomaritalStatusIdList= new Select(ceomaritalStatusId);
		return ceomaritalStatusIdList;
	}
	public Select ceoexperienceYearIdListoptions() 
	{
		Select ceoexperienceYearIdList= new Select(ceoexperienceYearId);
		return ceoexperienceYearIdList;
	}
	public void ceoInsertTXT(String ceonametxt, String ceomobiletxt , String  ceoemailtxt , String ceo_addresstxt ,String fbtxt , String linkedintxt ,String ownershiptxt)
	{
		ceoname.sendKeys(ceonametxt);
		ceomobile.sendKeys(ceomobiletxt);
		ceoemail.sendKeys(ceoemailtxt);
		ceo_address.sendKeys(ceo_addresstxt);
		fb.sendKeys(fbtxt);
		linkedin.sendKeys(linkedintxt);
		ownership.sendKeys(ownershiptxt);
		
	}
	public void ceoInfoSaveBtnClick()
	{
		ceoInfoSavebtn.click();
	}
	
	// --- clientsSuppliers ---
	@FindBy(id="clientsSuppliers")
	WebElement clientssuppliersBtnLink;
	public void clientssuppliersBtnLinkclick()
	{
		clientssuppliersBtnLink.click();
	}
	
	@FindBy(id="supplier-name-0")
	WebElement suppliername0;
	
	@FindBy(id="supplier-mobile-0")
	WebElement suppliermobile0;
	
	@FindBy(id="supplier-email-0")
	WebElement supplieremail0;
	
	@FindBy(id="supplier-address-0")
	WebElement supplieraddress0;
	
	@FindBy(id="supplier-name-1")
	WebElement suppliername1;
	
	@FindBy(id="supplier-mobile-1")
	WebElement suppliermobile1;
	
	@FindBy(id="supplier-email-1")
	WebElement supplieremail1;
	
	@FindBy(id="supplier-address-1")
	WebElement supplieraddress1;
	
	@FindBy(id="supplier-name-2")
	WebElement suppliername2;
	
	@FindBy(id="supplier-mobile-2")
	WebElement suppliermobile2;
	
	@FindBy(id="supplier-email-2")
	WebElement supplieremail2;
	
	@FindBy(id="supplier-address-2")
	WebElement supplieraddress2;
	
	@FindBy(id="clientSuppSave")
	WebElement clientSuppSaveBTN;
	
	public void supplier0TxTEnter(String suppliername0TXT, String suppliermobile0TXT, String supplieremail0TXT , String supplieraddress0TXT)
	{
		suppliername0.sendKeys(suppliername0TXT);
		suppliermobile0.sendKeys(suppliermobile0TXT);
		supplieremail0.sendKeys(supplieremail0TXT);
		supplieraddress0.sendKeys(supplieraddress0TXT);
		
	}
	public void supplier1TxTEnter(String suppliername1TXT, String suppliermobile1TXT, String supplieremail1TXT , String supplieraddress1TXT)
	{
		suppliername1.sendKeys(suppliername1TXT);
		suppliermobile1.sendKeys(suppliermobile1TXT);
		supplieremail1.sendKeys(supplieremail1TXT);
		supplieraddress1.sendKeys(supplieraddress1TXT);
	}
	public void supplier2TxTEnter(String suppliername2TXT, String suppliermobile2TXT, String supplieremail2TXT , String supplieraddress2TXT)
	{
		suppliername2.sendKeys(suppliername2TXT);
		suppliermobile2.sendKeys(suppliermobile2TXT);
		supplieremail2.sendKeys(supplieremail2TXT);
		supplieraddress2.sendKeys(supplieraddress2TXT);
	}
	
	public void clientSuppSaveClick()
	{
		clientSuppSaveBTN.click();
	}
	
	// ----  Financial Statements ---
	
	@FindBy(id="miniFs")
	WebElement FinancialStatementsBtnLink;
	public void FinancialStatementsBtnLinkclick()
	{
		FinancialStatementsBtnLink.click();
	}
	
	@FindBy(id="yearSpan-revenues0")
	WebElement yearSpanrevenues0;
	
	@FindBy(id="yearSpan-revenues1")
	WebElement yearSpanrevenues1;
	
	@FindBy(id="yearSpan-revenues2")
	WebElement yearSpanrevenues2;
	
	@FindBy(id="yearSpan-revenues3")
	WebElement yearSpanrevenues3;
	
	@FindBy(id="yearSpan-cost_of_sales0")
	WebElement yearSpancost_of_sales0;
	
	@FindBy(id="yearSpan-cost_of_sales1")
	WebElement yearSpancost_of_sales1;
	
	@FindBy(id="yearSpan-cost_of_sales2")
	WebElement yearSpancost_of_sales2;
	
	@FindBy(id="yearSpan-cost_of_sales3")
	WebElement yearSpancost_of_sales3;
	
	@FindBy(id="yearSpan-financing_expenses0")
	WebElement yearSpanfinancing_expenses0;
	
	@FindBy(id="yearSpan-financing_expenses1")
	WebElement yearSpanfinancing_expenses1;
	
	@FindBy(id="yearSpan-financing_expenses2")
	WebElement yearSpanfinancing_expenses2;
	
	@FindBy(id="yearSpan-financing_expenses3")
	WebElement yearSpanfinancing_expenses3;
	
	@FindBy(id="yearSpan-paid_in_capital0")
	WebElement yearSpanpaid_in_capital0;
	
	@FindBy(id="yearSpan-paid_in_capital1")
	WebElement yearSpanpaid_in_capital1;
	
	@FindBy(id="yearSpan-paid_in_capital2")
	WebElement yearSpanpaid_in_capital2;
	
	@FindBy(id="yearSpan-paid_in_capital3")
	WebElement yearSpanpaid_in_capital3;
	
	
	public void yearSpanrevenuesTXTEnter(String yearSpanrevenues0TXT,String yearSpanrevenues1TXT, String yearSpanrevenues2TXT, String yearSpanrevenues3TXT )
	{
		yearSpanrevenues0.sendKeys(yearSpanrevenues0TXT);
		yearSpanrevenues1.sendKeys(yearSpanrevenues1TXT);
		yearSpanrevenues2.sendKeys(yearSpanrevenues2TXT);
		yearSpanrevenues3.sendKeys(yearSpanrevenues3TXT);
	}
	
	public void yearSpancost_of_salesTXTEnter(String yearSpancost_of_sales0TXT,String yearSpancost_of_sales1TXT, String yearSpancost_of_sales2TXT, String yearSpancost_of_sales3TXT )
	{
		yearSpancost_of_sales0.sendKeys(yearSpancost_of_sales0TXT);
		yearSpancost_of_sales1.sendKeys(yearSpancost_of_sales1TXT);
		yearSpancost_of_sales2.sendKeys(yearSpancost_of_sales2TXT);
		yearSpancost_of_sales3.sendKeys(yearSpancost_of_sales3TXT);
	}
	
	public void yearSpanfinancing_expensesTXTEnter(String yearSpanfinancing_expenses0TXT,String yearSpanfinancing_expenses1TXT, String yearSpanfinancing_expenses2TXT, String yearSpanfinancing_expenses3TXT )
	{
		yearSpanfinancing_expenses0.sendKeys(yearSpanfinancing_expenses0TXT);
		yearSpanfinancing_expenses1.sendKeys(yearSpanfinancing_expenses1TXT);
		yearSpanfinancing_expenses2.sendKeys(yearSpanfinancing_expenses2TXT);
		yearSpanfinancing_expenses3.sendKeys(yearSpanfinancing_expenses3TXT);
	}
	
	public void yearSpanpaid_in_capitalTXTEnter(String yearSpanpaid_in_capital0TXT,String yearSpanpaid_in_capital1TXT, String yearSpanpaid_in_capital2TXT, String yearSpanpaid_in_capital3TXT )
	{
		yearSpanpaid_in_capital0.sendKeys(yearSpanpaid_in_capital0TXT);
		yearSpanpaid_in_capital1.sendKeys(yearSpanpaid_in_capital1TXT);
		yearSpanpaid_in_capital2.sendKeys(yearSpanpaid_in_capital2TXT);
		yearSpanpaid_in_capital3.sendKeys(yearSpanpaid_in_capital3TXT);
	}
	
	@FindBy(id="FStatementSave")
	WebElement FStatementSaveBtnLink;
	public void FStatementSaveBtnLinkclick()
	{
		FStatementSaveBtnLink.click();
	}
	
}
