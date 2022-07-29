package elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayHome_Elements {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[@id='gh-as-a']") public WebElement advancesearchlink;
	@FindBy(xpath = "//select[@class=\\\"gh-sb \\\"]") public WebElement categorydropdown;
	@FindBy(xpath="//select[@id=\\\"gh-cat\\\"]/option") public List<WebElement> categories;
	@FindBy(xpath="//input[@value=\\\"Search\\\"]") public WebElement searchbutton;
	@FindBy(xpath="//input[@class=\\\"gh-tb ui-autocomplete-input\\\"]") public WebElement searchbox;
	@FindBy(css="h1.srp-controls__count-heading>span.BOLD:first-child") public WebElement sresult1 ;
	@FindBy(css="h1.rsHdr>span.rcnt:first-child") public WebElement sresult2 ;
	@FindBy(xpath="//a[text()=\\\"Sign in\\\"]") public WebElement signinlink;
	@FindBy(id ="userid") public WebElement  usrname;
	@FindBy(id = "signin-continue-btn") public WebElement continuebtn;
	@FindBy(id ="pass") public WebElement  password;
	@FindBy(id = "sgnBt") public WebElement signinbtn;
	@FindBy(xpath="//b[@class=\\\"gh-eb-arw gh-sprRetina\\\"]") public WebElement hometext;
	@FindBy(linkText = "Sign out") public WebElement signoutlink;
//test


	
	
	//Going to create constructor for page factory
	public EbayHome_Elements(WebDriver driver) {        
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
}