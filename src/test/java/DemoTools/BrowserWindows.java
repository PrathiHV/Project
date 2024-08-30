//locate new tab browser and verify.

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BrowserWindows extends BaseClass {
	@Test
    public void element() throws InterruptedException 
	 {
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 WebElement title = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
		 Thread.sleep(1000);
		 js.executeScript("arguments[0].scrollIntoView();",title );
		 Thread.sleep(500);
	   	 title.click();
	    Thread.sleep(500);
	    WebElement alertsFrameWindows = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Browser Windows']")));
        alertsFrameWindows.click();
       
        WebElement newTabButton =wait.until(ExpectedConditions.elementToBeClickable(By.id("tabButton")));
        newTabButton.click();  
        
}
	
	
}
