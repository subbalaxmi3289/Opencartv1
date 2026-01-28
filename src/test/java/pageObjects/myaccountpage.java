package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class myaccountpage extends basepage{
	
	public myaccountpage(WebDriver driver) {
		super(driver);
	}
	
@FindBy(xpath = "//h2[text() ='My Account']")
WebElement msgheading;

@FindBy(xpath = "//div[@class ='list-group']//a[text() ='Logout']")
WebElement logoutoption;

public boolean myacctext() {
	try 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.visibilityOf(msgheading)).isDisplayed();
	}
	catch(Exception e) 
	{
		return false;
	}

}

public void clicklogout() {
	logoutoption.click();
}
}