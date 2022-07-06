package steps;

import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;

import actions.CommonActions;
import actions.EbayAdavanceSearch_Actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayAdvancedSearch_Steps {
	
	//WebDriver driver;
	CommonActions commonactions;
	EbayAdavanceSearch_Actions ebayAdavanceSearch_actions;
	
	/*
	public EbayAdvancedSearch(CommonSteps CommonSteps) {
		this.driver = CommonSteps.getdriver();
	}*/
	
	public EbayAdvancedSearch_Steps(CommonActions commonactions,EbayAdavanceSearch_Actions ebayAdavanceSearch_actions ) {
		this.commonactions = commonactions;
		this.ebayAdavanceSearch_actions = ebayAdavanceSearch_actions;
	}

	//WebDriver driver;
	
	@Given("I am on Advanced Search Page")
	public void i_am_on_Advanced_Search_Page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println("I am on Advanced Search Page");
		commonactions.launchApplication("https://www.ebay.com/sch/ebayadvsearch\r\n");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Yogendra.Nikam\\eclipse-workspace\\cucumber1\\WebDriver\\ChromeDriver/chromedriver.exe");
		//driver = new ChromeDriver();
		//driver.get("https://www.ebay.com/sch/ebayadvsearch\r\n");
		
		//driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	@When("I clicked on the Ebay Logo")
	public void i_clicked_on_the_Ebay_Logo() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println("I clicked on the Ebay Logo");
		//driver.findElement(By.xpath("//a[@id=\"gh-la\"]")).click();
		ebayAdavanceSearch_actions.clickonEbayLogo();
		Thread.sleep(1000);
		
	}

	@Then("I am navigated to Ebay Home Page")
	public void i_am_navigated_to_Ebay_Home_Page() {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println("I am navigated to Ebay Home Page");
		String expURL = "https://www.ebay.com/o";
		String actURl = commonactions.getCurrentUrl();   //driver.getCurrentUrl();
		//System.out.println(driver.getCurrentUrl());
		
		if(!expURL.equals(actURl)) {
			Assert.fail("Page does not navigated to correct page");
		}
		
		//driver.close();
	}

	@When("I serach the idem with advanced search fileds")
	public void i_serach_the_idem_with_advanced_search_fileds(DataTable datatable) throws InterruptedException {
	   
		/*
	    driver.findElement(By.xpath("//input[@id='_nkw']")).sendKeys(datatable.cell(1,0));
	    driver.findElement(By.xpath("//input[@id='_ex_kw']")).sendKeys(datatable.cell(1,1));
	    driver.findElement(By.xpath("//input[@title='Enter minimum price range value']")).sendKeys(datatable.cell(1,2));
	    driver.findElement(By.xpath("//input[@title='Enter maximum price range value']")).sendKeys(datatable.cell(1,3));
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@id='searchBtnLowerLnk']")).click();
	    */
		Thread.sleep(3000);

		ebayAdavanceSearch_actions.enterSearchkeyword(datatable.cell(1,0));
		ebayAdavanceSearch_actions.excluekeyword(datatable.cell(1,1));
		ebayAdavanceSearch_actions.enterMinprice(datatable.cell(1,2));
		ebayAdavanceSearch_actions.enterMAxprice(datatable.cell(1,3));
	    Thread.sleep(3000);

		ebayAdavanceSearch_actions.clickonSearchbtn();
		Thread.sleep(3000);

	}

	
}
