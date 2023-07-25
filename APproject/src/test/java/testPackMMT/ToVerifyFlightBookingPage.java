package testPackMMT;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.FlightBookingPage;
import Pages.Page1;

public class ToVerifyFlightBookingPage {
	WebDriver driver;
	Page1 page;
	FlightBookingPage flightbookingpage;
	
	
	
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Class Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		page= new Page1(driver);
		flightbookingpage = new FlightBookingPage(driver);
	}
	 
	
	
	@BeforeMethod
	 public void openWebsite() {
		
	    driver.get("https://www.makemytrip.com/");
		
	}
	
	
	
	@Test
	public void verifyflightSearchButtonOnHomepage() throws InterruptedException {
		driver.navigate().refresh();
		driver.manage().window().maximize();
		page.clickonflightButton();
		flightbookingpage.clickOnFromCityButton();
		Thread.sleep(3000);
		flightbookingpage.enterStartCity();
		Thread.sleep(3000);
		flightbookingpage.enterFirstCityName();
		flightbookingpage.enterEndCity();
		flightbookingpage.enterSecondCityName();
		Thread.sleep(3000);
		flightbookingpage.selectDepartureDate();
		Thread.sleep(5000);
		flightbookingpage.selectInnerDepartureDate();
		Thread.sleep(3000);
//		flightbookingpage.selectReturnDate();
//		Thread.sleep(3000);
//		flightbookingpage.selectInnerReturnDate();
//		Thread.sleep(3000);
		flightbookingpage.selectTravellers();
		flightbookingpage.selectAdult();
		flightbookingpage.clickonApply();
		flightbookingpage.clickonSearchButton();
		String ActualURL = driver.getCurrentUrl();
		String expectedURL ="https://www.makemytrip.com/flights/";
		
		//Assert.assertEquals(ActualURL, expectedURL);
		
		
	}
	
	@Test
	public void checkBookFlight() throws InterruptedException {
		Thread.sleep(9000);
//		//flightbookingpage.clickonOneWayButton();
//		flightbookingpage.clickOnFromCityButton();
//		flightbookingpage.enterStartCity();
//		flightbookingpage.enterFirstCityName();
//		flightbookingpage.enterEndCity();
//		flightbookingpage.enterSecondCityName();
//		flightbookingpage.selectDepartureDate();
//		flightbookingpage.selectInnerDepartureDate();
//		flightbookingpage.selectReturnDate();
//		flightbookingpage.selectInnerReturnDate();
//		flightbookingpage.selectTravellers();
//		flightbookingpage.selectAdult();
//		flightbookingpage.clickonApply();
//		flightbookingpage.clickonSearchButton();
}
	

}
