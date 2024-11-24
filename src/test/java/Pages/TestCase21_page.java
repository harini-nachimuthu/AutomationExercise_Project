package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.base;

public class TestCase21_page extends base{
  
	public TestCase21_page(WebDriver driver) {
		this.driver=driver;
		this.js=(JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(55));
	}
	
	@FindBy(xpath="//a[@href='/products']")
	WebElement productbtn;
	
	@FindBy(xpath="(//a[.='View Product'])[1]")
	WebElement firstviewproduct;
	
	@FindBy(id="name")
	WebElement reviewname;
	
	@FindBy(id="email")
	WebElement reviewemail;
	
	@FindBy(id="review")
	WebElement reviewbox;
	
	@FindBy(id="button-review")
	WebElement reviewsubmitbtn;
	
	@FindBy(xpath="//span[normalize-space()='Thank you for your review.']")
	WebElement successmsg;
	
	public TestCase21_page Test21() {
		webelementclickbtn(productbtn);
		equalchecktext("Automation Exercise - All Products");
		webelementclickbtn(firstviewproduct);
		webelementsendkey(reviewname,"Harini");
		webelementsendkey(reviewemail,"Harini@gmail.com");
		webelementsendkey(reviewbox,"The product quality and style for women is good... ");
		webelementclickbtn(reviewsubmitbtn);
		ifelsechecking(successmsg);
		return this;
	}
}
