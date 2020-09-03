package WebDriverArch;

public class RemoteWebDriver implements WebDriver{

	@Override
	public void get(String url) {
		System.out.println("Launch URL: " +url);
		
		
	}

	@Override
	public void quit() {
		System.out.println("Quit the browser");
		
	}
	
	@Override
	public void findElement(String element) {
		System.out.println("find the element ....");
	}

}
