//locate messagewindow button and verify browser windows

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NewWindowMessage extends BaseClass {
	@Test
    public void element() throws InterruptedException 
	 {
		Thread.sleep(3000);
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 WebElement title = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
		 Thread.sleep(2000);
		 js.executeScript("arguments[0].scrollIntoView();",title );
		 Thread.sleep(2000);
	   	 title.click();
	    Thread.sleep(2000);
	    WebElement alertsFrameWindows = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Browser Windows']")));
        alertsFrameWindows.click();
        Thread.sleep(2000);
        WebElement windowButton = driver.findElement(By.id("messageWindowButton"));
        js.executeScript("arguments[0].click();", windowButton);
        Thread.sleep(2000); 
            
}

}
