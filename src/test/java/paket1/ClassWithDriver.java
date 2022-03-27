package paket1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class ClassWithDriver {

    WebDriver driver;

    @BeforeTest
    @Parameters({"browser"})
    public void beforeTest(String browser){
        switch (browser) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                ChromeOptions options = new ChromeOptions();
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
        }
    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }

    @Test
    public void test3() {
        driver.get("https://www.google.com");
    }

    @Test(priority = 1)
    public void test2() {
        System.out.println("Test 2");
    }

    //button[ ./*[text()='Add to Cart'] or contains(@onclick,'wish')]

    //button[ contains(@onclick,'cart.add') or contains(@onclick,'wish')]
}
