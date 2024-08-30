//Locate links and verify liks page.

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Links  extends BaseClass{
	@Test
    public void element() throws InterruptedException 
	 {
		Thread.sleep(1000);
		try {
           
            driver.get("https://demoqa.com/links");
            WebDriverWait wait = new WebDriverWait(driver, 15); 

            WebElement homeLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("simpleLink")));
            clickElement(homeLink, driver);
            wait.until(ExpectedConditions.urlToBe("https://demoqa.com/"));
            driver.navigate().back();
            wait.until(ExpectedConditions.urlToBe("https://demoqa.com/links"));
            WebElement createdLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("created")));
            clickElement(createdLink, driver);
            WebElement createdResponse = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("linkResponse")));
            assert createdResponse.getText().contains("Link has been created") : "Created link response message is incorrect";
            driver.navigate().back();
            wait.until(ExpectedConditions.urlToBe("https://demoqa.com/links"));

            // Test the "Moved" link
            WebElement movedLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("moved")));
            clickElement(movedLink, driver);
            wait.until(ExpectedConditions.urlToBe("https://demoqa.com/"));
            driver.navigate().back();

            // Ensure the page is loaded after navigation
            wait.until(ExpectedConditions.urlToBe("https://demoqa.com/links"));

            // Test the "Broken" link
            WebElement brokenLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("bad-request")));
            clickElement(brokenLink, driver);
            wait.until(ExpectedConditions.titleContains("404"));
            assert driver.getTitle().contains("404") : "Broken link did not return a 404 error";

        } finally {
            // Close the browser
            driver.quit();
        }
    }

    // Method to handle element clicks with fallback to JavaScript
    private static void clickElement(WebElement element, WebDriver driver) {
        try {
            element.click();
        } catch (ElementClickInterceptedException e) {
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("arguments[0].click();", element);
        }
    }
}