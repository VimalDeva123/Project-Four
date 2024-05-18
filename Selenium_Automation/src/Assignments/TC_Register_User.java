package Assignments;

import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_Register_User {
	
	public static void main (String[]args) throws InterruptedException
	{
		// 1.Launch Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 System.out.println("1.Launch Browser " + "Code Worked successfully");	
		 
		//2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        System.out.println("2. Navigate to url 'http://automationexercise.com' " + "Code Worked successfully");
        
        //3. Verify that home page is visible successfully
        Thread.sleep(5000);
        boolean Home_Element = driver.findElementByXPath("//i[@class='fa fa-home']").isDisplayed();
	    System.out.println(Home_Element);
	    System.out.println("3. Verify that home page is visible successfully" + "Code Worked successfully");
	    
	    //4. Click on 'Signup / Login' button
         driver.findElementByXPath("//a[@href='/login']").click();	
         System.out.println("4. Click on 'Signup / Login' button " + "Code Worked successfully");
	
         //5. Verify 'New User Signup!' is visible
         boolean New_user_Header =  driver.findElementByXPath("//div[@class='signup-form']//child::h2").isDisplayed();
         System.out.println("Verify 'New User Signup!' is visible Result " + New_user_Header);
         System.out.println("5. Verify 'New User Signup!' is visible " + "Code Worked successfully");

         //6. Enter name and email address
         String Name = "Sarah";
         driver.findElementByXPath("//input[@placeholder='Name']").sendKeys(Name);
         Random Random_Email = new Random();
         int Random_Int = Random_Email.nextInt(2000);
         driver.findElementByXPath("//div[@class='signup-form']//child::input[@placeholder='Email Address']").sendKeys("Sara" +Random_Int + "@gmail.com" );
         System.out.println("6. Enter name and email address " + "Code Worked successfully");
         
         //7. Click 'Signup' button
         driver.findElementByXPath("//button[text()='Signup']").click();
         System.out.println("7. Click 'Signup' button " + "Code Worked successfully");
         
         //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
         String User_Name = driver.findElementById("name").getText();
         String User_Email =driver.findElementById("email").getText();
       
         //9. Fill details: Title, Name, Email, Password, Date of birth
         driver.findElementById("id_gender1").click();
         driver.findElementById("password").sendKeys("Test@1234");
         
         //Selecting Date in Date Picker
         WebElement Day_DD =  driver.findElementById("days");
         Select select_Day = new Select(Day_DD);
         select_Day.selectByValue("15");
         
         //Selecting Month in Date Picker
         WebElement Month_DD = driver.findElementById("months");
         Select select_month = new Select(Month_DD);
         select_month.selectByValue("4");
         
         //Selecting year in Date Picker
         WebElement Year_DD = driver.findElementById("years");
         Select select_year = new Select (Year_DD);
         select_year.selectByValue("2001");
         System.out.println("9. Fill details: Title, Name, Email, Password, Date of birth " + "Code Worked successfully");
         
         //10. Select checkbox 'Sign up for our newsletter!'
         driver.findElementById("newsletter").click();
         System.out.println("10. Select checkbox 'Sign up for our newsletter!' " + "Code Worked successfully");
         
         //11. Select checkbox 'Receive special offers from our partners!'
         driver.findElementById("optin").click();
         System.out.println("11. Select checkbox 'Receive special offers from our partners!' " + "Code Worked successfully");

         //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
         driver.findElementById("first_name").sendKeys("Sara");
         driver.findElementById("last_name").sendKeys("Gill");
         driver.findElementById("company").sendKeys("Wipro");
         driver.findElementById("address1").sendKeys("ABCD layout");
         driver.findElementByXPath("//input[@id='state']").sendKeys("Tamil Nadu");
         driver.findElementById("city").sendKeys("Chennai");
         driver.findElementById("zipcode").sendKeys("636 501");
         driver.findElementById("mobile_number").sendKeys("1236547890");
         System.out.println("12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number " + "Code Worked successfully");

         
         //13. Click 'Create Account button
         driver.findElementByXPath("//button[text()='Create Account']").click();
         System.out.println("13. Click 'Create Account button " + "Code Worked successfully");

         //14. Verify that 'ACCOUNT CREATED!' is visible
          String Actual_Result =   driver.findElementByXPath("//h2[@class='title text-center']//child::b").getText();
          String Expect_Result = "ACCOUNT CREATED!" ;
          if(Actual_Result == Expect_Result)
          {
        	  System.out.println("ACCOUNT CREATED! " + "Message Displaying");
        	  		
          }
     
          System.out.println("14. Click 'Create Account button " + "Code Worked successfully");

         //15. Click 'Continue' button
         driver.findElementByXPath("//div[@class='pull-right']//child::a").click();
         System.out.println("15. Click 'Continue' button " + "Code Worked successfully");
         
         
         //Handing Alert
         Thread.sleep(5000);
          Alert alert = driver.switchTo().alert();
          alert.dismiss();
          
          //16. Verify that 'Logged in as username' is visible

         
         

	}
	
	
	
	
	
	
	
	
}
