package TestBases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBases {

	WebDriver driver;
	Properties prop;
	
	public void readprop() throws IOException {
		prop = new Properties();
		FileInputStream  fileIn = new FileInputStream(System.getProperty("user.dir")+ "/src/test/resources/config.properties") ;
		prop.load(fileIn);
	}
	@BeforeClass
	public void testSetUp() throws IOException {
		readprop(); //read property file
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	
	}
	
	@AfterClass
	public void teardown() {
		
		driver.quit();
	}
}
