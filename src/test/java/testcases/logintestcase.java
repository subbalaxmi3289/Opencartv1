package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.loginpage;
import pageObjects.myaccountpage;
import pageObjects.homepage;
import testbase.baseclass;

public class logintestcase extends baseclass {
	
	@Test(groups = {"Sanity", "Master"})
	public void verify_logintest() {
		logger.info("**********Starting the testcase**************");
		
		//homepage
		homepage hp = new homepage(driver);
		hp.clickmyaccount();
		hp.clickloginoptn();
		logger.info("clicked on login btn");
		
		//loginpage
		loginpage lp = new loginpage(driver);
		logger.info("login page opened enetering the details");
		lp.setemailid(p.getProperty("emailid"));
		lp.setpassword(p.getProperty("password"));
		lp.clickloginbtn();
		
		//my account page
		myaccountpage Ac = new myaccountpage(driver);
		Boolean targetmsg = Ac.myacctext();
		try {
			Assert.assertTrue(targetmsg);
			logger.info("*************test passed****************");
		}
		catch(AssertionError e) {
			logger.error("*************test failed**************");
			throw e;
		}
		
	}
	
}