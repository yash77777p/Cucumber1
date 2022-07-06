package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbaySports_Elements {
	WebDriver driver;
	@FindBy(xpath="//div[text()='Winter Sports']") public WebElement wintersprots;
	@FindBy(linkText = "Sports") public WebElement sportslink;
	

	public EbaySports_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 
}
