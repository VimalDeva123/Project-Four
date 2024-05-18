package Tasks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

public class Browser_open_Tasks {
	
	public static void main(String[]args) throws InterruptedException
	{
		Browser_open_Tasks.Browser_Actions();
	}

	
	// Method for Open Browser
	public static void Browser_Actions() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver My_Browser = new ChromeDriver();
		My_Browser.manage().window().maximize();
		
		// 1. visit facebook.com, get title and url
		My_Browser.get("https://www.facebook.com/");
		System.out.println("My Browser Tittle is " + My_Browser.getTitle());
		System.out.println("My Browser URL is " + My_Browser.getCurrentUrl());
		Thread.sleep(5000);
		
		// 2. visit yahoo.com, get size and position
	    My_Browser.get("https://www.yahoo.com/");
	    System.out.println("My Browser window size is " + My_Browser.manage().window().getSize());
	    System.out.println("My Browser window Position is " + My_Browser.manage().window().getPosition());
		
		// 3. visit google.com, resize window to 400,400.
	    My_Browser.get("https://www.google.com/");
	    Dimension My_Value = new Dimension(500, 500);
	    My_Browser.manage().window().setSize(My_Value);
	    
	    }
}
