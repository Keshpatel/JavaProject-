package JavaSession;

public class Browser {

	
	public void launchBrowser() {
		System.out.println("launching browser....");
			OSCompatibility();	
			
			System.out.println("Browser Launched");
	}
	
	private void OSCompatibility() {		
		System.out.println("checking OS comapa...");
		OsFreeSpaceRAM();
	}
	private void OsFreeSpaceRAM() {
		System.out.println("Checking OS free RAM space....");
		BrowserVersion();
	}
	private void BrowserVersion() {
		System.out.println("checking br version.....");
	}
			
}
