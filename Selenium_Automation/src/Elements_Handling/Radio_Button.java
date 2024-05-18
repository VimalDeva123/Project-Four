package Elements_Handling;

import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		
		//Select the Female Radio Button
		
		driver.findElementByXPath("//input[@value='FeMale']").click();
	
		
		

		}
		
		
		
	}


