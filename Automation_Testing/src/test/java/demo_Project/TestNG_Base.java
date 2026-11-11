package demo_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNG_Base {
public WebDriver driver;//WebDriver is a predefined interface to launch browser
	
	@BeforeMethod
	public void intializebrowser() {
		driver = new ChromeDriver(); // to initialize browser
		driver.get("https://www.saucedemo.com");//to open the url given
		driver.manage().window().maximize();//to maximize the window
	}
	@AfterMethod
	public void closebrowser() {
		//driver.close();//closes current tab only
		//driver.quit();//closes all tabs
	}

}
