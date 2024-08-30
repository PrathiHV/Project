//Verify web tables and try to add the details.

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Web_tables extends BaseClass{
	@Test
    public void element() throws InterruptedException 
	 {
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 WebElement title = driver.findElement(By.xpath("//h5[text()='Elements']"));
		 js.executeScript("arguments[0].scrollIntoView();",title );
	   	 title.click();
	   	driver.findElement(By.xpath("//span[text()='Web Tables']")).click();
	    Thread.sleep(1000);
	    WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addButton);
	    addButton.click();
	    driver.findElement(By.id("firstName")).sendKeys("Anu");
	    Thread.sleep(1000);
	    driver.findElement(By.id("lastName")).sendKeys("S");
	    Thread.sleep(1000);
	    driver.findElement(By.id("userEmail")).sendKeys("Anu@gmail.com");
	    Thread.sleep(1000);
	    driver.findElement(By.id("age")).sendKeys("25");
	    Thread.sleep(1000);
	    driver.findElement(By.id("salary")).sendKeys("25000");
	    Thread.sleep(1000);
	    driver.findElement(By.id("department")).sendKeys("legal");
	    Thread.sleep(1000);
	    driver.findElement(By.id("submit")).click();
	    Thread.sleep(1000);
	    
	 }
}