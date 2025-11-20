import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

    public static WebDriver getDriver() {

        String cloud = System.getenv("CLOUD");

        if (cloud != null && cloud.equalsIgnoreCase("true")) {
            // HEADLESS FIREFOX FOR GITPOD
            WebDriverManager.firefoxdriver().setup();

            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--headless");

            return new FirefoxDriver(options);
        }

        // NORMAL CHROME FOR LOCAL MACHINE
        WebDriverManager.chromedriver().setup();
        return new org.openqa.selenium.chrome.ChromeDriver();
    }
}