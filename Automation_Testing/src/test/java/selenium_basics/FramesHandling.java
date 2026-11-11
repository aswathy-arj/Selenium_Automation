package selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FramesHandling extends Base{
	public void verifyFrames() {
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));//List<WebElement> -- collection concept
		System.out.println(frames.size());//size() is used to find the count.
		WebElement sampleframe = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(sampleframe);//to move driver from one place to another
		WebElement textFrame = driver.findElement(By.id("sampleHeading"));//driver has the control over frame
		System.out.println(textFrame.getText());
		driver.switchTo().defaultContent();//defaultContent() -- return back the control of driver from the frame
		
	}

	public static void main(String[] args) {
		FramesHandling frame = new FramesHandling();
		frame.intializebrowser();
		frame.verifyFrames();
		frame.closebrowser();
		

	}

}
