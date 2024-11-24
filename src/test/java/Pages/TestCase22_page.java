package Pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.base;

public class TestCase22_page extends base {
  
	public TestCase22_page(WebDriver driver) {
		this.driver=driver;
		this.js=(JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(55));
	}
	
	@FindBy(xpath="//h2[.='recommended items']")
	WebElement recommendeditems;
	
	@FindBy(xpath="//div[@class='carousel-inner']/div/div/div/div/div/a")
	List<WebElement> cartlistofproducts;
	
	@FindBy(xpath="//div[@class='carousel-inner']/div/div/div/div/div/p")
	List<WebElement> productnames;
	
	@FindBy(xpath="//button[.='Continue Shopping']")
	WebElement continueshopping;
	
	List<String> listvalues=new ArrayList();
	
	@FindBy(xpath="//a[.=' Cart']")
	WebElement cartbtn;
	
	@FindBy(xpath="//tbody/tr/td[2]/h4")
	List<WebElement> productnamesincart;
	
	@FindBy(xpath="(//i[@class='fa fa-angle-right'])[2]")
	WebElement rightarrow;
	
	public TestCase22_page Test22() {
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		ifelsechecking(recommendeditems);
		
//		for(int i=0;i<productnames.size();i++) {
//			if(i==3) {
//				webelementclickbtn(rightarrow);
//				listvalues.add(productnames.get(i).getText());
//			}else {
//				listvalues.add(productnames.get(i).getText());
//			}
//			
//		}
		listvalues.add("Blue Top");
		listvalues.add("Men Tshirt");
		listvalues.add("Sleeveless Dress");
		listvalues.add("Stylish Dress");
		listvalues.add("Winter Top");
		listvalues.add("Summer White Top");
		
		for(int i=0;i<cartlistofproducts.size();i++) {
			webelementclickbtn(cartlistofproducts.get(i));
			webelementclickbtn(continueshopping);
		}
		
		webelementclickbtn(cartbtn);
		for(int i=0;i<productnamesincart.size();i++) {
			if(listvalues.contains(productnamesincart.get(i).getText())) {
				System.out.println("Yes, The recommended product is added to cart  and product name is - "+productnamesincart.get(i).getText());
			}else {
				System.out.println("No, The recommended product is not added to cart  and product name is - "+productnamesincart.get(i).getText());
			}
		}
		return this;
	}
}
