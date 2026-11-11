package selenium_basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base{
	public void verifySimpleAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		
		WebElement clickMe1 = driver.findElement(By.id("alertButton"));
		clickMe1.click();
		Alert alert1 = driver.switchTo().alert();//to switch the driver control to alert
		alert1.accept();//accept() is used to click 'ok'
	}
	
	public void verifyConfirmAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		
		WebElement clickMe2 = driver.findElement(By.id("confirmButton"));
		clickMe2.click();
		Alert alert2 = driver.switchTo().alert();
		//alert2.accept(); //used to click ok
		alert2.dismiss();//dismiss() is used to click 'cancel'
	}
	
	public void verifyPromptAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		
		WebElement clickMe3 = driver.findElement(By.id("promtButton"));
		clickMe3.click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Aswathy");//sendKeys() is to enter text in the text field
		alert3.accept();
		
	}

	public static void main(String[] args) {
		AlertHandling alert = new AlertHandling();
		alert.intializebrowser();
		//alert.verifySimpleAlert();
		//alert.verifyConfirmAlert();
		alert.verifyPromptAlert();
		alert.closebrowser();
		

	}

}
