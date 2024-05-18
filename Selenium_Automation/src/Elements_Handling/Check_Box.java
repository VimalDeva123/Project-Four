package Elements_Handling;

import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Box {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		
		//Select the Multiple Check box's
		
		driver.findElementByXPath("//input[@value='Movies']").click();
		driver.findElementByXPath("//input[@value='Cricket']").click();
		
		

		}
		
		
		
	}



