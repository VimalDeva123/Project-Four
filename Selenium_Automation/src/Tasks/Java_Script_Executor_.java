package Tasks;


import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Java_Script_Executor_ {
	
	
	
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		
		//Find number of cookies present in yahoo.com
		
		driver.get("https://www.yahoo.com/");
		Set<Cookie> My_Cookie = driver.manage().getCookies();
		System.out.println("My Cookies Count "+ My_Cookie.size());
		Thread.sleep(5000);
		
		
		// Delete cookies present in facebook.com
		driver.get("https://www.facebook.com/");
		Set<Cookie> FB_Cookie = driver.manage().getCookies();
		System.out.println("My FB Cookie Count " + FB_Cookie.size());
		driver.manage().deleteAllCookies();
		System.out.println("My FB Cookie Count " + FB_Cookie.size());

		
		
		// visit www.mycontactform.com, zoom in 500%
	   driver.get("https://www.mycontactform.com/");
	   JS.executeScript("document.body.style.zoom='500%'");
		
		
		
	}
	
	

}
