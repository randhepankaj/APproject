package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

  

public class FlightBookingPage {
	WebDriver driver;
 
	@FindBy (xpath = "//li[@data-cy='oneWayTrip']")
	private WebElement oneWayButton;
	
	@FindBy (xpath = "//li[@data-cy='roundTrip']")
	private WebElement roundTripButton;
	
	@FindBy (xpath = "//li[@data-cy='mulitiCityTrip']")
	private WebElement multiCityButton;
	
	@FindBy (xpath= "//label[@for='fromCity']")
	private WebElement fromCity;
	
	@FindBy (xpath ="//label[@for='toCity']")
	private WebElement toCity;
	
	@FindBy (xpath ="//label[@for='departure']")
	private WebElement departureDate;
	
	@FindBy (xpath= "//label[@for='return']")
	private WebElement returnDate;
	
	@FindBy (xpath ="//label[@for='travellers']")
	private WebElement traveller;
	
	@FindBy (xpath ="//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")
	private WebElement searchFlighButton;
	
	@FindBy (xpath = "//input[@placeholder='From']")
	private WebElement fromButton;
	
	@FindBy (xpath="(//div[@class=\"calc60\"])[1]")
	private WebElement cityname1;
	
	@FindBy (xpath = "//input[@id='toCity']")
	private WebElement toButton;
	
	@FindBy (xpath="//p[text()='Bengaluru, India']")
	private WebElement cityname2;
	
	@FindBy (xpath= "(//div[@class='dateInnerCell'])[28]")
	private WebElement selectDepartureDate;
	
	@FindBy (xpath= "(//div[@class='dateInnerCell'])[45]")
	private WebElement selectReturnDate;
	
	@FindBy (xpath= "//li[@data-cy='adults-2']")
	private WebElement adult;
	
	@FindBy (xpath="//button[text()='APPLY']")
	private WebElement applyButton;
	

	
	public FlightBookingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickonOneWayButton() {
		oneWayButton.click();
	}
	
	public void clickonrountTripButton() {
		roundTripButton.click();
	}
	public void clickonMultiCityButton() {
		multiCityButton.click();
	}
	
	public void clickOnFromCityButton() {
		fromCity.click();
	}
	
	public void enterFirstCityName() {
		cityname1.click();
	}
	
	public void clickOnToCityButton() {
		toCity.click();
	}
	
	public void enterSecondCityName() {
		cityname2.click();
	}
	
	public void selectDepartureDate() {
		departureDate.click();
	}
	
	public void selectReturnDate() {
		returnDate.click();
	}
	
	public void selectTravellers() {
		traveller.click();
	}
	
	public void clickonSearchButton() {
		searchFlighButton.click();
	}
	
	public void enterStartCity() {
		fromButton.sendKeys("Pune");
	}
	
	public void enterEndCity() {
		toButton.sendKeys("Banglore");
	}
	
	public void selectInnerDepartureDate() throws InterruptedException {

		Actions act = new Actions(driver);
	    Thread.sleep(3000);
		act.moveToElement(selectDepartureDate).click().build().perform();
		
	}
	
	public void selectInnerReturnDate() {
		selectReturnDate.click();
	}
	
	public void selectAdult() {
		adult.click();
	}
	public void clickonApply() {
		applyButton.click();
	}
	
	
	
}

