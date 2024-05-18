package seleniumnavigation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class nav {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
    driver.get("http:\\www.google.com");
    driver.manage().window().maximize();
    
   //open seleniumeasy.com in new tab   
    driver.executeScript("window.open('https://www.seleniumeasy.com','_blank');");
 
//step2:  
 //driver.getwindowhandle()=> get the control of first tab :  parent
 //driver.getwindowhandles()> get the control of both tabs:  s={google.com, seleniumeasy.com}
 
 
 
String parent=driver.getWindowHandle();// control will be in the parent window //google
 // collecting all the handle
  Set<String> s1 = driver.getWindowHandles();// 2(both the tabs = collected)
  
  //step3: iteartor: visit the element
  //  hasnext
 
  
 // iterate through the elements present in set
 
  Iterator<String> I1 = s1.iterator();  // hasNext , next()

  // hasnext=> whether content is there
  // next -> read the content 
  
 //step4:
 while(I1.hasNext())// whether any content is there 
    {
      String child_window=I1.next();
      if(!parent.equals(child_window))// picking the seleniumeasy.com
    	  { // control is moved to child window 
        driver.switchTo().window(child_window);
        System.out.println(driver.getTitle());
        Thread.sleep(4000);
        driver.findElementByLinkText("Maven").click();
        Thread.sleep(4000);
        driver.close();
      }
      
      /*
       * parent=google
       * s={google,seleniumeasy.com}
       * 
       * first iteration: I1 points to the firs telement
       * 
       * I1 points t google
       * I1.hasnext
       *    I1.next reads google .com and store in child_window
       *    child_window=google
       *    if parent!=child_window
       *       google!=google
       *       
       *       terminate
       *second iteration: I1 points to second element
       *I1 points to seleniumeasy.com
       * ,I1.hasnext
       *    I1.next reads seleniumeasy.com  and store in child_window
       *    child_window=seleniumeasy.com
       *    if parent!=child_window
       *       google!=seleniumeasy.com
       *       switching contrl to child
       *       switching control to seleniumeasy.co
       *       Maven
       *       close :  close the tab which is in focus
       *       
       *third iteration: no content
       *terminate
       *
       *          
       *   switching control back to parent
       *   moving cursor back to google.com
       *   title => fetching
       *   images-> click
       *   quit
    * 
       * */
     
    
  }

    driver.switchTo().window(parent);//google 
    System.out.println(driver.getTitle());// google
    //driver.findElement(By.linkText("Images")).click();
    Thread.sleep(5000);
    driver.findElementByLinkText("Images").click();
    Thread.sleep(5000);
    driver.quit();
}
}