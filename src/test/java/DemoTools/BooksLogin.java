//Locate login page and try to register a new user.

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BooksLogin extends BaseClass {

    @Test
        public void element() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 15);

        // Scroll to and click on the Book Store Application title
        WebElement title = driver.findElement(By.xpath("//h5[text()='Book Store Application']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", title);
        wait.until(ExpectedConditions.elementToBeClickable(title)).click();

        // Wait and click on the Login button
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Login']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loginButton);
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginButton);

        // Fill in login form and click on Register
        driver.findElement(By.id("userName")).sendKeys("Neha");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("Neha@123");
        Thread.sleep(1000);
        WebElement newUserButton = driver.findElement(By.id("newUser"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", newUserButton);
        Thread.sleep(1000);
        driver.findElement(By.id("firstname")).sendKeys("Neha ");
        Thread.sleep(1000);
        driver.findElement(By.id("lastname")).sendKeys("Gowda");
        Thread.sleep(1000);
        driver.findElement(By.id("userName")).sendKeys("Neha");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("Neha@123");
        Thread.sleep(1000);
        //WebElement captcha = driver.findElement(By.id("recaptcha-anchor"));
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", captcha);
        //Thread.sleep(1000);
        WebElement registerButton = driver.findElement(By.id("register"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", registerButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", registerButton);
        Thread.sleep(1000);
    }
}