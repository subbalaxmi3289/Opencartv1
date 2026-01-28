package testcases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.DataProviders;
import pageObjects.homepage;
import pageObjects.loginpage;
import pageObjects.myaccountpage;
import testbase.baseclass;

public class logintest_ddt extends baseclass {
	
	@Test(dataProvider ="LoginData", dataProviderClass = DataProviders.class, groups = "Datadriven")
	public void verify_login_ddt(String email, String pwd, String result) {
		try {
		logger.info("*****test case started**********");		
		homepage hp = new homepage(driver);
		hp.clickmyaccount();
		hp.clickloginoptn();
		logger.info("clicked on login btn");
		
		//loginpage
		loginpage lp = new loginpage(driver);
		logger.info("login page opened enetering the details");
		lp.setemailid(email);
		lp.setpassword(pwd);
		lp.clickloginbtn();
		
		//my account page
		myaccountpage Ac = new myaccountpage(driver);
		Boolean targetmsg = Ac.myacctext();
		
		/***
		try {
			Assert.assertTrue(targetmsg);
			logger.info("*************test passed****************");
		}
		catch(AssertionError e) {
			logger.error("*************test failed**************");
			throw e;
		}
		***/
		
		String actualresult = targetmsg ? "valid" : "invalid" ;
		
		if(targetmsg)
		{
			Ac.clicklogout();
			logger.info("*********page logged out ********");
		}
		result = result.trim().toLowerCase();
		System.out.println("DEBUG targetmsg = " + targetmsg);
		Assert.assertEquals(actualresult, result, "login mismatch for given credentials");
		}
		catch(Exception e)
		{
			Assert.fail("An exception occurred: " + e.getMessage());	
		}
       logger.info("********finished logout testcase ***********");
	}	
}