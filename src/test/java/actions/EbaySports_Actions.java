package actions;

import org.openqa.selenium.WebDriver;

import elements.EbaySports_Elements;
import steps.CommonSteps;

public class EbaySports_Actions {
	
	WebDriver driver;
	EbaySports_Elements ebaySports_elements;
	
	
	public EbaySports_Actions(CommonSteps  commonsteps) {
		this.driver = commonsteps.getdriver();
		ebaySports_elements = new EbaySports_Elements(driver);
	}
	
	public void clickonwintersportscategory() {
		ebaySports_elements.wintersprots.click();
	}
	
	public void clickonsportslink() {
		ebaySports_elements.sportslink.click();
	}

	
	
}
