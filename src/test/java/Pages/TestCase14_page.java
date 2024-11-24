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

public class TestCase14_page extends base{
  
	@FindBy(xpath="//a[normalize-space()='Home']")
	WebElement homebtn;
	
	@FindBy(xpath="(//a[contains(@data-product-id,'4')])[1]")
	WebElement addtocartbtn;
	
	@FindBy(xpath="//button[.='Continue Shopping']")
	WebElement continueshopping;
	
	@FindBy(xpath="//a[.=' Cart']")
	WebElement cartbtn;
	
	@FindBy(xpath="//a[.='Proceed To Checkout']")
	WebElement checoutbtn;
	
	@FindBy(xpath="//u[.='Register / Login']")
	WebElement registerandloginbtn;
	
	public TestCase14_page(WebDriver driver) {
		this.driver=driver;
		this.js=(JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(55));
	}
	
	public TestCase14_page Test14() {
		webelementclickbtn(homebtn);
		equalchecktext("Automation Exercise");
		webelementclickbtn(addtocartbtn);
		webelementclickbtn(continueshopping);
		webelementclickbtn(cartbtn);
		equalchecktext("Automation Exercise - Checkout");
		webelementclickbtn(checoutbtn);
		webelementclickbtn(registerandloginbtn);
		return this;
	}
	
	@FindBy(xpath="//li[contains(.,'Logged in as Harini')]")
	WebElement loggedinas;
	
	@FindBy(xpath="//ul[@id='address_delivery']")
	WebElement adressdetails;
	
	@FindBy(xpath="//ul[@id='address_invoice']")
	WebElement invoicedetails;
	
	@FindBy(xpath="//textarea[@name='message']")
	WebElement commentbox;
	
	@FindBy(xpath="//a[.='Place Order']")
	WebElement placeorderbtn;
	
	public TestCase14_page Test14_1() {
		ifelsechecking(loggedinas);
		webelementclickbtn(cartbtn);
		webelementclickbtn(checoutbtn);
		ifelsechecking(adressdetails);
		ifelsechecking(invoicedetails);
		webelementsendkey(commentbox,"Place order on time ....");
		webelementclickbtn(placeorderbtn);
		return this;
	}
	
	@FindBy(xpath="//input[@name='name_on_card']")
	WebElement cardname;
	
	@FindBy(xpath="//input[@name='card_number']")
	WebElement cardnos;
	
	@FindBy(xpath="//input[@name='cvc']")
	WebElement cvc;
	
	@FindBy(xpath="//input[@name='expiry_month']")
	WebElement expirymonth;
	
	@FindBy(xpath="//input[@name='expiry_year']")
	WebElement expiryyear;
	
	@FindBy(xpath="//button[.='Pay and Confirm Order']")
	WebElement payandconfirm;
	
	@FindBy(xpath="//p[.='Congratulations! Your order has been confirmed!']")
	WebElement success;
	
	public TestCase14_page Test14_2() {
		webelementsendkey(cardname,"Nordea");
		webelementsendkey(cardnos,"4539 0123 4567 8901");
		webelementsendkey(cvc,"422");
		webelementsendkey(expirymonth,"04");
		webelementsendkey(expiryyear,"2011");
		webelementclickbtn(payandconfirm);
		ifelsechecking(success);
		
		return this;
	}
}
