package com.demo.AsianPaints;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaintsAndColors1StepDefination {
	WebDriver driver;
     
	@Given("I am on the Asian Paints Website")
	public void i_am_on_the_Asian_Paints_Website() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("WebDriver.chrome.driver","‪chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.asianpaints.com/");//web driver method
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
	}

	@When("I click on the Paint and Colours link in the navigation menu")
	public void i_click_on_the_Paint_and_Colours_link_in_the_navigation_menu() {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().refresh();
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath( "(//span[@class='iconTextLinks__text visible-in-Desktop'])[1]"))).perform();
		
	}

	@Then("the Paint and Colours section should load without errors")
	public void the_Paint_and_Colours_section_should_load_without_errors() {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	}
	

	@When("I click on the Interior Textures")
	public void i_click_on_the_Interior_Textures() {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().refresh();
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("(//span[@class='iconTextLinks__text visible-in-Desktop'])[1]"))).perform();
		actions.moveToElement(driver.findElement(By.xpath("(//a[@href='https://www.asianpaints.com/catalogue/interior-textures.html'])[2]"))).click().perform();
	}

	@Then("I should be taken to the interior textures page")
	public void i_should_be_taken_to_the_interior_textures_page() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@When("I click on the Exterior Textures")
	public void i_click_on_the_Exterior_Textures() {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().refresh();
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("(//span[@class='iconTextLinks__text visible-in-Desktop'])[1]"))).perform();
		actions.moveToElement(driver.findElement(By.xpath("//a[@href='https://www.asianpaints.com/catalogue/exterior-textures.html']"))).click().perform();
	}

	@Then("I should be taken to the exterior textures page")
	public void i_should_be_taken_to_the_exterior_textures_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("I click on the Wood Paints")
	public void i_click_on_the_Wood_Paints() {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().refresh();
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("(//span[@class='iconTextLinks__text visible-in-Desktop'])[1]"))).perform();
		actions.moveToElement(driver.findElement(By.xpath("//a[@href='https://www.asianpaints.com/products/wood-and-metals.html']"))).click().perform();
	}

	@Then("I should be taken to the wood paints page")
	public void i_should_be_taken_to_the_wood_paints_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("I click on the Metal Paints")
	public void i_click_on_the_Metal_Paints() {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().refresh();
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("(//span[@class='iconTextLinks__text visible-in-Desktop'])[1]"))).perform();
		actions.moveToElement(driver.findElement(By.xpath("//a[@href='https://www.asianpaints.com/products/wood-and-metals/metal-enamels.html']"))).click().perform();
	}

	@Then("I should be taken to the metal paints page")
	public void i_should_be_taken_to_the_metal_paints_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
//	@When("I select taken to the paint store near me page")
//	public void  i_should_be_taken_to_paint_store_near_me() {
//		driver.navigate().refresh();
//		Actions actions = new Actions(driver);
//		actions.moveToElement(driver.findElement(By.xpath("(//span[@class='iconTextLinks__text visible-in-Desktop'])[1]"))).perform();
//		actions.moveToElement(driver.findElement(By.xpath("(//a[@href='https://www.asianpaints.com/store-locator.html'])[2]"))).perform();
//	}
//	@When("I should enter valid {string}")
//	public void i_should_enter_valid(String string)
//	{
//		driver.findElement(By.xpath("(//input[@placeholder='Enter Pincode'])[2]")).sendKeys(string);
//	}
//	 // Write code here that turns the phrase above into concrete actions
//	
//	@When("I click on search")
//	public void i_click_on_search() {
//		driver.findElement(By.xpath("(//span[@class='spriteIcon-Aprevamp ctaIco'])[2]")).click();
//		// Write code here that turns the phrase above i2nto concrete actions
//		}
//	 @Then("I should see a list of paint store near me")
//	 public void i_should_see_a_paint_store_near_me() {
//		 // Write code here that turns the phrase above into concrete actions
//		 }
}
