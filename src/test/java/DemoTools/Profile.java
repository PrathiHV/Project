//Locate profile page and verify for login.

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Profile extends BaseClass {

    @Test
    public void element() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 15);

        // Scroll to and click on the Book Store Application title
        WebElement title = driver.findElement(By.xpath("//h5[text()='Book Store Application']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", title);
        wait.until(ExpectedConditions.elementToBeClickable(title)).click();

        // Wait and click on the Login button
        WebElement profileButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Profile']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", profileButton);
        wait.until(ExpectedConditions.visibilityOf(profileButton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", profileButton);
        
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='login']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loginButton);
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginButton);
    }
    

}
