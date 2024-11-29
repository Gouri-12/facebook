package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	 public LoginPage(WebDriver driver) {
		 this.driver= driver;
		 PageFactory.initElements( driver, this);
		 
		 
 }
	@FindBy(xpath="//a[@data-testid=\"open-registration-form-button\"]") WebElement CreateAccountBtn;
	
	 //return fa=b current url
	 public String LoginPageUrl() {
		 String url = driver.getCurrentUrl();
		 return url;
		 
	 }
	 //check create account btn is displayed
	 public boolean createAcntDisplayed() {
		boolean f= CreateAccountBtn.isDisplayed();
		return f;
	 }
	 //click create acnt btn
	 public void createAcntClickable() {
		 CreateAccountBtn.click();
	 }

}
