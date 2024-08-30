    // Locate the date picker input element

package DemoTools;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DatePicker extends BaseClass {
    @Test
    public void testDatePicker() {

    	try {
            driver.get("https://demoqa.com/date-picker");
            WebDriverWait wait = new WebDriverWait(driver, 15);

            // Locate and click the date picker input element
            WebElement datePickerInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("datePickerMonthYearInput")));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", datePickerInput);
            
            // Try clicking the date picker input
            try {
                datePickerInput.click();
            } catch (ElementClickInterceptedException e) {
                System.out.println("Element click intercepted, handling overlay.");
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("google_ads_iframe_...")));
                datePickerInput.click();  
            }

            // Wait for the calendar to be visible
            WebElement calendar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("react-datepicker__month-container")));
            WebElement yearDropdown = calendar.findElement(By.className("react-datepicker__year-select"));
            yearDropdown.click();
            WebElement year2024 = calendar.findElement(By.cssSelector("option[value='2024']"));
            year2024.click();

            WebElement monthDropdown = calendar.findElement(By.className("react-datepicker__month-select"));
            monthDropdown.click();
            WebElement august = calendar.findElement(By.cssSelector("option[value='7']")); // Months are zero-indexed
            august.click();
            WebElement day23 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'react-datepicker__day') and text()='23']")));
            day23.click();

            // Verify that the selected date is displayed in the input
            String selectedDate = datePickerInput.getAttribute("value");
            if (selectedDate.equals("08/23/2024")) {
                System.out.println("Date selected successfully: " + selectedDate);
            } else {
                System.out.println("Date selection failed. Selected date: " + selectedDate);
            }
        } finally {
            driver.quit();
        }
    }
}
