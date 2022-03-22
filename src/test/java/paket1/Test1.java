package paket1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.Driver;

public class Test1 {

    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        driver = Driver.getDriver();
    }

    @AfterTest
    public void afterTest(){
        Driver.quitDriver();
    }

    @Test
    public void test3() {
        driver.get("https://www.google.com");
    }

    @Test(priority = 1)
    public void test2() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.yahoo.com");
    }


}
