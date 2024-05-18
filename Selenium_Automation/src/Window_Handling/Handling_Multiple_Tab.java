package Window_Handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Multiple_Tab {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	    driver.manage().window().maximize();
	    String Parent_window = driver.getWindowHandle();
	    driver.findElementByXPath("//button[@id='newTabBtn']").click();
	    
	    Set<String> Handles = driver.getWindowHandles();
	    
	    for (String Handle : Handles )
	    {
	    	if(!Handle.equals(Parent_window))
	    	{
	    		driver.switchTo().window(Handle);
	    		driver.findElementByXPath("//button[@id='alertBox']").click();
	    	}
	    }
	    
	    
	    
	    
	    
	    
	}}


