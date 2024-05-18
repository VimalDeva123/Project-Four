package Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Class {
	public static void main(String[]args) throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.mycontactform.com");
		driver.manage().window().maximize();
	
		
		// Finding Elements using ID
//		driver.findElementById("user").sendKeys("Dhivyakarthi123");		
		
		// Finding Elements using Class Name
//		driver.findElementById("pass").sendKeys("12345");
		
		// Finding Elements using  Name
//		driver.findElementByName("btnSubmit").click();
		
		
		// Face Book Page
		
	//	driver.get("https://www.facebook.com/");
	//	driver.findElementById("email").sendKeys("Vimal");
	//	driver.findElementById("pass").sendKeys("123456");
	//	Thread.sleep(5000);
	//	driver.findElementByName("login").click();		
		
		
		// Link Text
		
	//	driver.get("https://www.google.com/");
	//	driver.findElementByLinkText("Gmail").click();
		
		//partial Link Text
		
	//	driver.get("https://www.google.com/");
	//	driver.findElementByPartialLinkText("Gma").click();
		
		// Link Text Facebook
		
	//	driver.get("https://www.facebook.com/");
	//	driver.findElementByLinkText("Forgotten password?").click();		
		
		//partial Link Text
		
	///	driver.get("https://www.facebook.com/");
	//	driver.findElementByPartialLinkText("Forgotten").click();	
		
		
		// finding Tag name Count using Tag in Browser.
		
		 driver.get("https://www.google.com/");
		List<WebElement> Image_Tag = driver.findElementsByTagName("img");
		System.out.println("Image Tag Name Count is " + Image_Tag.size());
		
		List<WebElement> Link_Tag = driver.findElementsByTagName("a");
		System.out.println("Link Tag Name Count is " + Link_Tag.size());
		
		List<WebElement> Div_Tag = driver.findElementsByTagName("div");
		System.out.println("Div Tag Name Count is " + Div_Tag.size());		
		
		
	}

}
