//locate progressbar feature

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ProgressBar extends BaseClass{
	@Test
    public void element() throws InterruptedException 
	 {
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		Thread.sleep(1000);
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 WebElement title = driver.findElement(By.xpath("//h5[text()='Widgets']"));
		 Thread.sleep(2000);
		 js.executeScript("arguments[0].scrollIntoView();",title );
	   	 title.click(); 
	    WebElement button1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Progress Bar']")));
        js.executeScript("arguments[0].scrollIntoView(true);", button1);
        button1.click();
        driver.findElement(By.id("startStopButton")).click();
	 }

} 
