package TestBases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginPage;

public class LoginPageTest extends TestBases{
	LoginPage log;
	@Test
	public void testNavigateLogin() {
		log = new LoginPage(driver);
		String url  =log.LoginPageUrl();
		Assert.assertEquals(url,prop.getProperty("url"));
		
	}
	@Test
	public void testCreateAcntBTN() {
		log = new LoginPage(driver);
		boolean b = log.createAcntDisplayed();
		Assert.assertTrue(b);
	}
	
}
