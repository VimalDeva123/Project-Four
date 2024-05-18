package Java_script_Executor;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Executor {
	public static void main(String[]args) throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.executeScript("return document.title"));
		System.out.println(driver.executeScript("return document.URL"));
		
		// Zoom in using JS Executor
		
		driver.executeScript("document.body.style.zoom='200%'");
		
		Thread.sleep(5000);
		
		driver.executeScript("document.body.style.zoom='150%'");
		
		Thread.sleep(5000);
		
		driver.executeScript("document.body.style.zoom='20%'");
	}
}



