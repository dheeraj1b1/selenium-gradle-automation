import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FirstUITest {

    @Test
    public void openGoogleTest() {
        WebDriver driver = DriverFactory.getDriver();

        driver.get("https://www.google.com");
        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();
    }
}
