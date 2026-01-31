package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productpage extends basepage {
	
	public productpage(WebDriver driver) {
		super(driver);
	}

@FindBy(xpath = "//div[@id ='content']/h1")
WebElement iphone_heading;

@FindBy(xpath = "//div[@class = 'image']//img[@alt = 'iPhone']")
WebElement pro_picture;

@FindBy(xpath = "//span[normalize-space()= 'Add to Cart']")
WebElement cart_btn;

@FindBy(xpath = "//div[contains(@class , alert-success) and contains(text(), ' Success: You have added ')]")
WebElement display_successmsg;


public boolean prod_heading() {
	return iphone_heading.isDisplayed();
}

public boolean prod_image() {
	return pro_picture.isDisplayed();
}

public void add_to_cart_btn() {
	cart_btn.click();
}

public boolean successmsg() {
   return display_successmsg.isDisplayed();
}
}