package Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.manage().window().maximize();
		WebElement Text_Box =   driver.findElementByXPath("//button[@id='btn1']");
		Text_Box.click();
		
				
		WebElement My_Txt_Box = driver.findElementByXPath("//h3[text()='Show the textboxes here:']//child::input[@id='txt1']");
	WebDriverWait wait = new WebDriverWait(driver,   5000);
	
	wait.until(ExpectedConditions.visibilityOf(My_Txt_Box));
    My_Txt_Box.sendKeys("Test");
		
		
	
		
	}

}
