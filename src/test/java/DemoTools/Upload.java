//locate download and verify its working.

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Upload  extends BaseClass {
	@Test
    public void element() throws InterruptedException 
	 {
		Thread.sleep(1000);
		driver.get("https://demoqa.com/upload-download");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement title = driver.findElement(By.xpath("//a[text()='Download']"));
		Thread.sleep(1000);
		 js.executeScript("arguments[0].scrollIntoView();",title );
		 Thread.sleep(1000);
	   	 title.click();
	   	 Thread.sleep(1000);
	   
	 }

}

