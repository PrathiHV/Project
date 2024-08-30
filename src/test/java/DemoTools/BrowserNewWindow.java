//locate new browser window and verify

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BrowserNewWindow extends BaseClass {
	@Test
    public void element() throws InterruptedException 
	 {
		
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 WebElement title = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
		 js.executeScript("arguments[0].scrollIntoView();",title );
	   	 title.click();
	    Thread.sleep(1000);
	    WebElement alertsFrameWindows = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Browser Windows']")));
        alertsFrameWindows.click();
        Thread.sleep(1000);
        WebElement windowButton = driver.findElement(By.id("windowButton"));
        js.executeScript("arguments[0].click();", windowButton); 
            
} 
}
