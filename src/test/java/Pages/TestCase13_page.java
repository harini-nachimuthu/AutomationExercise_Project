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

public class TestCase13_page extends base {
  
	@FindBy(xpath="//a[normalize-space()='Home']")
	WebElement homebtn;
	
	@FindBy(xpath="//body/section[2]/div/div/div[2]/div/div[9]/div/div[2]/ul/li/a[.='View Product']")
	WebElement viewproductbtn;
	
	@FindBy(xpath="//div[@class='product-information']")
	WebElement productdetails;
	
	@FindBy(xpath="//input[@id='quantity']")
	WebElement quantity;
	
	@FindBy(xpath="//button[@class='btn btn-default cart']")
	WebElement addtocart;
	
	@FindBy(xpath="//u[.='View Cart']")
	WebElement viewcart;
	
	@FindBy(xpath="//button[@class='disabled']")
	WebElement quantitychecking;
	
	
	public TestCase13_page(WebDriver driver) {
		this.driver=driver;
		this.js=(JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(55));
	}
	
	public TestCase13_page Test13() {
		webelementclickbtn(homebtn);
		equalchecktext("Automation Exercise");
		webelementclickbtn(viewproductbtn);
		ifelsechecking(productdetails);
		quantity.clear();
		webelementsendkey(quantity,"4");
		webelementclickbtn(addtocart);
		webelementclickbtn(viewcart);
		String actual=quantitychecking.getText();
		if(actual.equals("4")) {
			System.out.println("Yes given product is added to cart...");
		}else {
			System.out.println("No given product is not added to cart...");
		}
		return this;
	}
}
