//locate to upload and try to perform upload.

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UploadDownload extends BaseClass {
    @Test
    public void element() throws InterruptedException {
        Thread.sleep(1000);
        driver.get("https://demoqa.com/upload-download");
        WebElement fileInput = driver.findElement(By.id("uploadFile"));
        fileInput.sendKeys("\"C:\\Users\\User\\Downloads");  
        Thread.sleep(3000);
    }
}
