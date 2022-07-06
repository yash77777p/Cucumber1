package steps;

import org.junit.Assert;

import actions.CommonActions;
import actions.EbaySports_Actions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbaySportPage_Steps {

	EbaySports_Actions ebaySports_actions;
	CommonActions commonactions;
	public EbaySportPage_Steps(CommonActions commonactions , EbaySports_Actions ebaySports_actions) {
		this.ebaySports_actions = ebaySports_actions;
		this.commonactions = commonactions;
	}
	
	
	@When("I clicked on sprots link")
	public void i_clicked_on_sprots_link() throws InterruptedException {
		ebaySports_actions.clickonsportslink();
		Thread.sleep(3000);
		ebaySports_actions.clickonwintersportscategory();
		Thread.sleep(3000);
	}

	@Then("I validate the winter sports category")
	public void i_validate_the_winter_sports_category() throws InterruptedException {
	    
		
		String expurl ="https://www.ebay.com/b/Winter-Sports/36259/bn_1853285";
		String acturl = commonactions.getCurrentUrl();
		
		if(!expurl.equals(acturl)) {
			Assert.fail("I am validated to incorect page");	}
		Thread.sleep(2000);
		
	}

	
}
