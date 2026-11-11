package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {  // no need to extend base class
	public WebDriver driver; //instance variable--need the control of driver in login page.
	
	public LoginPage(WebDriver driver) { // created constructor---local variable
		//passing Webdriver
		this.driver=driver; //this keyword is used because instance variable and local variables are same
	
		//to initialize driver initElements method is used. init() is inside predefined class called page factory 
		PageFactory.initElements(driver, this);// "this" is to represent the second driver
		
		
	}
	
	//to find elements and performing actions
	//to find elements use annotation @FindBy -- this annotation is provided by the class page factory.
	@FindBy(id="user-name")WebElement userName; //this is how we find element
	//to input value
	public void enterUsernameInUsernameField(String User_Name) { // actions can be done through creating method
		userName.sendKeys(User_Name); 
	}
	
	@FindBy(id="password")WebElement password;
	public void enterPasswordInPasswordField(String PassWord) {
		password.sendKeys(PassWord);
	}
	
	@FindBy(id="login-button")WebElement loginButton;
	public void clickLoginButton() {
		loginButton.click();
	}
	
	
}
