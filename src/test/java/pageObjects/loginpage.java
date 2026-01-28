package pageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage extends basepage{
	
	public loginpage(WebDriver driver) {
		super(driver);
	}
	
//locators
@FindBy(xpath = "//input[@name = 'email']")
WebElement emailid;

@FindBy(xpath ="//input[@name = 'password']")
WebElement password;

@FindBy(xpath ="//input[@type = 'submit']")
WebElement submitbtn;


public void setemailid(String mailid) {
	emailid.sendKeys(mailid);
}

public void setpassword(String pwd) {
	password.sendKeys(pwd);
}

public void clickloginbtn() {
	submitbtn.click();
}

}