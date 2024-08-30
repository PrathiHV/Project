//Verify practice form page and enter the details.

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PracticeForm extends BaseClass {
    @Test
    public void testFormsPage() throws InterruptedException {
        try {
            driver.get("https://demoqa.com/automation-practice-form");
            WebDriverWait wait = new WebDriverWait(driver, 20);
            
            // Wait for the form elements to be visible
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));

            WebElement firstName = driver.findElement(By.id("firstName"));
            firstName.sendKeys("Nikhil");

            WebElement lastName = driver.findElement(By.id("lastName"));
            lastName.sendKeys("Gowda");

            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys("nikhil@gmail.com");

            WebElement genderMale = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Male']")));
            scrollToElement(genderMale);  // Ensure the element is in view
            genderMale.click();

            WebElement mobileNumber = driver.findElement(By.id("userNumber"));
            mobileNumber.sendKeys("1234567890");

            WebElement dob = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dateOfBirthInput")));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", dob); 
            js.executeScript("arguments[0].click();", dob);

            WebElement monthDropdown = driver.findElement(By.className("react-datepicker__month-select"));
            Select monthSelect = new Select(monthDropdown);
            monthSelect.selectByVisibleText("January");
            Thread.sleep(1000);

            WebElement yearDropdown = driver.findElement(By.className("react-datepicker__year-select"));
            Select yearSelect = new Select(yearDropdown);
            yearSelect.selectByVisibleText("1990");
            Thread.sleep(1000);

            WebElement day = driver.findElement(By.xpath("//div[text()='10']"));
            day.click();
            Thread.sleep(1000);

            WebElement subjects = driver.findElement(By.id("subjectsInput"));
            subjects.sendKeys("Math");
            subjects.sendKeys(org.openqa.selenium.Keys.ENTER);
           
            WebElement hobbySports = driver.findElement(By.xpath("//label[text()='Sports']"));
            scrollToElement(hobbySports);  // Ensure the element is in view
            hobbySports.click();

            WebElement hobbyReading = driver.findElement(By.xpath("//label[text()='Reading']"));
            scrollToElement(hobbyReading);  // Ensure the element is in view
            hobbyReading.click();

            WebElement uploadPicture = driver.findElement(By.id("uploadPicture"));
            uploadPicture.sendKeys("\"C:\\Users\\User\\Downloads\\sampleFile(3).jpeg\"");

            WebElement address = driver.findElement(By.id("currentAddress"));
            address.sendKeys("Mysore");
            Thread.sleep(2000);

            WebElement stateDropdown = driver.findElement(By.id("react-select-3-input"));
            stateDropdown.sendKeys("Karnataka");
            stateDropdown.sendKeys(org.openqa.selenium.Keys.ENTER);

            WebElement cityDropdown = driver.findElement(By.id("react-select-4-input"));
            cityDropdown.sendKeys("Bangalore");
            cityDropdown.sendKeys(org.openqa.selenium.Keys.ENTER);
            
            WebElement submitButton = driver.findElement(By.id("submit"));
            scrollToElement(submitButton); 
            submitButton.click();
            
            WebElement confirmationMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-body")));
            System.out.println("Form submitted successfully. Message: " + confirmationMessage.getText());

        } finally {
            driver.quit();
        }
    }

    private void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}

