//Locate selectable feature and verify elemnts can be selectable.

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Selectable extends BaseClass {
    @Test
    	public void testSelectable() throws InterruptedException {
    	JavascriptExecutor js=(JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, 10); 
        WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='Interactions']")));
        js.executeScript("arguments[0].scrollIntoView(true);", title);
        title.click();

        // Scroll into view and click the 'Selectable' option
        WebElement selectable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Selectable']")));
        js.executeScript("arguments[0].scrollIntoView(true);", selectable);
        js.executeScript("arguments[0].click();", selectable);

        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='Cras justo odio']")));
        ele.click();
        
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='Dapibus ac facilisis in']")));
        element.click();
        
     }

}
