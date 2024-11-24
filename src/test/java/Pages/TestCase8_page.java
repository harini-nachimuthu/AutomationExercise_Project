package Pages;

import org.testng.annotations.Test;
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

public class TestCase8_page extends base {
	
	
	@FindBy(xpath="//a[normalize-space()='Home']")
	WebElement homebtn;
	
	@FindBy(xpath="//a[contains(text(),'Products')]")
	WebElement productbtn;
	
	@FindBy(xpath="//h2[contains(text(),'All Products')]")
	WebElement allproducttext;
  
	@FindBy(xpath="//div[contains(@class, 'productinfo text-center')]//p")
	List<WebElement> productlists;
	
	@FindBy(xpath="(//div[@class='col-sm-4']/div/div[2]/ul/li/a[.='View Product'])[1]")
	WebElement firstviewproductbtn;
	
	
	@FindBy(xpath="//div[@class='product-information']/h2")
	WebElement productname;
	@FindBy(xpath="//div[@class='product-information']/p[1]")
	WebElement category;
	@FindBy(xpath="//div[@class='product-information']/span/span")
	WebElement price;
	@FindBy(xpath="//div[@class='product-information']/p[2]")
	WebElement quantity;
	@FindBy(xpath="//div[@class='product-information']/p[3]")
	WebElement condition;
	@FindBy(xpath="//div[@class='product-information']/p[4]")
	WebElement brand;
	
	public TestCase8_page(WebDriver driver) {
		this.driver=driver;
		this.js=(JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(55));
	}

	@Test
	public TestCase8_page test8() throws InterruptedException {
		webelementclickbtn(homebtn);
		equalchecktext("Automation Exercise");
		webelementclickbtn(productbtn);
		ifelsechecking(allproducttext);
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,0);");
		
		System.out.println("Total products availaible is :: "+productlists.size());
		for(WebElement product:productlists) {
			System.out.println(product.getText());
		}
		
		webelementclickbtn(firstviewproductbtn);
		ifelsechecking(productname);
		ifelsechecking(category);
		ifelsechecking(price);
		ifelsechecking(quantity);
		ifelsechecking(condition);
		ifelsechecking(brand);
		
		System.out.println("All the product details are available ....");
		return this;
		
	}
}
