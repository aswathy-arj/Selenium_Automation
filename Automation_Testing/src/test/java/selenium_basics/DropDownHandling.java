package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling extends Base {
	public void verifyDropdown() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdownMenu = driver.findElement(By.id("dropdowm-menu-1"));
		Select ddh = new Select(dropdownMenu);//creating object of the class 'Select'. Select is predefined class.
		ddh.selectByIndex(3);//to select the value by index number. Index always starts from 0.
		ddh.selectByValue("sql");//to select the value by attribute value.
		ddh.selectByVisibleText("SQL");//to select the value by text.
	}
	
	public void verifyCheckbox() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox = driver.findElement(By.xpath("//input[@value='option-1']"));
		checkbox.click();
		System.out.println(checkbox.isSelected());//predefined method to confirm checkbox is selected or not
	}
	
	public void verifyRadioButton() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radioButton = driver.findElement(By.xpath("//input[@value='purple']"));
		radioButton.click();
		System.out.println(radioButton.isSelected());//predefined method to confirm radiobutton is selected or not
	}

	public static void main(String[] args) {
		DropDownHandling drop = new DropDownHandling();
		drop.intializebrowser();
		drop.verifyDropdown();
		//drop.verifyCheckbox();
		//drop.verifyRadioButton();
		//drop.closebrowser();

	}

}
