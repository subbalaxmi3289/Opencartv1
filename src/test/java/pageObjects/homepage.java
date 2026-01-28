package pageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage extends basepage{
	
	public homepage(WebDriver driver) {
		super(driver);	
	}

	
//locators
@FindBy(xpath = "//span[normalize-space() = 'My Account']")
WebElement linkmyaccount;
	
@FindBy(xpath = "//a[text() ='Register']")
WebElement registeroption;

@FindBy(xpath = "//a[text()='Login']")
WebElement loginoptn;
	
//actions
public void clickmyaccount() {
	linkmyaccount.click();
}

public void clickRegisteroptn() {
	registeroption.click();
}

public void clickloginoptn() {
	loginoptn.click();
}
}