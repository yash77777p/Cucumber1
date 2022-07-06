package actions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import elements.EbayHome_Elements;
import steps.CommonSteps;

public class EbayHomePage_Actions {

	WebDriver driver;
	EbayHome_Elements ebayHome_elements;

	public EbayHomePage_Actions(CommonSteps commonsteps) {
		this.driver = commonsteps.getdriver();
	    ebayHome_elements = new EbayHome_Elements(driver);
	}
	
	

	public void clickOnAdvanceSearch() {
		ebayHome_elements.advancesearchlink.click();
	}

	public void serarchItem(String searchitem) {
		ebayHome_elements.searchbox.sendKeys(searchitem);

	}

	public void selectCategory(String drpvalue) {
		ebayHome_elements.categorydropdown.click();
		List<WebElement> cat = ebayHome_elements.categories;
		for (WebElement we : cat) {
			if (we.getAttribute("value").equals(drpvalue)) {
				we.click();
				break;
			}
		}

	}

	public void clickOnSearchbtn() {
		ebayHome_elements.searchbutton.click();
	}

	
	public int getcount(String srctype) {
		String serresult;
		if (srctype.equalsIgnoreCase("normal")) {
			  serresult = ebayHome_elements.sresult1.getText();
			
		}else {
			  serresult = ebayHome_elements.sresult2.getText();
		}
		
		int fincnt;
		if(serresult.contains(",")) {
	    String result = serresult.replace(",", "");
	    fincnt = Integer.parseInt(result);
		}else
		{
		fincnt =Integer.parseInt(serresult);
		}
		
		return fincnt;	
		
	}
	
}