package Browser_Commands;

import org.openqa.selenium.Point;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browser__Commands {
	
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		//Setting Window Size for Browser.
		//Dimension My_Dia = new Dimension(100 , 500);
		//driver.manage().window().setSize(My_Dia);
		
		//Get Current Browser URL
		System.out.println("Current Browser URL is "  + driver.getCurrentUrl());
		
		//Get Current Browser Tittle
		System.out.println("Current Browser Tittle  is "  + driver.getTitle());
		
		//Get Capabileties
		System.out.println("Current Browser Capabileties   is "  + driver.getCapabilities());
		
		// Size Maximize
	//	driver.manage().window().maximize();
		
		// Sleep (5000)
		//Thread.sleep(5000);
		
		//Close or Quite
		//driver.close();
		
		
		// Set Browser Position
		
		Point My_Pos = new Point(550, 750);
		driver.manage().window().setPosition(My_Pos);
		
		
		
		
	}
}
