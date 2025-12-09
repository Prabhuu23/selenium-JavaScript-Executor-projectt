import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base.BaseTest;

public class JSExecutorTest extends BaseTest {

    @Test
    public void jsExecutorActions() {
        driver.get("https://demoqa.com/text-box");

        WebElement submitBtn = driver.findElement(By.id("submit"));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to button
        js.executeScript("arguments[0].scrollIntoView(true);", submitBtn);

        // Highlight button
        js.executeScript("arguments[0].style.border='3px solid red'", submitBtn);

        // Click via JS
        js.executeScript("arguments[0].click();", submitBtn);
    }
}
