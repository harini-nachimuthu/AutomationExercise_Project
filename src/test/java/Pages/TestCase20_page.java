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

public class TestCase20_page extends base {
  
	public TestCase20_page(WebDriver driver) {
		this.driver=driver;
		this.js=(JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(55));
	}
	
	@FindBy(xpath="//a[@href='/products']")
	WebElement productbtn;
	
	@FindBy(id="search_product")
	WebElement searchproductbox;
	
	@FindBy(id="submit_search")
	WebElement searchbtn;
	
	@FindBy(xpath="//div[@class='features_items']/div[@class='col-sm-4']/div/div/div/p")
	List<WebElement> listofsearchedproducts;
	
	@FindBy(xpath="//div[@class='features_items']/div[@class='col-sm-4']/div/div/div/a")
	List<WebElement> listofproducttocart;
	
	@FindBy(xpath="//button[.='Continue Shopping']")
	WebElement continueshopping;
	
	@FindBy(xpath="//a[.=' Cart']")
	WebElement cartbtn;
	
	public TestCase20_page Test20() {
		webelementclickbtn(productbtn);
		equalchecktext("Automation Exercise - All Products");
		
		String expectedcloth="Rust Red Linen Saree";
		webelementsendkey(searchproductbox,"Saree");
		webelementclickbtn(searchbtn);
		System.out.println("Total products available after particualr search : "+listofsearchedproducts.size());
		System.out.println("The product names are :: ");
		for(int i=0;i<listofsearchedproducts.size();i++) {
			String value=listofsearchedproducts.get(i).getText();
			System.out.println(value);
		}
		
		for(int i=0;i<listofsearchedproducts.size();i++) {
			String value=listofsearchedproducts.get(i).getText();
			if(value.equals(expectedcloth)) {
				System.out.println("Yes,Expected cloth is in searched products lists - "+value);
			}else {
				if(value.contains("Saree")) {
					System.out.println("The exact product expected product is not this one but this product contains what i searched for...");
				}
				
			}
		}
		
		for(int i=0;i<listofproducttocart.size();i++) {
			webelementclickbtn(listofproducttocart.get(i));
			webelementclickbtn(continueshopping);
		}
		return this;
	}
	
	@FindBy(xpath="//p[contains(text(),'Women > Saree')]")
	List<WebElement> cartpageproducts;
	
	@FindBy(xpath="//a[@class='cart_quantity_delete']")
	List<WebElement> deletefromcart;
	
	@FindBy(xpath="//p[contains(text(),'Click')]")
	WebElement textchecking;
	
	public TestCase20_page Test20_1() {
		webelementclickbtn(cartbtn);
		for(int i=0;i<cartpageproducts.size();i++) {
			ifelsechecking(cartpageproducts.get(i));
		}
		
		for(int i=0;i<deletefromcart.size();i++) {
			webelementclickbtn(deletefromcart.get(i));
		}
		ifelsechecking(textchecking);
		return this;
	}
}
