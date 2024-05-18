package Dropdown_Handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Drop_Down {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		
		
		JavascriptExecutor JS =  (JavascriptExecutor) driver;
		Thread.sleep(5000);
		JS.executeScript("window.scrollBy(0,350);");
	    driver.findElementByXPath("//div[@id='withOptGroup']").click();
		driver.findElementByXPath("//div[text()='Group 1, option 2']").click();	
		Thread.sleep(5000);
		
		// Multiple Dropdown Selection
		JS.executeScript("window.scrollBy(0,150);");
		driver.findElementByXPath("//div[text()='Select...']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[text()='Green']").click();
		driver.findElementByXPath("//div[text()='Red']").click();
		
		

	}

}
