package selenium_basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base{
	public void verifyMultipleWindow() {
		driver.navigate().to("https://demo.guru99.com/popup.php");
		
		String firstWindowId = driver.getWindowHandle();
		WebElement clickhere = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickhere.click();//to navigate to next page
		Set<String> handleIds = driver.getWindowHandles();
		Iterator <String> handles = handleIds.iterator();
		while(handles.hasNext()) {
			String secondWindowId = handles.next();
			if(!secondWindowId.equals(firstWindowId)) {
				driver.switchTo().window(secondWindowId);
				
				WebElement email = driver.findElement(By.name("emailid"));
				email.sendKeys("aswathy.nk021@gmail.com");
				WebElement submit = driver.findElement(By.name("btnLogin"));
				submit.click();
			}
		}
	}

	public static void main(String[] args) {
		MultipleWindowHandling handling = new MultipleWindowHandling();
		handling.intializebrowser();
		handling.verifyMultipleWindow();
		handling.closebrowser();

	}

}
