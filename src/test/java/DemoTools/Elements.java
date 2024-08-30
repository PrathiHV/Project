//Navigate to Element page

package DemoTools;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Elements extends BaseClass {
		@Test
		public void element() throws InterruptedException 
		 {
			 JavascriptExecutor js=(JavascriptExecutor) driver;
			 WebElement title = driver.findElement(By.xpath("//h5[text()='Elements']"));
			 Thread.sleep(1000);
			 js.executeScript("arguments[0].scrollIntoView();",title );
			 Thread.sleep(1000);
		   	 title.click();
			 Thread.sleep(1000);
			 
}
}
