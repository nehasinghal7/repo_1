import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step1: Create the driver
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chrome\\79\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// chromeDriver class with no parameters means that the default Chrome profile will be launched by our Java program.
		
		
		//Step2: open the browser with page
		driver.get("http://www.google.com");	
			
		//Step3: identify the record elements 
			WebElement searchBox = driver.findElement(By.name("q"));
			
		//Step4: set data
			searchBox.sendKeys("Java Book");
		
		 //Step5: perform the action
			WebElement searchBtn = driver.findElement(By.name("btnK"));
			searchBtn.click();
			String expectedTitle = "Java Book - Google Search";
			//Step6: Validate the results
			String title = driver.getTitle(); //verify title , url, content, button, data b4 navigating to next page
			System.out.println(driver.getTitle());
			String currentUrl =driver.getCurrentUrl();
			  if (title.contentEquals(expectedTitle)){
		            System.out.println("Test Passed!");
		        } else {
		            System.out.println("Test Failed");
		        }
			//Step7: close the browser
		
		
		driver.close();
		
		//System.exit(0); If this command is used without closing all browser windows first, 
		// whole Java program will end while leaving the browser window open.



	}

}
