//Locate Bookstore api and verify tabs ,buttons are working properly.
package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BookStoreApi extends BaseClass {

    @Test
    public void element() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 15);

        // Scroll to and click on the Book Store Application title
        WebElement title = driver.findElement(By.xpath("//h5[text()='Book Store Application']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", title);
        wait.until(ExpectedConditions.elementToBeClickable(title)).click();

        // Wait and click on the Login button
        WebElement bookstoreapiButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Book Store API']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bookstoreapiButton);
        wait.until(ExpectedConditions.visibilityOf(bookstoreapiButton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", bookstoreapiButton);
        WebElement authorizebutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Authorize']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", authorizebutton);
        wait.until(ExpectedConditions.visibilityOf(authorizebutton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", authorizebutton);
        WebElement closebutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Close']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", closebutton);
        wait.until(ExpectedConditions.visibilityOf(closebutton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", closebutton);
        driver.findElement(By.xpath("//span[text()='POST']")).click();
        driver.findElement(By.xpath("//button[text()='Try it out ']")).click();
        driver.findElement(By.xpath("//button[text()='Execute']")).click();
        driver.findElement(By.xpath("//button[text()='Clear']")).click();
        driver.findElement(By.xpath("//span[text()='LoginViewModel']")).click();
        driver.findElement(By.xpath("//span[text()='TokenViewModel']")).click();
        driver.findElement(By.xpath("//span[text()='BookModal']")).click();

    }
    
}
