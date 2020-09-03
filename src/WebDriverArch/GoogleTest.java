package WebDriverArch;

public class GoogleTest {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		String browser = "chrome";
		
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}else if (browser.equals("FireFox")) {
		    driver = new FireFoxDriver();
		}
		
		
//		WebDriver driver = new FireFoxDriver();
//		driver.get("http://www.google.com");
//		driver.findElement("Search");
//		driver.quit();
		 
		//WebDriver driver = new ChromeDriver();
		//driver.get("http://www.google.com");
		//driver.findElement("Search");
		//driver.quit();
			
			

	}

}
