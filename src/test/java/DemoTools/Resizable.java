package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Resizable extends BaseClass {
	@Test
	public void resizable()
	{
            driver.get("https://demoqa.com/resizable");

            // Locate the resizable element
            WebElement resizableElement = driver.findElement(By.id("resizableBoxWithRestriction"));

            WebElement resizeHandle = resizableElement.findElement(By.xpath("//span[text()='react-resizable-handle react-resizable-handle-se']"));

            Actions actions = new Actions(driver);
            actions.dragAndDropBy(resizeHandle, 100, 100).perform();
            int newWidth = resizableElement.getSize().getWidth();
            int newHeight = resizableElement.getSize().getHeight();
            System.out.println("New Width: " + newWidth);
            System.out.println("New Height: " + newHeight);
    }
}

