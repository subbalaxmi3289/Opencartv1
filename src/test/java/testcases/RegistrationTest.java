package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.homepage;
import pageObjects.registerpage;
import testbase.baseclass;



public class RegistrationTest extends baseclass {
	
	
	@Test(groups = {"Regression", "Master"})
	public void verify_account_registration() {
		logger.info("_______________test started_______________");

		homepage hp = new homepage(driver);
		hp.clickmyaccount();
		logger.info("_______________clicked on my account btn_______________");
	
		hp.clickRegisteroptn();
		logger.info("_______________clicked on registration_______________");
		
		registerpage regpage = new registerpage(driver);
		logger.info("_______________entering details_______________");
		regpage.setfirstname(randomeString());
		regpage.setlastname(randomeString());
		regpage.setemailid(randomeString()+ "@gmail.com");
		regpage.setphonenum(randomenumber());
		String samepwd = randomenumber();
		regpage.setpassword("samepwd");
		regpage.setconfirmpassword("samepwd");
		regpage.clicksubmitbtn();
		regpage.clickpolicybtn();
		regpage.clickcontinuebtn();
		try{
		String confirmmsg = regpage.getsuccessmsg();
		Assert.assertEquals(confirmmsg, "Your Account Has Been Created!");
		logger.info("_______________test passed and account created_______________");
		}
		catch(AssertionError e) {
			logger.error("________test is failed as confirm msg not matched__________");
			throw e;
		}
		
	}
	
}