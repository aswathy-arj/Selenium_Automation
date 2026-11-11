package selenium_basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base{
	public void verifyFileUploadusingSendKeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		
		WebElement file = driver.findElement(By.id("uploadfile_0"));
		file.sendKeys("C:\\Users\\arjun\\eclipse-workspace\\Automation_Testing\\src\\test\\resources\\English QP STD VII.docx.pdf");//sendKeys() can be used to click "upload file" and upload file by adding the path
		
		WebElement checkboxclick = driver.findElement(By.id("terms"));
		checkboxclick.click();
		
		WebElement submitbutton = driver.findElement(By.id("submitbutton"));
		submitbutton.click();
	}
	
	public void verifyFileUploadusingRobotClass() throws AWTException {//
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement robotclass = driver.findElement(By.id("pickfiles"));
		robotclass.click();
		StringSelection select = new StringSelection("C:\\Users\\arjun\\eclipse-workspace\\Automation_Testing\\src\\test\\resources\\English QP STD VII.docx.pdf");//to select the file
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);//Toolkit is a predefined class to store some predefined methods to
		Robot r = new Robot();
		r.delay(2500);//to wait 2500ms
		//r.keyPress(KeyEvent.VK_ENTER);//not mandatory
		//r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void main(String[] args) {
		FileUpload upload = new FileUpload();
		upload.intializebrowser();
		//upload.verifyFileUploadusingSendKeys();
		try {
			upload.verifyFileUploadusingRobotClass();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		upload.closebrowser();
		

	}

}
