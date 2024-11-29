package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAcntPage {
	WebDriver driver;
	Select sd;
	 public CreateAcntPage(WebDriver driver) {
		 this.driver= driver;
		 PageFactory.initElements( driver, this);
	 }
		 @FindBy(xpath="//input[@name=\"firstname\"]") WebElement FirstnameBox;
		 @FindBy(xpath="//input[@name=\"lastname\"]") WebElement LastnameBox;
		 @FindBy(xpath="//select[@id=\"day\"]") WebElement BirthDay;
		 @FindBy(xpath="//select[@id=\"month\"]") WebElement Month;
		 @FindBy(xpath="//select[@id=\"year\"]") WebElement BirthYear;
		 @FindBy(xpath="//span[@data-name=\"gender_wrapper\"]//label") List<WebElement> Gender;
		 @FindBy(xpath="//span[@data-name=\"gender_wrapper\"]//label//input[@type=\"radio\"]") List<WebElement> GenderCheckbox;
		 @FindBy(xpath="//input[@name=\"reg_email__\"]") WebElement EmailEnter;
		 @FindBy(xpath="//input[@name=\"reg_passwd__\"]") WebElement PasswordEnter;
		 public void enterFirstName(String fname) {
			 FirstnameBox.sendKeys(fname);
			 
		 }
		 public void enterLasttName(String lname) throws InterruptedException {
			
			 LastnameBox.sendKeys(lname);
			 
		 }
		 public void enterBirthDay(String day) {
			 sd = new Select(BirthDay);
			 sd.selectByVisibleText(day);
		 }
		 public void enterBirthMonth(String month) throws InterruptedException {
			 Thread.sleep(3000);

			 sd = new Select(Month);
			 sd.selectByVisibleText(month);
}
		 public void enterBirthYear(String y) {
			 sd = new Select(BirthYear);
			 sd.selectByVisibleText(y);
}
		 public void selectGender(String ge) {
			int list = Gender.size();
			System.out.println(list);
			int l = GenderCheckbox.size();
			System.out.println(l);
			 for(int i=0; i<list;i++) {
				 WebElement g = Gender.get(i);
				 String s = g.getText();
				 if(s.equals(ge)) {
					 WebElement c = GenderCheckbox.get(i);
					 c.click();
					 break;
				 }
			 }
		 }
		 public void enterMail(String email) {
			 EmailEnter.sendKeys(email);
		 }
		 public void entePasswd(String password) {
			PasswordEnter.sendKeys(password);
		 }
		 
}