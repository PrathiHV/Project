//Locate bookstore check whether book can be visible with the details, try to interact with links,tabs.

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Bookstore extends BaseClass {

    @Test
    public void element() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 15);

        // Scroll to and click on the Book Store Application title
        WebElement title = driver.findElement(By.xpath("//h5[text()='Book Store Application']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", title);
        wait.until(ExpectedConditions.elementToBeClickable(title)).click();

        // Wait and click on the Login button
        WebElement bookButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Book Store']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bookButton);
        wait.until(ExpectedConditions.visibilityOf(bookButton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", bookButton);
        WebElement booklink = driver.findElement(By.id("see-book-Git Pocket Guide"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", booklink);
        Thread.sleep(1000);
        WebElement author = driver.findElement(By.xpath("//div[text()='Author']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", author);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", author);
        Thread.sleep(1000);
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loginButton);
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginButton);
    }

}
