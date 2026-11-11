package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;//WebDriver is a predefined interface to launch browser
	
	public void intializebrowser() {
		driver = new ChromeDriver(); // to initialize browser
		driver.get("https://selenium.qabible.in");//to open the url given
		driver.manage().window().maximize();//to maximize the window
	}
	public void closebrowser() {
		//driver.close();//closes current tab only
		//driver.quit();//closes all tabs
	}

	public static void main(String[] args) {
		Base call = new Base();
		call.intializebrowser();
		
		call.closebrowser();
		

	}

}
