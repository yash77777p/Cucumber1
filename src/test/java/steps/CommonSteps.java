package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class CommonSteps {
	
	
	private WebDriver driver;
	
	
	//@Before (order=1)
	@Before (order=1)
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Yogendra.Nikam\\\\eclipse-workspace\\\\cucumber1\\\\WebDriver\\\\ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println("Before scenario global hook");
	}
	
	//@Before (value="@Smoke", order=0)
	/*@Before (value="@Smoke")
	public void Beforetaggedhook(){
		System.out.println("Before scenario tagged hook");
	}*/
	
	
	//@After (order=1)
	@After (order=1)
	public void terdown(Scenario scenario) throws InterruptedException {
		if(scenario.isFailed()) {
			//Take Screenshot
			final byte[] scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(scr, "image/png", scenario.getName());
		}
		driver.close();
		Thread.sleep(1000);
		System.out.println("After scenario global hook");
	}
	
	//@After (value="@Smoke", order=0)
	/*@After (value="@Smoke")
	public void Aftertaggedhook(){
		System.out.println("After scenario tagged hook");
	}*/
	
	public WebDriver getdriver() {
		return driver;
	}

}
