//locate for click on valid link

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrokenLinks extends BaseClass {
		@Test
	    public void element() throws InterruptedException 
		 {
			driver.get("https://demoqa.com/broken");
			JavascriptExecutor js=(JavascriptExecutor) driver;
			WebElement title = driver.findElement(By.xpath("//a[text()='Click Here for Valid Link']"));
			Thread.sleep(500);
			 js.executeScript("arguments[0].scrollIntoView();",title );
			 Thread.sleep(1000);
		   	 title.click();
		 }
}
