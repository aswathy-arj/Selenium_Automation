package selenium_basics;

public class BrowserCommands extends Base {//Class 'Base' acts as Parent and class 'BrowserCommands' acts as Child.
	public void verifyCommands() {
		String title = driver.getTitle();//to get the title
		System.out.println(title);//to print the title in console
		String url = driver.getCurrentUrl();//to get the url
		System.out.println(url);//to print the url in console
		String handleId = driver.getWindowHandle();//getWindowHandle - to get single window
		//getWindowHandles - to get multiple windows
		System.out.println(handleId);//Id changes on each execution
		String source = driver.getPageSource();//to get the html code of the page
		System.out.println(source);
	}

	public static void main(String[] args) {
		BrowserCommands a = new BrowserCommands();
		a.intializebrowser();
		a.verifyCommands();
		a.closebrowser();
		
		

	}

}
