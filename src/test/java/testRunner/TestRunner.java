package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"Features"}, 
     	glue = {"steps"}, 
     	//plugin = {"pretty", "html:Report1"},
		plugin = {"pretty" ,"json:target/json-report/cucumber.json" , "html:target/html-report/cucumber.html"},
		// plugin = {"Pretty" ,"junit:Report3"}
		//dryRun = true,                       //true - to find scenario which have step definition file are missing 
		dryRun = false,                   //false - It run the scenario which have steps [not check where steps are missing or not]
		strict = true,       //Compulsory to add scenario steps for all the feature files ,
		                     //if steps are not present it marked as failed - it work independent of dryRun option
		monochrome = true,   //To display output display in more readable format  
		tags = "@sports" //{"@p2 or @p1"}    //we can use and , or to add multiple tags
		//tags= {"@p6 or @p22"}
		//name = {"Logo"}        //if particular keyword is present in scenario name only if that scenario will get execute / multiple scenario
		)

public class TestRunner {

	
}
