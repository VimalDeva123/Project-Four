package Browser_Open;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Browser {
	
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		for (int i = 0 ; i < 3 ; i++)
		{
			driver.navigate().refresh();
		}
		
		
		
	}
}
