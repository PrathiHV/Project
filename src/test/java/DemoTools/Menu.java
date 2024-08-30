//Verify menu page

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Menu extends BaseClass {

	 
		@Test
	    public void menuTest() {
     
            // Navigate to the DemoQA website
            driver.get("https://demoqa.com/menu");

            // Find the menu element
            WebElement menu = driver.findElement(By.xpath("//a[text()='Main Item 1']"));

            // Find all menu items
            List<WebElement> menuItems = menu.findElements(By.tagName("li"));

            // Print out the names of the menu items
            for (WebElement item : menuItems) {
                System.out.println("Menu Item: " + item.getText());
            }
    }
}
