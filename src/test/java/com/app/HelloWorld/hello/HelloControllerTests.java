
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/** * Created by  * Sample junit test code to integrate by */
public class HelloControllerTests{    
	String message = "Hello World!";	
   
	@Test
	public void testPrintMessage() {
	   Assert.assertEquals(HelloController.sayHello(), "Hello World! ");
	}


}