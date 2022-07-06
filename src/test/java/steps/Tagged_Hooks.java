package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Tagged_Hooks {
	
	private WebDriver driver;
	
	public Tagged_Hooks(CommonSteps commonsteps) {
		driver = commonsteps.getdriver();
	}

	
	@Before (value="@Smoke", order=0)
	public void Beforetaggedhook(){
		System.out.println("Before scenario tagged hook");
	}
	
	@After (value="@Smoke", order=0)
	public void Aftertaggedhook(){
		System.out.println("After scenario tagged hook");
	}
	
	
}
