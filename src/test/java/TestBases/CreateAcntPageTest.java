package TestBases;

import org.testng.annotations.Test;

import PageObjects.CreateAcntPage;
import PageObjects.LoginPage;

public class CreateAcntPageTest extends TestBases {
	CreateAcntPage ac;
	LoginPage lp;
	
	@Test
	public void testCreateAcnt() throws InterruptedException {
		ac = new CreateAcntPage(driver);
		lp = new LoginPage(driver);
	   lp.createAcntClickable();
	   ac.enterFirstName(prop.getProperty("fname"));
	  
	   ac.enterLasttName(prop.getProperty("lname"));
	   ac.enterBirthDay(prop.getProperty("day"));
	   ac.enterBirthMonth(prop.getProperty("month"));
	   ac.enterBirthYear(prop.getProperty("year"));
	   ac.selectGender(prop.getProperty("gender"));
	   ac.enterMail(prop.getProperty("gmail"));
	   ac.entePasswd(prop.getProperty("password"));
	   
	}
    
}
