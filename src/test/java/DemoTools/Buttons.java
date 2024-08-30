//locate the buttons.

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Buttons extends BaseClass {

	 @Test
	    public void performActions() throws InterruptedException {
	       
	        if (driver == null) {
	            throw new NullPointerException("WebDriver is not initialized");
	        }

	        // Locate the title element and scroll into view
	        WebElement title = driver.findElement(By.xpath("//h5[text()='Elements']"));
	        Thread.sleep(1000);  
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", title);
	        Thread.sleep(1000);  
	        title.click();
	        
	        // Click on the 'Buttons' element
	        driver.findElement(By.xpath("//span[text()='Buttons']")).click();  
	        
	        // Perform double click using JavaScript Executor
	        WebElement dclick = driver.findElement(By.id("doubleClickBtn"));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", dclick);
	        
	        // Perform right click using Actions class
	        WebElement rclick = driver.findElement(By.id("rightClickBtn"));
	        Actions act = new Actions(driver);
	        act.contextClick(rclick).perform();
	        
	        // Perform double click using Actions class
	        act.doubleClick(dclick).perform();
	        
	        // Perform click using JavaScript Executor
	        WebElement click = driver.findElement(By.xpath("//button[text()='Click Me']"));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", click);
	        
	    }
	    
	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}

