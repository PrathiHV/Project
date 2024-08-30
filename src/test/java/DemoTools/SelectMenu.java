//Verify SelectMenu feature

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class SelectMenu extends BaseClass {

	 
	@Test
    public void menuTest() {
 
		driver.get("https://demoqa.com/select-menu");

		WebDriverWait wait = new WebDriverWait(driver, 10);

        // Wait for the dropdown element to be visible
        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("oldSelectMenu")));

        // Check if the dropdown is clickable
        WebElement clickableDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("oldSelectMenu")));

        // Use JavaScript to scroll into view and click
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", clickableDropdown);
        js.executeScript("arguments[0].click();", clickableDropdown);

        // Create a Select object
        Select select = new Select(clickableDropdown);

        // Select an option by visible text
        select.selectByVisibleText("Blue");

        // Print the selected option to verify
        WebElement selectedOption = select.getFirstSelectedOption();
        System.out.println("Selected option: " + selectedOption.getText());

}
}