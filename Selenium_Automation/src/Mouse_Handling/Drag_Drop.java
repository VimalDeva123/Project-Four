package Mouse_Handling;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/droppable.php");
		driver.manage().window().maximize();
		
		WebElement Drag_Ele = driver.findElementById("draggable");
		WebElement Drop_Ele = driver.findElementById("droppable");
		Actions action = new Actions (driver);
		action.dragAndDrop(Drag_Ele, Drop_Ele).build().perform();		
		
		
		driver.get("https://jqueryui.com/slider/");
		
		
		
	

	}

}
