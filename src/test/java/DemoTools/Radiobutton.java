//Verify radio buttons feature

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Radiobutton  extends BaseClass{
	@Test
    public void element() throws InterruptedException 
	 {
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 WebElement title = driver.findElement(By.xpath("//h5[text()='Elements']"));
		 
		 js.executeScript("arguments[0].scrollIntoView();",title );
		 Thread.sleep(1000);
	   	 title.click();
	   	driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
	    Thread.sleep(1000);
	    WebElement radioButton = driver.findElement(By.cssSelector(".custom-control-label"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", radioButton);
	    radioButton.click();
}
}
