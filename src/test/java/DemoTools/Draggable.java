//Verify element is draggable.

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Draggable extends BaseClass {

    @Test
    public void testDraggableFeature() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, 25);
    	// Click on 'Interactions'
        WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='Interactions']")));
        js.executeScript("arguments[0].scrollIntoView(true);", title);
        title.click();

        // Click on 'Droppable'
        WebElement selectable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Dragabble']")));
        js.executeScript("arguments[0].scrollIntoView(true);", selectable);
        js.executeScript("arguments[0].click();", selectable);

        // Click on 'Accept'
        WebElement accept1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("draggableExample-tab-simple")));
        js.executeScript("arguments[0].click();", accept1);
        
     // Locate the draggable element and drop area
        WebElement draggable = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dragBox")));
        WebElement dropArea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("draggableExample-tabpane-simple")));

        // Ensure both draggable and dropArea are visible
        js.executeScript("arguments[0].scrollIntoView(true);", draggable);
        js.executeScript("arguments[0].scrollIntoView(true);", dropArea);

        // Create Actions object
        Actions actions = new Actions(driver);

        // Perform drag-and-drop action
        actions.clickAndHold(draggable)
               .moveToElement(dropArea)
               .release()
               .build()
               .perform();

    }
}
