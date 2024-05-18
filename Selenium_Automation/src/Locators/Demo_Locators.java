package Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Locators {
	public static void main(String[]args) throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		
		// Fidning Elements by ID and Entering keys
		 
		WebElement First_Name_txt = driver.findElementById("firstName");
		First_Name_txt.sendKeys("Testing");
		
		WebElement Last_Name_txt = driver.findElementById("lastName");
		Last_Name_txt.sendKeys("Vimal");
		
		// Find Element by Class :-
		
		WebElement Email_txt = driver.findElementByClassName("mr-sm-2 form-control");
		Email_txt.sendKeys("vimalrajdeva07@gmail.com");
		
		
		
		
		
		
	}

}
