package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Join extends BaseClass {

    @Test
    public void element() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 15);

        // Scroll to and click on the Book Store Application title
        WebElement title = driver.findElement(By.xpath("//img[@alt='Selenium Online Training']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", title);
        wait.until(ExpectedConditions.elementToBeClickable(title)).click();
        driver.findElement(By.xpath("//a[text()='Go To Registration ']")).click();

    }
}
