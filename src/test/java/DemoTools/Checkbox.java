//Locate checkboxes 

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Checkbox extends BaseClass{
	 @Test
     public void element() throws InterruptedException 
	 {
		Thread.sleep(3000);
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 WebElement title = driver.findElement(By.xpath("//h5[text()='Elements']"));
		 Thread.sleep(2000);
		 js.executeScript("arguments[0].scrollIntoView();",title );
		 Thread.sleep(2000);
	   	 title.click();
	   	driver.findElement(By.xpath("//span[text()='Check Box']")).click();
	    Thread.sleep(3000);
	    WebElement checkbox = driver.findElement(By.cssSelector(".rct-title"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkbox);
	    checkbox.click();
	  /*  WebElement element = driver.findElement(By.className("rct-option-expand-all"));
	    Thread.sleep(2000);
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	    Thread.sleep(2000);*/
	    driver.findElement(By.xpath("//span[text()='Home']")).click();
	    Thread.sleep(2000);
	     WebElement element1= driver.findElement(By.className("rct-title"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);
	    Thread.sleep(2000); 
	    //driver.findElement(By.xpath("//button[@class='rct-option rct-option-expand-all']")).click();
}
}