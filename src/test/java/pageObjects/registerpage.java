package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registerpage extends basepage{
	
	public registerpage(WebDriver driver) {
		super(driver);
	}

//locators
@FindBy(xpath = "//input[@name='firstname']")
WebElement fname;

@FindBy(xpath = "//input[@name='lastname']")
WebElement lname;

@FindBy(xpath = "//input[@name='email']")
WebElement email;

@FindBy(xpath = "//input[@name='telephone']")
WebElement phnno;

@FindBy(xpath = "//input[@name='password']")
WebElement pwd;

@FindBy(xpath = "//input[@name='confirm']")
WebElement cpwd;

@FindBy(xpath = "//input[@name='newsletter' and @value='0']")
WebElement subbuttn;

@FindBy(xpath = "//input[@type='checkbox' and @value='1']")
WebElement policybtn;

@FindBy(xpath = "//input[@type='submit' and @value='Continue']")
WebElement continuebtn;

@FindBy(xpath = "//div[@id='content']/h1")
WebElement successmsg;
	


//Actions

public void setfirstname(String firstname) {
	fname.sendKeys(firstname);
	}

public void setlastname(String lastname) {
	lname.sendKeys(lastname);
}

public void setemailid(String emailid) {
	email.sendKeys(emailid);
}

public void setphonenum(String phnnum) {
	phnno.sendKeys(phnnum);
}

public void setpassword(String password) {
	pwd.sendKeys(password);
}

public void setconfirmpassword(String confpassword) {
	cpwd.sendKeys(confpassword);
}

public void clicksubmitbtn() {
	subbuttn.click();
}

public void clickpolicybtn() {
	policybtn.click();
}

public void clickcontinuebtn() {
	continuebtn.click();
}

public String getsuccessmsg() {
	try{
		return (successmsg.getText());
	}
	catch(Exception e) {
		return (e.getMessage());
	}
	
}
}
