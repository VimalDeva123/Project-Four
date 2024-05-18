package Mouse_Handling;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Mouse {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		driver.manage().window().maximize();
		
		Actions action = new Actions (driver);
		
	  WebElement Button_Nor = driver.findElementByXPath("//button[text()='Click Me']");
	  action.click(Button_Nor).build().perform();
	  
	  WebElement Double_Btn = driver.findElementByXPath("//button[text()='Double Click Me']");
	  action.doubleClick(Double_Btn).build().perform();
	  
	  action.contextClick(Double_Btn).build().perform();
	  
	  driver.get("https://demo.automationtesting.in/Register.html#google_vignette");
	  driver.findElementByXPath("//h2[text()='Register']").click();
	  WebElement  Mouse_Ele = driver.findElementByXPath("//a[@href='Widgets.html']");
	  action.moveToElement(Mouse_Ele).build().perform();	
	  Thread.sleep(3000);
	  
	  WebElement More_Btn = driver.findElementByXPath("//a[@href='#']");
	  action.clickAndHold(More_Btn).build().perform();  
	  Thread.sleep(5000);
	  action.release(More_Btn).build().perform();

	}

}
