//Locate the broken link feature and check it is clickable.

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrokenLink1 extends BaseClass {
	@Test
    public void element() throws InterruptedException 
	 {
		driver.get("https://demoqa.com/broken");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement title = driver.findElement(By.xpath("//a[text()='Click Here for Broken Link']"));
		Thread.sleep(500);
		 js.executeScript("arguments[0].scrollIntoView();",title );
		 Thread.sleep(500);
	   	 title.click();
	   	 Thread.sleep(500);
	 }

}
