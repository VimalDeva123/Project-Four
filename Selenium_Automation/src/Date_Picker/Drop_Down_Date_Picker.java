package Date_Picker;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Date_Picker {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElementById("dob").click();
		
		Select Month_DD = new  Select(driver.findElementByClassName("ui-datepicker-month"));
		Month_DD.selectByVisibleText("Nov");
		
		Select Year_DD = new  Select(driver.findElementByClassName("ui-datepicker-year"));
		Year_DD.selectByValue("1956");
		driver.findElementByXPath("//a[text()='6']").click();
	}

}
