package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Resizable extends BaseClass {
    @Test
    public void resizable() {
        driver.get("https://demoqa.com/resizable");

        // Set browser window size
        driver.manage().window().setSize(new Dimension(1920, 1080));

        WebDriverWait wait = new WebDriverWait(driver, 10);
        
        // Locate the resizable element
        WebElement resizableElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resizableBoxWithRestriction")));

        // Locate and scroll to the resize handle
        WebElement resizeHandle = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".react-resizable-handle.react-resizable-handle-se")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", resizeHandle);

        // Perform drag and drop action with adjusted offset
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(resizeHandle, 50, 50).perform(); // Adjust offsets as necessary

        // Verify new dimensions
        int newWidth = resizableElement.getSize().getWidth();
        int newHeight = resizableElement.getSize().getHeight();
        System.out.println("New Width: " + newWidth);
        System.out.println("New Height: " + newHeight);
    }
}

