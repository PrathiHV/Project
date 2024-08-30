//Navigate to text box and try to enter all the details.

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test; 

public class Elementspage extends BaseClass{
          @Test
          public void element() throws InterruptedException 
 		 {
 			
 			 JavascriptExecutor js=(JavascriptExecutor) driver;
 			 WebElement title = driver.findElement(By.xpath("//h5[text()='Elements']"));
 			 Thread.sleep(1000);
 			 js.executeScript("arguments[0].scrollIntoView();",title );
 			 Thread.sleep(1000);
 		   	 title.click();
 		   	driver.findElement(By.xpath("//span[text()='Text Box']")).click();
 		    Thread.sleep(1000);
 		    driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("prathi");
 		    Thread.sleep(1000);
 		    driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("prathihv@gmail.com");
 		    Thread.sleep(1000);
 		    driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Bangalore");
 		    Thread.sleep(1000); 
 		    driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Tumkur");
		    Thread.sleep(1000);
		    WebElement submitButton = driver.findElement(By.id("submit"));
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitButton);
		    submitButton.click();
		    //driver.findElement(By.id("submit")).click();
		    //driver.findElement(By.xpath("//button[text()='Submit']")).click();
 		 }
}


