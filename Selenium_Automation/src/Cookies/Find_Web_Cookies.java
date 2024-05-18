package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Web_Cookies {public static void main(String[]args) throws InterruptedException  
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	Set<Cookie> C = driver.manage().getCookies();
	
	System.out.println("My Cookie Count" + C.size());
	
}
}
