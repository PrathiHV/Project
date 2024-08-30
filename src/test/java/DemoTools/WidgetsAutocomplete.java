//locate widgets and buttons.

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WidgetsAutocomplete extends BaseClass {

    private static final int TIMEOUT = 10;

    @Test
    public void testAutocomplete() {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='Widgets']")));
            js.executeScript("arguments[0].scrollIntoView(true);", title);
            title.click();
            WebElement button1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Auto Complete']")));
            button1.click();
            Thread.sleep(2000);
            driver.findElement(By.id("autoCompleteMultipleContainer")).sendKeys("Black");
    	    Thread.sleep(2000);
    	    driver.findElement(By.id("autoCompleteSingleContainer")).sendKeys("Blue");
    	    Thread.sleep(2000);
    	    
            
        } catch (Exception e) {
            e.printStackTrace();
          
        }
    }
}

