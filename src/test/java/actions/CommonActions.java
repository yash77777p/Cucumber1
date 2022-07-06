package actions;

import org.openqa.selenium.WebDriver;

import steps.CommonSteps;

public class CommonActions {

	WebDriver driver;
	
	public CommonActions(CommonSteps commonsteps) {
		this.driver = commonsteps.getdriver();
	}
	
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
		
	}
	
	
	public String getCurrentTitle() {
		return driver.getTitle();		
	}
	
	
	public void launchApplication(String url) {
		driver.get(url);
		driver.manage().deleteAllCookies();
	}
	
	public void quitDriver() {
		driver.close();	  //to close all current active browser windows
		//driver.quit();  to close all open browser windows
	}
	
	
	
}
