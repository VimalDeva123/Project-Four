package I_Frame;

import org.openqa.selenium.chrome.ChromeDriver;

public class I_Frame_Elements {
	
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.switchTo().frame("firstFr");
		driver.findElementByXPath("//input[@name='fname']").sendKeys("Vimal");
		
	}

}
