import org.openqa.selenium.By;
//import necessary Selenium WebDriver classes
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
  //declare Selenium WebDriver
  private WebDriver webDriver;		
  @Test
  public void checkTitle() {
	  //Load republic poly website as a new page
	  webDriver.navigate().to("http://localhost:8090/CWF_CodeManagement_Julie/NewFileTest.jsp");
	  
	  //Assert the title to check that we are indeed in the correct website
	  Assert.assertEquals(webDriver.getTitle(), "Appointments");
	  
	  System.out.println("title: "+webDriver.getTitle());
	  
//	  //Retrieve explore now button using it's class name and click on it
//	  webDriver.findElement(By.className("green-btn")).click();
//
//	  //Assert the new title to check that the title contain RP360 and the button had successfully bring us to the new page
//	  Assert.assertTrue(webDriver.getTitle().contains("RP20"));
//	  System.out.println("new title: "+webDriver.getTitle());

  }
  
  
  
 
  @BeforeTest
  public void beforeTest() {
	  //Setting system properties of ChromeDriver
	  //use C:\Program Files\Google\Chrome\chromedriver_win32
	  //System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\chromedriver_win32\\chromedriver.exe");
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin1\\Desktop\\chrome driver version 106\\chromedriver.exe");
	  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahhon\\OneDrive\\Desktop\\SD DVOPS\\SS3\\Selenium\\chromedriver_win32\\chromedriver.exe");


	  //initialize FirefoxDriver at the start of test
	  webDriver = new ChromeDriver();  
  }

  @AfterTest
  public void afterTest() {
	  //Quit the ChromeDriver and close all associated window at the end of test
	  webDriver.quit();			
  }

}
