package test_Scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import demo_Project.TestNG_Base;
import pages.LoginPage;
import utilities.Excel_Utilities;

public class Login_Test extends TestNG_Base{
	@Test
	public void verifyUserLoginWithValidCredentials() throws IOException {
		
		String User_Name = Excel_Utilities.readStringData(0, 0, "LoginData");
		String PassWord = Excel_Utilities.readStringData(0, 1, "LoginData");
		
		
		LoginPage toaccessLoginPage = new LoginPage(driver);//to access LoginPage create object of loginpage
		toaccessLoginPage.enterUsernameInUsernameField(User_Name);
		toaccessLoginPage.enterPasswordInPasswordField(PassWord);
		toaccessLoginPage.clickLoginButton();
		
		
		//everything removed after pasting in page class
		
	}
	@Test
	public void verifyUserLoginWithInvalidCredentials() throws IOException {
		String User_Name = Excel_Utilities.readStringData(1, 0, "LoginData");
		String PassWord = Excel_Utilities.readStringData(1, 1, "LoginData");
		
		
		LoginPage toaccessLoginPage = new LoginPage(driver);//to access LoginPage create object of loginpage
		toaccessLoginPage.enterUsernameInUsernameField(User_Name);
		toaccessLoginPage.enterPasswordInPasswordField(PassWord);
		toaccessLoginPage.clickLoginButton();
	}
	@Test
	public void verifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException {
		String User_Name = Excel_Utilities.readStringData(2, 0, "LoginData");
		String PassWord = Excel_Utilities.readStringData(2, 1, "LoginData");
		
		
		LoginPage toaccessLoginPage = new LoginPage(driver);//to access LoginPage create object of loginpage
		toaccessLoginPage.enterUsernameInUsernameField(User_Name);
		toaccessLoginPage.enterPasswordInPasswordField(PassWord);
		toaccessLoginPage.clickLoginButton();
	}
	@Test
	public void verifyUserLoginWithInvalidUsernameAndValidPassword() throws IOException {
		String User_Name = Excel_Utilities.readStringData(3, 0, "LoginData");
		String PassWord = Excel_Utilities.readStringData(3, 1, "LoginData");
		
		
		LoginPage toaccessLoginPage = new LoginPage(driver);//to access LoginPage create object of loginpage
		toaccessLoginPage.enterUsernameInUsernameField(User_Name);
		toaccessLoginPage.enterPasswordInPasswordField(PassWord);
		toaccessLoginPage.clickLoginButton();
	}

}
