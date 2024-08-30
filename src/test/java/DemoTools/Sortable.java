//Verify sortable page.

package DemoTools;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
	import org.testng.annotations.Test;

	import java.util.List;

	public class Sortable extends BaseClass {
	      @Test
	      
	    public void testSortableFunctionality() {
	    	  driver.get("https://demoqa.com/sortable");
	    	  Actions actions = new Actions(driver);
	    	    WebDriverWait wait = new WebDriverWait(driver, 20);
	            WebElement sortableContainer = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Sortable']")));
	            sortableContainer.click();
	            List<WebElement> items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#sortable li")));
	            Assert.assertEquals(items.size(), 5, "The number of sortable items is not as expected.");
	            WebElement firstItem = items.get(0);
	            WebElement lastItem = items.get(items.size() - 1);

	            // Perform drag and drop action
	            actions.clickAndHold(firstItem).moveToElement(lastItem).release().perform();
	            items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#sortable li")));
	            Assert.assertEquals(items.get(items.size() - 1).getText(), "One", "The first item did not move to the last position.");
	            Assert.assertEquals(items.get(0).getText(), "Five", "The last item did not move to the start.");
	        }
	    }