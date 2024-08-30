//Locate droppable and check element can be drag and dropped in prevent propogation

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Droppable2 extends BaseClass {
   
    @Test
    public void testDragAndDrop() {
    	

    	JavascriptExecutor js=(JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, 15); 
        WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='Interactions']")));
        js.executeScript("arguments[0].scrollIntoView(true);", title);
        title.click();

        // Scroll into view and click the 'Selectable' option
        WebElement selectable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Droppable']")));
        js.executeScript("arguments[0].scrollIntoView(true);", selectable);
        js.executeScript("arguments[0].click();", selectable);
                
       

        WebElement accept2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("droppableExample-tab-preventPropogation")));
        js.executeScript("arguments[0].click();", accept2);

        // Locate the draggable and droppable elements
        WebElement source = driver.findElement(By.id("dragBox")); 
        WebElement target = driver.findElement(By.id("notGreedyDropBox"));
        // Ensure source and target are visible
        js.executeScript("arguments[0].scrollIntoView(true);", source);
        js.executeScript("arguments[0].scrollIntoView(true);", target);
        

        // Initialize Actions class
        Actions actions = new Actions(driver);
     // Perform drag and drop action using Actions class
        actions.clickAndHold(source)
               .moveByOffset(100, 100) 
               .release(target)
               .build()
               .perform();
        
    }

}
