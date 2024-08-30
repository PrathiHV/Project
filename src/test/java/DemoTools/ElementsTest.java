   // Verify that the page title is "Elements"

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ElementsTest extends BaseClass {

	    @Test
	    public void testElementsPage() {
	   
	        WebElement elementsLink = driver.findElement(By.xpath("//h5[text()='Elements']"));
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", elementsLink);
	        elementsLink.click();
	        WebDriverWait wait = new WebDriverWait(driver,20);
	        wait.until(ExpectedConditions.titleIs("Elements"));
	        String actualTitle = driver.getTitle();
	        Assert.assertEquals(actualTitle, "Elements", "Page title is not as expected");
	        Reporter.log("Successfully navigated to the Elements page");
	        driver.quit();
	    }
}