package com.emt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.emt.base.Base;
import com.emt.util.TestUtil;

public class OneWayTripFlightPage extends Base {
	
	//PageFactory
	@CacheLookup
	@FindBy(xpath="//a[contains(.,'Flights')]") WebElement Flights; //
	@CacheLookup
	@FindBy(xpath="//li[contains(.,'One-Way')]") WebElement Onwaytrip;
	@CacheLookup
	@FindBy(id="FromSector_show") WebElement From;
	@CacheLookup
	@FindBy(id="ulfrom") WebElement Fromdropdown;
	@CacheLookup
	@FindBy(xpath="//*[@id=\"fromautoFill\"]/div[2]/div/ul/li[1]") WebElement SelectFromdropdown1;//Selecting Delhi City
	@CacheLookup
	@FindBy(xpath="//*[@id=\"fromautoFill\"]/div[2]/div/ul/li[3]") WebElement SelectFromdropdown2;//Selecting Banglore City
	@CacheLookup
	@FindBy(id="Editbox13_show") WebElement To;
	@CacheLookup
	@FindBy(xpath="//*[@id=\"toautoFill\"]") WebElement Todropdown;
	@CacheLookup
	@FindBy(xpath="//*[@id=\"toautoFill\"]/div/div/ul/li[2]") WebElement SelectTodropdown;	
	@CacheLookup
	@FindBy(id="ddate") WebElement DepDate;
	@CacheLookup
	@FindBy(id="fiv_2_26/10/2021") WebElement DDate;
	@CacheLookup
	@FindBy(id="img2Nex") WebElement NextMonth;
	@CacheLookup
	@FindBy(xpath="//*[@id=\"frth_3_24/11/2021\"]") WebElement NextMonthDate;
	@CacheLookup
	@FindBy(className="drpNoTrv") WebElement Travellersdropdown;
	@CacheLookup
	@FindBy(id="myDropdown_n") WebElement TravellersdropdownMenu;
	//
	@CacheLookup
	@FindBy(xpath="//*[@id=\"myDropdown_n\"]/div/div[1]/div[2]/div/div[3]/input") WebElement AdultAdd;
	@CacheLookup
	@FindBy(xpath="//*[@id=\"myDropdown_n\"]/div/div[1]/div[2]/div/div[1]/input") WebElement AdultDel;
	@CacheLookup
	@FindBy(xpath="//*[@id=\"myDropdown_n\"]/div/div[2]/div[2]/div/div[3]/input") WebElement ChildAdd;
	@CacheLookup
	@FindBy(xpath="//*[@id=\"myDropdown_n\"]/div/div[2]/div[2]/div/div[1]/input") WebElement ChildDel;
	@CacheLookup
	@FindBy(xpath="//*[@id=\"myDropdown_n\"]/div/div[3]/div[2]/div/div[3]/input") WebElement InfantsAdd;
	@CacheLookup
	@FindBy(xpath="//*[@id=\"myDropdown_n\"]/div/div[3]/div[2]/div/div[1]/input") WebElement InfantsDel;
	//
	@CacheLookup
	@FindBy(className="src_btn") WebElement Srchbtn;
	@CacheLookup
	@FindBy(xpath="//button[contains(.,'Book Now')]") WebElement Booknowbtn;
	@CacheLookup
	@FindBy(className="countnbtn") WebElement ContinueBtn;
	@CacheLookup
	@FindBy(id="spnVerifyEmail") WebElement ContinuebookingBtn;
	@CacheLookup
	@FindBy(xpath="//*[@id=\"chkInsurance\"]") WebElement Insuranceclick;
	@CacheLookup
	@FindBy(id="txtEmailId") WebElement EnterValidEmail;
	@CacheLookup
	@FindBy(id="txtCPhone") WebElement EnterValidPhoneNo;
	@CacheLookup
	@FindBy(id="titleAdult0") WebElement Dropdowntitle;
	@CacheLookup
	@FindBy(id="txtFNAdult0") WebElement Firstname;
	@CacheLookup
	@FindBy(id="txtLNAdult0") WebElement Lastname;
	@CacheLookup
	@FindBy(id="divContinueTransactionSCD") WebElement ContinueBooking;
	/*
	 * @CacheLookup
	 * 
	 * @FindBy(xpath="//*[@id=\"myModal_EMI\"]/div/div[5]/a") WebElement
	 * PaymentModeText;
	 */
	

	// Initializing the Page Objects
	public OneWayTripFlightPage() {
		PageFactory.initElements(driver, this);

	}
	
	//Actions
	
	//Scenarios for 'Origin' textfield
	public boolean citySuggestions() {
		From.click();
		return Fromdropdown.isDisplayed();	
	}
	
	public void characterAcceptance(String city) {
		From.click();
		From.sendKeys(city);
		Srchbtn.click();
	}
	
	public void SpecialharacterAcceptance(String Specialchar) {
		From.click();
		From.sendKeys(Specialchar);	
		Srchbtn.click();
	}
	
	public void numberAcceptance(String Testno) {
		From.click();
		From.sendKeys(Testno);
		Srchbtn.click();
	}
	
	public void AlphaNumeric(String TestAlphaNumeric) {
		From.click();
		From.sendKeys(TestAlphaNumeric);
		Srchbtn.click();
	}
	
	public void CountryOrCity(String City) {
		From.click();
		From.sendKeys(City);
		Srchbtn.click();
	}
	
	public void originLeftBlank() {
		From.click();
		Srchbtn.click();
	}
	
	//Scenarios for 'Destination' textfield
	public boolean DcitySuggestions() {
		To.click();
		return Todropdown.isDisplayed();	
	}
	
	public void DcharacterAcceptance(String city) {
		To.click();
		To.sendKeys(city);
		Srchbtn.click();
	}
	
	public void DSpecialharacterAcceptance(String Specialchar) {
		To.click();
		To.sendKeys(Specialchar);	
		Srchbtn.click();
	}
	
	public void DnumberAcceptance(String Testno) {
		To.click();
		To.sendKeys(Testno);
		Srchbtn.click();
	}
	
	public void DAlphaNumeric(String TestAlphaNumeric) {
		To.click();
		To.sendKeys(TestAlphaNumeric);
		Srchbtn.click();
	}
	
	public void DCountryOrCity(String City) {
		To.click();
		To.sendKeys(City);
		Srchbtn.click();
	}
	
	public void DoriginLeftBlank() {
		To.click();
		Srchbtn.click();
	}
	
	//Scenarios for 'Date' textfield.
	public void DateFieldClick() {
		DepDate.click();	
	}
	
	public void SelectDate() {
		DepDate.click();
		DDate.click();	
	}
	public void SelectNextTwoMonthDate() {
		DepDate.click();
		NextMonth.click();
        NextMonthDate.click();
	}
	
	//Scenarios for Traveller(s) drop-down menu.
	public void TravellersDropdown() {
		Travellersdropdown.click();	
	}
	
	public boolean TravellersDropdownDisplay() {
		return TravellersdropdownMenu.isDisplayed();	
	}
	
	public void TravellersDropdownAdultAddDel() {
		Travellersdropdown.click();	
		AdultAdd.click();
		AdultDel.click();
	}
	public void TravellersDropdownChildAddDel() {
		Travellersdropdown.click();	
		ChildAdd.click();
		ChildDel.click();
	}
	public void TravellersDropdownInfantAddDel() {
		Travellersdropdown.click();	
		InfantsAdd.click();
		InfantsDel.click();
	}
	

	//FlightsCompleteCode
	public void searchFlights(String fromCity, String toCity,String departureDate) 
			throws Exception {
		
		Flights.click();
		Onwaytrip.click();
		
		From.click();
		//Thread.sleep(5000);
		SelectFromdropdown1.click();

		//Thread.sleep(5000); 
	
		To.click();
		SelectTodropdown.click();
		//Thread.sleep(5000);
	  
		DepDate.click();
		DDate.click();
		//Thread.sleep(5000);

		Srchbtn.click();
		//Thread.sleep(5000);
		
		
	}
		
		public void flightlist() throws Exception {
		Thread.sleep(5000);
		Booknowbtn.click();
		}
		
		/*
		 * public void MoreFareOption() throws InterruptedException {
		 * //Thread.sleep(5000); ContinueBtn.click(); }
		 */
		
		public void Review(String Email) throws Exception {
			
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,950)", "");
		
		//Thread.sleep(5000);
		Insuranceclick.click();
		//Thread.sleep(5000);
		
		EnterValidEmail.sendKeys(Email);
		//Thread.sleep(5000);
		
		//Thread.sleep(5000);
		ContinuebookingBtn.click();
		}
		
		public void Travellers(String PhoneNo, String firstname, String lastname, String Titlename) throws Exception {
			
		Thread.sleep(5000);
		Dropdowntitle.click();
		
		Thread.sleep(2000);
		Select dropdown = new Select(Dropdowntitle);  
		
		Thread.sleep(2000);
		dropdown.selectByVisibleText(Titlename); 
		
		//Thread.sleep(2000);
		Firstname.sendKeys(firstname);
		
		//Thread.sleep(2000);
		Lastname.sendKeys(lastname);
		
		//Thread.sleep(2000);
		EnterValidPhoneNo.sendKeys(PhoneNo);
		
		ContinueBooking.click();
		
		//Thread.sleep(10000);
		
		}
		
		
		//For Data-Driven Test flight search
		public void searchFlightsForExcelData(String fromCity, String toCity, String ddate)
				throws Exception {
				
				Flights.click();
				Onwaytrip.click();
				//Thread.sleep(1000);
				
				From.click();
				//Thread.sleep(5000);
				WebElement FCity = driver.findElement(By.xpath("//li[contains(.,'"+fromCity+"')]"));
				System.out.println(FCity);
				FCity.click();

				//Thread.sleep(5000); 
			
				To.click();
				//Thread.sleep(5000); 
				WebElement TCity = driver.findElement(By.xpath("//*[@id=\"toautoFill\"]/div/div/ul/li[contains(.,'"+toCity+"')]"));//Custom xpath for city 
				System.out.println(TCity);
				TCity.click();
				//Thread.sleep(5000);
			  
				DepDate.click();
				//Thread.sleep(5000);
				WebElement dedate = driver.findElement(By.id("frth_2_23/11/2021"));
				//WebElement dedate = driver.findElement(By.id("frth_2_"+ddate+""));
				dedate.click();
				//Thread.sleep(5000);

				Srchbtn.click();
				Thread.sleep(5000);
				
			}
	
	}
