package Tasks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Date_Selector {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://test.qatechhub.com/date-picker/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElementById("datepicker").click();
		
		String Actual_Month = driver.findElementByClassName("ui-datepicker-month").getText();
		String Actual_Year = driver.findElementByClassName("ui-datepicker-year").getText();
		
		while(!(Actual_Month.equals("May") && Actual_Year.equals("2035")))
		{
			driver.findElementByXPath("//span[text()='Next']").click();
			 Actual_Month = driver.findElementByClassName("ui-datepicker-month").getText();
			 Actual_Year = driver.findElementByClassName("ui-datepicker-year").getText();
			
			
		}
		
         driver.findElementByXPath("//a[text()='17']").click();
}

}
