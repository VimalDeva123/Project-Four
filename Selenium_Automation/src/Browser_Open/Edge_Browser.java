package Browser_Open;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Browser {
	
	public static void main(String[]args)
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver My_Edge = new EdgeDriver();
		My_Edge.get("https://www.google.com/");
		My_Edge.manage().window().maximize();
	}
}
