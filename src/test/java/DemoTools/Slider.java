	        // Locate the slider element


package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Slider extends BaseClass {
	 @Test
	    public void sliderTest() {
	        driver.get("https://demoqa.com/slider");

	        WebElement slider = driver.findElement(By.cssSelector(".range-slider"));

	        // Create an Actions object to perform slider actions
	        Actions actions = new Actions(driver);

	        // Perform a drag-and-drop action to move the slider
	        int xOffset = 50; // Adjust this value as needed
	        actions.clickAndHold(slider)
	               .moveByOffset(xOffset, 0)
	               .release()
	               .perform();

	        // Optionally, you can verify the value of the slider after moving it
	        WebElement sliderValue = driver.findElement(By.id("sliderValue"));
	        System.out.println("Slider value: " + sliderValue.getText());
	    }
	}