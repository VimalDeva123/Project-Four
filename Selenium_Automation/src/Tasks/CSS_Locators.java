package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Locators {
	
	
	
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	       // Finding Web element using Tag and ID Selector
		
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		driver.findElement(By.cssSelector("input#RESULT_TextField-1")).sendKeys("Vimal");
		driver.findElement(By.cssSelector("input#RESULT_TextField-1")).clear();
		Thread.sleep(5000);
		
		// Finding Web element using CSS ID Selector
		
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		driver.findElement(By.cssSelector("input.text_field")).sendKeys("Vimal");
		driver.findElement(By.cssSelector("input.text_field")).clear();
		Thread.sleep(5000);
		
		// Finding Web element using tagname and attribute
		driver.findElement(By.cssSelector("input[id='RESULT_TextField-1']")).sendKeys("Vimal Krish");
		driver.findElement(By.cssSelector("input[id='RESULT_TextField-1']")).clear();
		Thread.sleep(5000);
		
		
	    //	Finding Web element using tagname, classname and attribute  
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
