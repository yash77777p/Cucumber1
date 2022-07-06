package steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class EbayHomePage {
	WebDriver driver;
	

	public EbayHomePage(CommonSteps CommonSteps) {
		this.driver = CommonSteps.getdriver();
	}
 
	@Given("I am on Ebay Home Page")
	public void i_am_on_Ebay_Home_Page() {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Yogendra.Nikam\\eclipse-workspace\\cucumber1\\WebDriver\\ChromeDriver/chromedriver.exe");
	    //System.out.println("I am on Ebay Home Page");
		//driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
	}

	@When("I click on the Advanced link")
	public void i_click_on_the_Advanced_link() throws InterruptedException {
		//System.out.println("I click on the Advanced link");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='gh-as-a']")).click();
	}

	@Then("I navigate to advanced search page")
	public void i_navigate_to_advanced_search_page() {
		//System.out.println("I navigate to advanced search page");
		
		String expurl="https://www.ebay.com/sch/ebayadvsearch";
		String acturl=driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
		if(!expurl.equals(acturl)) {
			//fail("Page does not navigated to expected page");
			
			Assert.fail("Page does not navigated to correct page");
		}
		else {
			//Pass("Page navigated to expected page");s
		}
		//driver.close();
	}

	
	@When("I search for the {string} with category {string}")
	public void i_search_for_the_with_category(String searchitem, String drpvalue) throws InterruptedException {
		driver.findElement(By.xpath("//input[@class=\"gh-tb ui-autocomplete-input\"]")).sendKeys(searchitem);
		Thread.sleep(2000);
		
    //with using the select class
		//WebElement drp = driver.findElement(By.xpath("//select[@class=\"gh-sb \"]"));
		//Select seldrp = new Select(drp);
		//seldrp.selectByValue(drpvalue);
	
	//By using the list for dropdown options
		driver.findElement(By.xpath("//select[@class=\"gh-sb \"]")).click();
		List<WebElement> categories = driver.findElements(By.xpath("//select[@id=\"gh-cat\"]/option"));
		for(WebElement we : categories) {
			if(we.getAttribute("value").equals(drpvalue)){
				we.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();
		Thread.sleep(3000);
	}

	@Then("I validate the results count greather than {int} {string}")
	public void i_validate_the_results_count_greather_than(int count, String search) throws InterruptedException {
	    //String serresult = driver.findElement(By.xpath("(//h1[@class=\"srp-controls__count-heading\"]//span[@class=\"BOLD\"])[1]")).getText();
		String serresult;
		if(search.equals("normal")) {
		 serresult = driver.findElement(By.cssSelector("h1.srp-controls__count-heading>span.BOLD:first-child")).getText();
		}else {
		 serresult = driver.findElement(By.cssSelector("h1.rsHdr>span.rcnt:first-child")).getText();
		}
			
		
		int itemcount;
		if(serresult.contains(",")) {
	    String result = serresult.replace(",", "");
	     itemcount = Integer.parseInt(result);
		}else
		{
		itemcount =Integer.parseInt(serresult);
		}
		
	    if(itemcount<=count) {
	    	Assert.fail("Count is less than" + count );
	    }
	    Thread.sleep(3000);
	    //driver.close();
	}
	
	
	@When("I clicked on the sign in link")
	public void i_clicked_on_the_sign_in_link() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Sign in\"]")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("userid")).sendKeys("cvstestuipath@gmail.com");
		driver.findElement(By.id("signin-continue-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("Admin@123");
		driver.findElement(By.id("sgnBt")).click();
		Thread.sleep(5000);
	    
	}

	@Then("I validate the login operation with valid credentials")
	public void i_validate_the_login_operation_with_valid_credentials() throws InterruptedException {
		driver.findElement(By.xpath("//b[@class=\"gh-eb-arw gh-sprRetina\"]")).isDisplayed();
		driver.findElement(By.xpath("//b[@class=\"gh-eb-arw gh-sprRetina\"]")).click();
		Thread.sleep(3000);
		String expsrting ="Sign out";
		String actsrting = driver.findElement(By.linkText("Sign out")).getText();
	    
		if(!expsrting.equals(actsrting)) {
			Assert.fail("Login unsuccessful");
		}
	}
	
	@When("I clicked on the {string}")
	public void i_clicked_on_the(String string) throws InterruptedException {
	    driver.findElement(By.linkText(string)).click();
	    Thread.sleep(2000);
	}

	@Then("I validate page navigate to the correct {string} and title contains {string}")
	public void i_validate_page_navigate_to_the_correct_and_title_contains(String url, String title) {
	    String expurl = url;
	    String exptitle = title;
	    String acturl = driver.getCurrentUrl();
	    String acttitle = driver.getTitle();
	    
	    if(!expurl.equals(acturl)) {
	    	Assert.fail("Page does not navigated to expected URL");
	    }
	    
	    if(!acttitle.contains(exptitle)) {
	    	Assert.fail("Page does not navigated to correct page ");
	    }
	    
	}

}
