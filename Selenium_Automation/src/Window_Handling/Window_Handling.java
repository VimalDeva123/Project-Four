package Window_Handling;

import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling {

	
	// Handling Multiple Tab
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    String ParentWindow = driver.getWindowHandle();
	    driver.findElementByXPath("//button[@id='newWindowBtn']").click();
	    System.out.println("My Parent Window is " + ParentWindow);
	    
	    Set<String> Handles = driver.getWindowHandles();
	    
	    for (String Handle : Handles)
	    {
	    	if (!Handle.equals(ParentWindow)) {
	    		driver.switchTo().window(Handle);
	    		driver.manage().window().maximize();
	    		driver.findElementByXPath("//input[@id='firstName']").sendKeys("Vimal");
	    		
				
			}
	    	System.out.println(Handle);
	    }
	}

}
