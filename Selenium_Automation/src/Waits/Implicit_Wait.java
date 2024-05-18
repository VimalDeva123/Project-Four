package Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.manage().window().maximize();
		
		
		driver.findElementByXPath("//button[@id='btn1']").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement Text_Box_One = driver.findElementByXPath("//h3[text()='Show the textboxes here:']//child::input[@id='txt1']");
		Text_Box_One.sendKeys("Testing");
		
		driver.findElementByXPath("//button[@id='btn2']").click();
		
		WebElement Text_Box_Two = driver.findElementByXPath("//h3[text()='Show the textboxes here:']//child::input[@id='txt2']");
		Text_Box_Two.sendKeys("Testing 2");
		
		
		
		
		
		
	}
}
