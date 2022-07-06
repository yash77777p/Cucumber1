package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayAdvanceSearch_Elements {

	private WebDriver driver;

	
	@FindBy(xpath ="//a[@id=\"gh-la\"]") public WebElement ebayLogo;
	@FindBy(xpath = "//input[@id='_nkw']") public WebElement keyword;
	@FindBy(xpath = "//input[@id='_ex_kw']") public WebElement exclude;
	@FindBy(xpath = "//input[@title='Enter minimum price range value']") public WebElement minPrice;
	@FindBy(xpath = "//input[@title='Enter maximum price range value']") public WebElement maxPrice;
	@FindBy(xpath = "//button[@id='searchBtnLowerLnk']") public WebElement searchbtn;
	//@FindBy(xpath = "//button[@id='searchBtnLowerLnk']") public WebElement searchbtn;
	//@FindBy(xpath = "//button[@id='searchBtnLowerLnk']") public WebElement searchbtn;
	//@FindBy(xpath = "//button[@id='searchBtnLowerLnk']") public WebElement searchbtn;
	
	

	
	
	
	public EbayAdvanceSearch_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
