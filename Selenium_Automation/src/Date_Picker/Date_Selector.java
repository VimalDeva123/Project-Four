package Date_Picker;

import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Selector {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		Thread.sleep(5000);
		
		driver.findElementByXPath("//input[@id='datepicker1']").click();
		
		String Actual_Month = driver.findElementByXPath("//span[@class='ui-datepicker-month']").getText();
		String Actual_Year = driver.findElementByXPath("//span[@class='ui-datepicker-year']").getText();
		
		while( ! (Actual_Month.equals("May") && Actual_Year.equals("2029")))
		{
			driver.findElementByXPath("//span[@class='ui-icon ui-icon-circle-triangle-e']").click();
			 Actual_Month = driver.findElementByXPath("//span[@class='ui-datepicker-month']").getText();
			 Actual_Year = driver.findElementByXPath("//span[@class='ui-datepicker-year']").getText();
		}
		
		driver.findElementByXPath("//a[text()='20']").click();
		

	}

}
