  // Verify that the page title is "Forms"

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Forms extends BaseClass{

	    @Test
	    public void testFormsPage() {
	        
	        // Click on the Forms link
	        WebElement formsLink = driver.findElement(By.xpath("//h5[text()='Forms']"));
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", formsLink);
	        formsLink.click();
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.titleIs("Forms"));
	        String actualTitle = driver.getTitle();
	        Assert.assertEquals(actualTitle, "Forms", "Page title is not as expected");
	        Reporter.log("Successfully navigated to the Forms page");
            driver.quit();
    }

	}
