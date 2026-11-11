package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base{
	public void verifyTable() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement entireTable = driver.findElement(By.id("dtBasicExample"));
		System.out.println(entireTable.getText());//getText() to get(print) text in console
		
		WebElement tableheading = driver.findElement(By.xpath("//table[@id='dtBasicExample']/thead/tr[1]"));
		System.out.println(tableheading.getText());// to get heading
		
		WebElement tablecontentRow = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]"));
		System.out.println(tablecontentRow.getText()); // to get row details
		
		WebElement tablecontentcolumn = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]/td[3]"));
		System.out.println(tablecontentcolumn.getText()); // to get column details
	}

	public static void main(String[] args) {
		TableHandling table = new TableHandling();
		table.intializebrowser();
		table.verifyTable();
		table.closebrowser();
		

	}

}
