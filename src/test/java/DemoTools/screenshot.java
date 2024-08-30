// Capture the screenshot of DemoQA page.

package DemoTools;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

public class screenshot extends BaseClass {

    @Test
    public void testBookStorePage() {
        try {
            // Assert that the title of the page is correct
            String pageTitle = driver.getTitle();
            Assert.assertEquals(pageTitle, "DEMOQA");
            
            // Take a screenshot of the current page
            takeScreenshot("book_store_page");
    
        } catch (Exception e) {
            // Take a screenshot if any exception occurs
            takeScreenshot("error_screenshot");
            throw e; 
        }
    }

    private void takeScreenshot(String fileName) {
       
        TakesScreenshot ts = (TakesScreenshot) driver;

        // Take the screenshot and store it as a File
        File source = ts.getScreenshotAs(OutputType.FILE);

        //  destination file path
        String destination = "screenshot/" + fileName + ".png";

        try {
            // Copy the screenshot to the desired location
            Files.createDirectories(Paths.get("screenshot")); 
            Files.copy(source.toPath(), Paths.get(destination));
            System.out.println("Screenshot taken: " + destination);
        } catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }
    }
}



