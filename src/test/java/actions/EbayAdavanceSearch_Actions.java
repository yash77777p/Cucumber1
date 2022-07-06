package actions;

import org.openqa.selenium.WebDriver;

import elements.EbayAdvanceSearch_Elements;
import steps.CommonSteps;

public class EbayAdavanceSearch_Actions {

	private WebDriver driver;
	EbayAdvanceSearch_Elements ebayAdvanceSearch_Elements;
	
	public EbayAdavanceSearch_Actions(CommonSteps commonsteps) {
		this.driver = commonsteps.getdriver();
		ebayAdvanceSearch_Elements = new EbayAdvanceSearch_Elements(driver);
	}
	
	
	public void clickonEbayLogo() {
		ebayAdvanceSearch_Elements.ebayLogo.click();
	}
	
	public void enterSearchkeyword(String string) {
		ebayAdvanceSearch_Elements.keyword.sendKeys(string);
	}
	
	public void excluekeyword(String string) {
		ebayAdvanceSearch_Elements.exclude.sendKeys(string);
	}
	
	public void enterMinprice(String string) {
		ebayAdvanceSearch_Elements.minPrice.sendKeys(string);
	}
	
	public void enterMAxprice(String string) {
		ebayAdvanceSearch_Elements.maxPrice.sendKeys(string);
	}
	
	public void clickonSearchbtn() {
		ebayAdvanceSearch_Elements.searchbtn.click();
	}
	
}
