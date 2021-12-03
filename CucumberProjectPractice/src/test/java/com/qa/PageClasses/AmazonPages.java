package com.qa.PageClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonPages {
	WebDriver driver;
	
	
	@FindBy(id="searchDropdownBox")
	WebElement categoryList;
	public Select setCategoryList()
	{
		return new Select(categoryList);
		
	}
	
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchBox;
	public WebElement setSearchText() {
		return searchBox;
	}
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchBtn;
	public WebElement getSearchbtn() {
		return searchBtn;
	}
	
	
	public AmazonPages(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
