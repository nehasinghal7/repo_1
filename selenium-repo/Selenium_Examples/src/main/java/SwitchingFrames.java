
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingFrames {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step1: Create the driver
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chrome\\77\\chrome_driver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// chromeDriver class with no parameters means that the default Chrome profile will be launched by our Java program.
		
		
		//Step2: open the browser with page
		driver.get("http://demo.guru99.com/selenium/deprecated.html");	
		List<WebElement> ele = driver.findElements(By.tagName("frame"));
		System.out.println("Number of frames in a page :" + ele.size());
		for(WebElement el : ele){
		  //Returns the Id of a frame.
		    System.out.println("Frame Id :" + el.getAttribute("id"));
		  //Returns the Name of a frame.
		    System.out.println("Frame name :" + el.getAttribute("name"));
		}	
		driver.switchTo().frame("classFrame");
        driver.findElement(By.linkText("Deprecated")).click();
        
        driver.close(); 
    }
}


// for getting frame names on a web page
//method1

//public void getIframe(final WebDriver driver, final String id) {
//    final List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
//    for (WebElement iframe : iframes) {
//        if (iframe.getAttribute("id").equals(id)) {
//        // TODO your stuff.
//        }
//    }
//}


//method2
//Assume driver is initialized properly. 
//List<WebElement> ele = driver.findElements(By.tagName("frame"));
//System.out.println("Number of frames in a page :" + ele.size());
//for(WebElement el : ele){
//  //Returns the Id of a frame.
//    System.out.println("Frame Id :" + el.getAttribute("id"));
//  //Returns the Name of a frame.
//    System.out.println("Frame name :" + el.getAttribute("name"));
//}