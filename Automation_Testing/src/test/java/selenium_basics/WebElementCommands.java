package selenium_basics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementCommands extends Base{
	public void verifyWebElementCommands() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement textbox = driver.findElement(By.id("single-input-field"));//creating webelement of the textbox.
		//'WebElement' as datatype, 'textbox' as reference name(the name should be meaningful)
		//Right hand side - how to locate the element using id first(if id is not working take another one)
		
		textbox.sendKeys("Automation");//to input a value "sendKeys()" is used.
		
		WebElement showmessage = driver.findElement(By.id("button-one"));
		WebDriverWait explicitwait = new WebDriverWait(driver, Duration.ofSeconds(5));//WebDriverWait is a predefined class to apply explicit wait
		explicitwait.until(ExpectedConditions.elementToBeClickable(showmessage));//ExpectedConditions is a predefined class
		
		Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);//wait is an interface to apply fluent wait
		//need to pass webdriver -- FluentWait class -- 
		fluentwait.until(ExpectedConditions.elementToBeClickable(showmessage));
		
		System.out.println(showmessage.isDisplayed());//predefined method to check whether webelement is displayed or not 
		System.out.println(showmessage.isEnabled());//predefined method to check whether the buttons are enabled or not
		
		showmessage.click();//click() is used to click the button 
		WebElement yourmessage = driver.findElement(By.id("message-one"));
		System.out.println(yourmessage.getText());//getText() is used to get the text printed in console
		System.out.println(yourmessage.getTagName());//getTagName() is used to get the tag name of any element.
		System.out.println(showmessage.getCssValue("background-color"));//getCssValue() is used to get the Css value 
		//System.out.println(yourmessage.getCssValue("margin"));
		textbox.clear();//clear() to clear any texts in the textbox field.
	}

	public static void main(String[] args) {
		WebElementCommands web = new WebElementCommands();
		web.intializebrowser();
		web.verifyWebElementCommands();
		web.closebrowser();
		

	}

}
