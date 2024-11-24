package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.base;

public class TestCase12_page extends base{
	
	@FindBy(xpath="//a[normalize-space()='Home']")
	WebElement homebtn;
	
	@FindBy(xpath="//a[@href='/products']")
	WebElement productbtn;
	
	@FindBy(xpath="(//a[.='Add to cart'])[1]")
	WebElement addtocart;
	
	@FindBy(xpath="(//a[@data-product-id='2'])[1]")
	WebElement addtocart2;
	
	@FindBy(xpath="//button[.='Continue Shopping']")
	WebElement continueshopping;
	
	@FindBy(xpath="//u[.='View Cart']")
	WebElement viewcart;
	
	@FindBy(xpath="//td[.='Price']")
	WebElement pricetablehead;
	
	@FindBy(xpath="//td[.='Quantity']")
	WebElement quantitytablehead;
	
	@FindBy(xpath="//td[.='Total']")
	WebElement totaltablehead;
	
	@FindBy(xpath="//tr[@id='product-1']/td[3]/p")
	WebElement product1price;
	
	@FindBy(xpath="//tr[@id='product-1']/td[4]")
	WebElement product1quantity;
	
	@FindBy(xpath="//tr[@id='product-1']/td[5]/p")
	WebElement product1total;
	
	@FindBy(xpath="//tr[@id='product-2']/td[3]/p")
	WebElement product2price;
	
	@FindBy(xpath="//tr[@id='product-2']/td[4]")
	WebElement product2quantity;
	
	@FindBy(xpath="//tr[@id='product-2']/td[5]/p")
	WebElement product2total;
	
	public TestCase12_page(WebDriver driver) {
		this.driver=driver;
		this.js=(JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(55));
	}
	
	public TestCase12_page Test12() {
		webelementclickbtn(homebtn);
		equalchecktext("Automation Exercise");
		webelementclickbtn(productbtn);
		
		Actions action=new Actions(driver);
		action.moveToElement(addtocart);
		action.click().build().perform();
		
		webelementclickbtn(continueshopping);
		
		action.moveToElement(addtocart2).click().build().perform();
		webelementclickbtn(viewcart);
		
		ifelsechecking(pricetablehead);
		ifelsechecking(quantitytablehead);
		ifelsechecking(totaltablehead);
		System.out.println("==================");
		ifelsechecking(product1price);
		ifelsechecking(product1quantity);
		ifelsechecking(product1total);
		System.out.println("==================");
		ifelsechecking(product2price);
		ifelsechecking(product2quantity);
		ifelsechecking(product2total);
		
		return this;
	}
}
