package Dropdown_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Drop_Down {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		
		// Handling Dropdowns
		
		WebElement Skils = driver.findElement(By.id("Skills"));
	    Select select = new Select(Skils);
	    
	    select.selectByValue("Android");
	    Thread.sleep(5000);
	    
	    select.selectByIndex(7);
	    Thread.sleep(5000);
	    
	    select.selectByVisibleText("Configuration");
	    
	    
	    
	

	}

}
