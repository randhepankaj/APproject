package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 {
	@FindBy (xpath ="//span[@class ='chNavIcon appendBottom2 chSprite chFlights active']" )
	private WebElement flightButton;
	
	@FindBy (xpath = "//span[@class ='chNavIcon appendBottom2 chSprite chHotels active']")
	private WebElement hotelsButton;
	
	@FindBy (xpath ="(//a[@class = 'makeFlex hrtlCenter column'])[4]")
	private WebElement trainButton;
	
	public Page1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickonflightButton() {
		flightButton.click();
	}
	
	public void clickonHotelButton() {
		hotelsButton.click();
	}
	
	public void clickonTrainButton() {
		trainButton.click();
	}
	

}
