package com.emt.testcases;

import static org.junit.Assert.*;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.emt.base.Base;
import com.emt.pages.RoundTripFlightPage;
import com.emt.util.TestUtil;

public class RoundTripTest extends Base {

	RoundTripFlightPage flightPage;
	TestUtil utliclass;
	
	String sheetName = "Sheet1";

	public RoundTripTest() {
		super();
	}

	@BeforeMethod //intialising the classes
	public void setup() {
		intialization();
		flightPage = new RoundTripFlightPage();
		utliclass = new TestUtil();
	}
	
	//FromDropdown Test cases
	@Test(enabled= true)
	public void fromDropdownDisplayTest() throws Exception {
		flightPage.citySuggestions();
	}
	
	@Test(enabled= true)
	public void fromDropdownCharacterAcceptanceTest() throws Exception {
		flightPage.characterAcceptance(prop.getProperty("testcity"));
		assertEquals("Enter valid origin city",utliclass.Alert());
	}
	
	@Test(enabled= true)
	public void fromDropdownSpecialharacterAcceptanceTest() throws Exception {
		flightPage.SpecialharacterAcceptance(prop.getProperty("specialchar"));
		assertEquals("Enter valid origin city",utliclass.Alert());
	}
	
	@Test(enabled= true)
	public void fromDropdownNumberAcceptanceTest() throws Exception {
		flightPage.numberAcceptance(prop.getProperty("testno"));
		assertEquals("Enter valid origin city",utliclass.Alert());
	}
	
	@Test(enabled= true)
	public void fromDropdownAlphaNumericTest() throws Exception {
		flightPage.AlphaNumeric(prop.getProperty("alphanumeric"));
		assertEquals("Enter valid origin city",utliclass.Alert());
	}
	
	@Test(enabled= true)
	public void FromCountryOrCityTest() throws Exception {
		flightPage.CountryOrCity(prop.getProperty("city"));
		assertEquals("Enter valid origin city",utliclass.Alert());
	}

	@Test(enabled= true)
	public void FromoriginLeftBlankTest() throws Exception {
		flightPage.originLeftBlank();
		assertEquals("Enter valid origin city",utliclass.Alert());
	}
	
	//ToDropdown Test cases
	@Test(enabled= true)
	public void ToDropdownDisplayTest() throws Exception {
		flightPage.DcitySuggestions();
	}
	
	@Test(enabled= true)
	public void ToDropdownDSpecialharacterAcceptanceTest() throws Exception {
		flightPage.DSpecialharacterAcceptance(prop.getProperty("specialchar"));
		assertEquals("Enter valid destination city",utliclass.Alert());
	}
	
	@Test(enabled= true)
	public void ToDropdownCharacterAcceptanceTest() throws Exception {
		flightPage.DcharacterAcceptance(prop.getProperty("testcity"));
		assertEquals("Enter valid destination city",utliclass.Alert());
	}
	
	@Test(enabled= true)
	public void ToDropdownNumberAcceptanceTest() throws Exception {
		flightPage.DnumberAcceptance(prop.getProperty("testno"));
		assertEquals("Enter valid destination city",utliclass.Alert());
	}
	
	@Test(enabled= true)
	public void ToDropdownAlphaNumericTest() throws Exception {
		flightPage.DAlphaNumeric(prop.getProperty("alphanumeric"));
		assertEquals("Enter valid destination city",utliclass.Alert());
	}
	
	@Test(enabled= true)
	public void ToCountryOrCityTest() throws Exception {
		flightPage.DCountryOrCity(prop.getProperty("city"));
		assertEquals("Enter valid destination city",utliclass.Alert());
	}

	@Test(enabled= true)
	public void ToOriginLeftBlankTest() throws Exception {
		flightPage.DoriginLeftBlank();
		assertEquals("Enter valid destination city",utliclass.Alert());
	}
	//Scenarios for 'Date' textfield.
	@Test(enabled= true)
	public void DateFieldClickTest() throws Exception {
		flightPage.DateFieldClick();
	}
	@Test(enabled= true)
	public void SelectDateTest() throws Exception {
		flightPage.SelectDate();
	}
	@Test(enabled= true)
	public void SelectNextTwoMonthDateTest() throws Exception {
		flightPage.SelectNextTwoMonthDate();
	}
	
	//Travellers dropdown
	@Test(enabled= true)
	public void TravellersDropdownTest() throws Exception {
		flightPage.TravellersDropdown();
	}
	
	@Test(enabled= true)
	public void TravellersDropdownMenuDisplayTest() throws Exception {
		flightPage.TravellersDropdownDisplay();
	}
	

	@Test(enabled=true)
	public void TravellersDropdownAdultAddDelTest() throws Exception {
		flightPage.TravellersDropdownAdultAddDel();
	}

	@Test(enabled=true)
	public void TravellersDropdownChildAddDelTest() throws Exception {
		flightPage.TravellersDropdownChildAddDel();
	}

	@Test(enabled=true)
	public void TravellersDropdownInfantAddDelTest() throws Exception {
		flightPage.TravellersDropdownInfantAddDel();
	}
	
	
	//Dataprovider
	@DataProvider
	public Object[][] getTestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
		
	}
	//Excel sheet
	@Test(enabled=true,dataProvider="getTestData")
	public void searchFlightsForRoundTripTest(String fromcity, String tocity, String ddate) 
			throws Exception {
		flightPage.searchFlightsForExcelData(fromcity, tocity, ddate);
		assertEquals("RoundTrip Lowest Airfare, Flight Tickets, Cheap Air Tickets – EaseMyTrip.com",
				driver.getTitle());
	}
	
	//Flight complete code
	@Test(enabled= true)
	public void flightPageTest() throws Exception {
		flightPage.searchFlights(prop.getProperty("fromcity"), prop.getProperty("tocity"),
				prop.getProperty("departuredate"), prop.getProperty("returndate"));
		assertEquals("RoundTrip Lowest Airfare, Flight Tickets, Cheap Air Tickets – EaseMyTrip.com", 
				driver.getTitle());
		flightPage.flightlist();
		flightPage.MoreFareOption();
		flightPage.Review(prop.getProperty("user"));
		flightPage.Travellers(prop.getProperty("phno"),prop.getProperty("firstname"),
				prop.getProperty("lastname"),prop.getProperty("title"));
		assertEquals("FlightPayment Lowest Airfare, Flight Tickets, Cheap Air Tickets – EaseMyTrip.com",
				driver.getTitle());	
	}

	@AfterMethod // Closing the browser after executing all test cases
	public void tearDown() { 
		driver.quit();
	}
}