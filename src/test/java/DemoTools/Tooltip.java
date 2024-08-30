// locate to the DemoQA tooltip page

package DemoTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Tooltip extends BaseClass {
    
	@Test
    public void tooltipTest() {
            
            driver.get("https://demoqa.com/tool-tips");
            Actions actions = new Actions(driver);
            WebElement tooltipElement = driver.findElement(By.id("toolTipButton"));
            actions.moveToElement(tooltipElement).perform();

            // Wait for the tooltip to be visible
            WebDriverWait wait = new WebDriverWait(driver, 20);
            WebElement tooltipText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("texFieldToolTopContainer")));

            String expectedTooltipText = "You hovered over the Button";
            String actualTooltipText = tooltipText.getText();

            if (expectedTooltipText.equals(actualTooltipText)) {
                System.out.println("Tooltip text is as expected: " + actualTooltipText);
            } else {
                System.out.println("Tooltip text is not as expected. Actual: " + actualTooltipText);
            }
    }
}
