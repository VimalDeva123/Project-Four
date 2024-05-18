package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path {

	
		public static void main(String[]args)    
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
			driver.manage().window().maximize();
			
			
		


	}

}
