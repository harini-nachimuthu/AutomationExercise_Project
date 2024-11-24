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

public class TestCase15_page extends base{
 
	public TestCase15_page(WebDriver driver) {
		this.driver=driver;
		this.js=(JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(55));
	}
	
	@FindBy(xpath="//li[contains(.,'Logged in as Harini')]")
	WebElement loggedinas;
	
	@FindBy(xpath="(//a[@data-product-id='19'])[1]")
	WebElement addtocartinhome;
	
	@FindBy(xpath="//button[.='Continue Shopping']")
	WebElement continueshopping;
	
	@FindBy(xpath="//a[.=' Cart']")
	WebElement cartbtn;
	
	@FindBy(xpath="//a[.='Proceed To Checkout']")
	WebElement checoutbtn;
	
	@FindBy(xpath="//ul[@id='address_delivery']")
	WebElement adressdetails;
	
	@FindBy(xpath="//ul[@id='address_invoice']")
	WebElement invoicedetails;
	
	@FindBy(xpath="//textarea[@name='message']")
	WebElement commentbox;
	
	@FindBy(xpath="//a[.='Place Order']")
	WebElement placeorderbtn;
	
	public TestCase15_page Test15() {
		ifelsechecking(loggedinas);
		webelementclickbtn(addtocartinhome);
		webelementclickbtn(continueshopping);
		webelementclickbtn(cartbtn);
		equalchecktext("Automation Exercise - Checkout");
		webelementclickbtn(checoutbtn);
		ifelsechecking(adressdetails);
		ifelsechecking(invoicedetails);
		webelementsendkey(commentbox,"Place order on time ....");
		webelementclickbtn(placeorderbtn);
		
		return this;
	}
}
