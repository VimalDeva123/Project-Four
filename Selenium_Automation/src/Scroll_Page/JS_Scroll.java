package Scroll_Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class JS_Scroll {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy(0,1000);");

		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-1000);");
		
		driver.findElementByXPath("//input[@value='Male']").click();
		
		
		// Scroll by Particular Elements
		WebElement Check_Box = driver.findElementByXPath("//input[@value='Cricket']");
		js.executeScript("arguments[0].scrollIntoView();", Check_Box);
		Check_Box.click();
		
		
		// scroll untill bottom of the Page
		
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		driver.findElementByXPath("//input[@id='firstpassword']").sendKeys("0000");
       		
		
		
		
		
	}

}
