package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Droppable3 extends BaseClass {
   
    @Test
    public void testDragAndDrop() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, 25);

        // Click on 'Interactions'
        WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='Interactions']")));
        js.executeScript("arguments[0].scrollIntoView(true);", title);
        title.click();

        // Click on 'Droppable'
        WebElement selectable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Droppable']")));
        js.executeScript("arguments[0].scrollIntoView(true);", selectable);
        js.executeScript("arguments[0].click();", selectable);

        // Click on 'Accept'
        WebElement accept1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("droppableExample-tab-revertable")));
        js.executeScript("arguments[0].click();", accept1);

        // Wait for draggable elements to be visible
        WebElement source = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("revertable")));
        WebElement target = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Drop here']/../../../../div[4]/div/div[2]")));

        // Ensure both source and target are visible
        js.executeScript("arguments[0].scrollIntoView(true);", source);
        js.executeScript("arguments[0].scrollIntoView(true);", target);

        // Initialize Actions class
        Actions actions = new Actions(driver);

        // Perform drag and drop action using Actions class
        actions.clickAndHold(source)
               .moveToElement(target)
               .release()
               .build()
               .perform();

        // Wait for second draggable element to be visible
        WebElement source1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("notRevertable")));
        WebElement target1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Drop here']/../../../../div[4]/div/div[2]")));

        // Ensure both source1 and target1 are visible
        js.executeScript("arguments[0].scrollIntoView(true);", source1);
        js.executeScript("arguments[0].scrollIntoView(true);", target1);

        // Perform drag and drop action
        actions.clickAndHold(source1)
               .moveToElement(target1)
               .release()
               .build()
               .perform();
    }
}