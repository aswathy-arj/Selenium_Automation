package selenium_basics;

public class NavigationCommands extends Base{
	public void navigateCommand() {
		driver.navigate().to("https://www.amazon.in");//navigate to another url
		driver.navigate().back();//to navigate back to obsqura qabible.
		driver.navigate().forward();//navigate back to amazon
		driver.navigate().refresh();//to refresh current page
	}

	public static void main(String[] args) {
		NavigationCommands obj = new NavigationCommands();
		obj.intializebrowser();
		obj.navigateCommand();
		obj.closebrowser();
		
		

	}

}
