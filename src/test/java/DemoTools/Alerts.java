//Automate with alert feature where Click Button to see alert is working.

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Alerts extends BaseClass {
    
    private static final int TIMEOUT = 10;
    
    @Test
    public void element() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='Alerts, Frame & Windows']")));
            js.executeScript("arguments[0].scrollIntoView(true);", title);
            title.click();
            WebElement alertsButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Alerts']")));
            alertsButton.click();
            WebElement alertsButton1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='alertButton']")));
            alertsButton1.click();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        
    }
}
