package Browser_Open;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Fire_Fox_Browser {
	
	public static void main(String[]args)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		FirefoxDriver My_Fire_Fox  = new FirefoxDriver();
		My_Fire_Fox.get("https://www.google.com/");
		
		// Get Method's 
		
		System.out.println(My_Fire_Fox.getCurrentUrl());
		System.out.print(My_Fire_Fox.getTitle());
		
		// Get Size
		
		System.out.println(My_Fire_Fox.manage().window().getSize());
		
		// Get Position 
		
		System.out.println(My_Fire_Fox.manage().window().getPosition());
		
		// Get Capabileties	
		System.out.println(My_Fire_Fox.getCapabilities());
		
		
		
		
		
	}
}