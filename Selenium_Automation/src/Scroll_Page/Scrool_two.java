package Scroll_Page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrool_two {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		//WebElement Submit_Btn = driver.findElementByXPath("//button[@id='submitbtn']");
	//	actions.moveToElement(Submit_Btn).perform();
		
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		
	}

}
