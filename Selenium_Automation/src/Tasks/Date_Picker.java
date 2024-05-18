package Tasks;

import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker {
public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/resources/demos/datepicker/other-months.html");
		Thread.sleep(5000);
		
		driver.findElementByXPath("//input[@id='datepicker']").click();
		
		String Actual_Month = driver.findElementByClassName("ui-datepicker-month").getText();
		String Actual_year = driver.findElementByClassName("ui-datepicker-year").getText();
		
		
		
		while (!(Actual_Month.equals("May")&& Actual_year.equals("2029")))
		{
			driver.findElementByXPath("//span[@class='ui-icon ui-icon-circle-triangle-e']").click();
			 Actual_Month = driver.findElementByClassName("ui-datepicker-month").getText();
			 Actual_year = driver.findElementByClassName("ui-datepicker-year").getText();
		}
		
		driver.findElementByXPath("//a[text()='31']").click();
		

}
}