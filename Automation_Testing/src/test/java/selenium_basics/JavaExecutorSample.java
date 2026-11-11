package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaExecutorSample extends Base{ //javasriptexecutor is predefined interface
	//
	public void verifyJavaScript() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		JavascriptExecutor js =(JavascriptExecutor) driver;//this is called casting because cannot create obj for interface. 
		js.executeScript("arguments[0].click();", showMessageButton);//executeScript() is used to perform click function. arguments[0].click() is constant syntax
		js.executeScript("window.scrollBy(0,350)","");//scrolling is the main function. executeScript() is also used to scroll. 0 is X axis and 350 is Y axis.
	//Y axis value is positive - scroll down, Y axis value is negative - scroll up
		//350 = pixel value. If this line is repeated the page scroll down again or we can increase the pixel value.
		//Normally used scrollBy().
	}
	
	public static void main(String[] args) {
		JavaExecutorSample java = new JavaExecutorSample();
		java.intializebrowser();
		java.verifyJavaScript();
		java.closebrowser();
		
		

	}

}
