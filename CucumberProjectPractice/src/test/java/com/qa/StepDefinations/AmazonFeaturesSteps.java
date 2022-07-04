package com.qa.StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.PageClasses.AmazonPages;

import io.cucumber.java.en.*;

public class AmazonFeaturesSteps {
	
	WebDriver driver;
	AmazonPages pageObj;
	

	@Given("setup the Browser")
	public void setup_the_browser() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\java\\com\\qa\\Utilities\\ExternalDownloads\\chromedriver.exe");					
	    driver= new ChromeDriver();
	    pageObj=new AmazonPages(driver);
	    
	}



	
	@Given("User should be present on Amazon.in page")
	public void user_should_be_present_on_amazon_in_page() {
		pageObj=new AmazonPages(driver);
		driver.get("https://www.amazon.in/");
	}

	@When("User Selects the category and Select Books as category")
	public void user_selects_the_category_and_select_books_as_category() {
		
		pageObj.setCategoryList().selectByVisibleText("Books");
		
	    
	}

	@And("User Enters the Vince code  Book on search Box")
	public void user_enters_the_vince_code_book_on_search_box() {
		pageObj.setSearchText().sendKeys("Da Vinci Code");
	}

	@And("Hits the Search button")
	public void hits_the_search_button() {
		
		pageObj.getSearchbtn().click();
	    
	}

	@Then("validate the Results count")
	public void validate_the_results_count() {
		
		System.out.println(driver.getTitle());
	    
	}
	
	@Then("Close the Browser")
	public void close_the_browser() {
	   
		driver.close();
		driver.quit();
	}


}
