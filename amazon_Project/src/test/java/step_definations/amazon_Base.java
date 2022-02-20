package step_definations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class amazon_Base extends Base {
	@Given("I am in Amazon Page")
	public void i_am_in_amazon_page() {
	    navigateURL("https://amazon.com");
	    assertEquals(isDisplayed(By.xpath("//a[@id='nav-logo-sprites']")), true);
	}

	@When("I search for Blenders")
	public void i_search_for_blenders() {
	 sendKeys(By.xpath("//input[@id='twotabsearchtextbox']"), "Blenders");
	 click(By.xpath("//input[@id='nav-search-submit-button']"));
	 assertEquals(isDisplayed(By.xpath("//div[@class='sg-col-inner']//span[@class='rush-component']/a/div/img")), true);
	}

	@When("I click on any project")
	public void i_click_on_any_project() {
	 
	}
	//div[@class='sg-col-inner']//span[@class='rush-component']/a/div/img

	@When("I add the product to cart")
	public void i_add_the_product_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I go to my cart")
	public void i_go_to_my_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("it should have {int} item in it")
	public void it_should_have_item_in_it(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I remove the item from my cart")
	public void i_remove_the_item_from_my_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
