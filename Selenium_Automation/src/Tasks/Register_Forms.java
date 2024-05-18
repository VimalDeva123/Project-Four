package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.SystemClock;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Register_Forms {

	
	public static void main(String[]args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
		
		driver.findElementById("firstname").sendKeys("vimal");
		driver.findElementById("lastname").sendKeys("Raj");
		driver.findElementByXPath("//input[@id='username']").sendKeys("Vimal deva");
		driver.findElementByXPath("//input[@type='password']").sendKeys("123456");
		driver.findElementByXPath("//input[@value='Register']").click();
	
		
		driver.findElementByXPath("//h2[@id='headingOne']").click();
		
		//Handling Check Box
		
	    driver.findElementByXPath("//a[@href='check-box.php']").click();
	    Thread.sleep(3000);
	    driver.findElementByXPath("//input[@id='c_bs_2']").click();
	    driver.findElementByXPath("//input[@id='c_bs_1']").click();
	    
	    //Handling Radio Button
	      
	    Thread.sleep(3000);
	    driver.findElementByXPath("//a[contains(text(),'Radio')]").click();
	    driver.findElementByClassName("form-check-input").click();
	    Thread.sleep(3000);
	    driver.findElementByXPath("//h2[@id='headingOne']").click();
	    
	  // Handling Dropdowns
	    
	   driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");
	   WebElement DD = driver.findElementByXPath("//select[@id='inputGroupSelect03']");
	   Select select = new Select (DD);
	 
	   
	    
	 

	   
		
	}
}
