package selenium_basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsHandling extends Base{
	public void verifyRightclick() {
		
		WebElement othersTab = driver.findElement(By.id("others"));
		Actions action = new Actions(driver);
		action.contextClick(othersTab).build().perform();//contextClick() is to perform right click
	}
	
	public void verifyMousehover(){
		WebElement othersTab = driver.findElement(By.id("others"));
		Actions action = new Actions(driver);//Actions is a predefined class in selenium
		action.moveToElement(othersTab).build().perform();//moveToElement() is used to mousehover.
	}
	
	public void verifyDoubleclick() {
		WebElement othersTab = driver.findElement(By.id("others"));
		Actions action = new Actions(driver);
		action.doubleClick(othersTab).build().perform();//doubleClick() is used to double click
		
	}
	
	public void verifyDragandDrop() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag1 = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement dropbox = driver.findElement(By.id("mydropzone"));//Webelement for the box to drop the content
		Actions act = new Actions(driver);
		act.dragAndDrop(drag1, dropbox).build().perform();//dragAndDrop() used to drag and drop
		
	}
	
	public void verifyKeyboardActions() throws AWTException {//AWTexception occurs while using Robot class. Handle it with throws
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);//VK means virtual key. keyPress() is under KeyEvent is predefined class
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);//need to release the keys
		robot.keyRelease(KeyEvent.VK_T);
	}
	public static void main(String[] args) {
		ActionsHandling actions = new ActionsHandling();
		actions.intializebrowser();
		//actions.verifyRightclick();
		//actions.verifyMousehover();
		//actions.verifyDoubleclick();
		//actions.verifyDragandDrop();
		try {
			actions.verifyKeyboardActions();//AWTexception occurs in main method, handle it using try and catch
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
		actions.closebrowser();
		

	}

}
