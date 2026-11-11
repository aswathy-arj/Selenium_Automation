package selenium_basics;

import org.openqa.selenium.By;

public class Locators extends Base{
	public void verifyLocators() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.findElement(By.id("button-one"));//locating using id-id locator
		driver.findElement(By.className("btn btn-primary"));//class name locator
		driver.findElement(By.tagName("button"));//tag name locator
		driver.findElement(By.name("viewport"));//name locator
		driver.findElement(By.linkText("Simple Form Demo"));//link locator
		driver.findElement(By.partialLinkText("Simple"));//partial link text locator - can use this locator incase the link is lengthy
		driver.findElement(By.cssSelector("button[id='button-one']"));//locate using css selector
		//html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button - this is absolute xpath
		//tagname[@attribute='attributevalue'] - syntax of relative xpath(commonly used xpath)
		driver.findElement(By.xpath("//button[@id='button-one']"));//locate using relative xpath
		driver.findElement(By.xpath("//button[@type='button' and @id='button-one']"));//and operator
		driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));//or operator
		driver.findElement(By.xpath("//button[text()='Show Message']"));//incase tagname and text is provided
		driver.findElement(By.xpath("//button[starts-with(text(),'Show')]"));//for lengthy text
		driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']"));//xpath access methods-parent locating 
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));//xpath access method - child
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));//xpath access method - following
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));//xpath access method - preceding
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));//xpath access method - ancestor
		driver.findElement(By.xpath("//div[@class='card']//descendant::div"));//xpath access method - descendant
		driver.findElement(By.xpath("//div[@class='card']//descendant::div[@id='message-one']")); //descendant
	}

	public static void main(String[] args) {
		Locators n = new Locators();
		n.intializebrowser();
		n.closebrowser();
		

	}

}
