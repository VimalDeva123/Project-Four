package Tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	
	
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	  //Click on "Maven" in seleniumeasy.com using Link Locators
		driver.get("http://seleniumeasy.com/");
		Thread.sleep(3000);
	   driver.findElement(By.linkText("Maven")).click();

	   
	 	// Click on "Help" in mycontactform.com
	   driver.get("https://mycontactform.com/");
	   Thread.sleep(3000);
	   driver.findElement(By.partialLinkText("Hel")).click();
	   
		// find number of images, links in google.com
	   driver.get("https://www.google.com/");
        List<WebElement> Google_Image = driver.findElements(By.tagName("image"));
        System.out.println("Google Page Image Tage Count is " + Google_Image.size());
        
        
		// find number of elements with div, input tag in facebook.com
        
        driver.get("https://facebook.com/");
        List<WebElement> Div_Tage = driver.findElements(By.tagName("div"));
        List<WebElement> input_Tage = driver.findElements(By.tagName("input"));
        
        System.out.println("FB page Div Tage Count is " + Div_Tage.size());
        System.out.println("FB Page Input Tage Count is " + input_Tage.size());
        
		// find number of elements with select tag in https://www.letskodeit.com/practice
        
        driver.get("https://www.letskodeit.com/practice");
        List<WebElement> Select_Tage = driver.findElements(By.tagName("select"));
        System.out.println("Select Tage Count is " + Select_Tage.size());
        

		
		
		
		
	}
	

}
