package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.base;

public class TestCase9_page extends base {
	
	@FindBy(xpath="//a[normalize-space()='Home']")
	WebElement homebtn;
	
	@FindBy(xpath="//a[contains(text(),'Products')]")
	WebElement productbtn;
	
	@FindBy(xpath="//h2[contains(text(),'All Products')]")
	WebElement allproducttext;
  
	@FindBy(xpath="//input[@id='search_product']")
	WebElement searchbtn;
	
	@FindBy(xpath="//button[@id='submit_search']")
	WebElement submitsearch;
	
	@FindBy(xpath="//h2[@class='title text-center']")
	WebElement searchproducts;
	
	@FindBy(xpath="//div[@class='col-sm-4']/div/div/div/p")
	List<WebElement> productssearched;
	
	public TestCase9_page(WebDriver driver) {
		this.driver=driver;
		this.js=(JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(55));
	}
	
	public TestCase9_page Test9() {
		webelementclickbtn(homebtn);
		equalchecktext("Automation Exercise");
		webelementclickbtn(productbtn);
		ifelsechecking(allproducttext);
		webelementsendkey(searchbtn,"Winter Top");
		webelementclickbtn(submitsearch);
		ifelsechecking(searchproducts);
		System.out.println("Totals products with the name - Winter Top and products available are : "+productssearched.size());
		
		return this;
	}
	
}
