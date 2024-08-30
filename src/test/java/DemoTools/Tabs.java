//Locate Tabs Page

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Tabs extends BaseClass {
	 @Test
	    public void tabsTest() {
	            // Open the DemoQA website
	            driver.get("https://demoqa.com/tabs");

	            // Initialize WebDriverWait
	            WebDriverWait wait = new WebDriverWait(driver, 25);

	            // Wait for the tab elements to be present
	            WebElement tab1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("demo-tab-what")));
	            WebElement tab2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("demo-tab-origin")));
	            WebElement tab3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("demo-tab-use")));

	            // Verify that the tabs are present
	            assert tab1.isDisplayed();
	            assert tab2.isDisplayed();
	            assert tab3.isDisplayed();

	            // Function to click element using JavaScript
	            JavascriptExecutor js = (JavascriptExecutor) driver;
	            WebElement tabElement = null;

	            // Click on the first tab and verify its content
	            tabElement = tab1;
	            js.executeScript("arguments[0].scrollIntoView(true);", tabElement);
	            js.executeScript("arguments[0].click();", tabElement);
	            WebElement tab1Content = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("demo-tab-content-what")));
	            assert tab1Content.getText().contains("Content of What");

	          // Click on the second tab and verify its content
	            tabElement = tab2;
	            js.executeScript("arguments[0].scrollIntoView(true);", tabElement);
	            js.executeScript("arguments[0].click();", tabElement);
	            WebElement tab2Content = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("demo-tab-content-origin")));
	            assert tab2Content.getText().contains("Content of Origin");

	            // Click on the third tab and verify its content
	            tabElement = tab3;
	            js.executeScript("arguments[0].scrollIntoView(true);", tabElement);
	            js.executeScript("arguments[0].click();", tabElement);
	            WebElement tab3Content = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("demo-tab-content-use")));
	            assert tab3Content.getText().contains("Content of Use");

	    }
	}