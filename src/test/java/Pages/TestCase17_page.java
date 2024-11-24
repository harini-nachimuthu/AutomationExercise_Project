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

public class TestCase17_page extends base {
  
	@FindBy(xpath="//a[normalize-space()='Home']")
	WebElement homebtn;
	
	@FindBy(xpath="(//a[@data-product-id='19'])[1]")
	WebElement addtocartinhome;
	
	@FindBy(xpath="//button[.='Continue Shopping']")
	WebElement continueshopping;
	
	@FindBy(xpath="//a[.=' Cart']")
	WebElement cartbtn;
	
	@FindBy(xpath="//a[@class='cart_quantity_delete']")
	WebElement cutcartproduct;
	
	@FindBy(xpath="(//p[@class='text-center'])[3]")
	WebElement cartemptycheck;
	
	public TestCase17_page(WebDriver driver) {
		this.driver=driver;
		this.js=(JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(55));
	}
	
	public TestCase17_page Test17() throws InterruptedException {
		webelementclickbtn(homebtn);
		equalchecktext("Automation Exercise");
		webelementclickbtn(addtocartinhome);
		webelementclickbtn(continueshopping);
		webelementclickbtn(cartbtn);
		equalchecktext("Automation Exercise - Checkout");
		webelementclickbtn(cutcartproduct);
		ifelsechecking(cartemptycheck);
		return this;
	}
}
