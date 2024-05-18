package Browser_Navigation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
     	ChromeDriver driver = new ChromeDriver();
		
	//	driver.get("https://www.tutorialspoint.com/selenium/practice/date-picker.php");
	//	driver.manage().window().maximize();
	//	Thread.sleep(3000);
	//	driver.findElementByXPath("//a[@href='https://www.tutorialspoint.com']").click();
	//	driver.navigate().back();
		
     	driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MILLISECONDS);
		
	}

}
