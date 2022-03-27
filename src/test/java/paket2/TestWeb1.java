package paket2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.Driver;

import java.util.List;

public class TestWeb1 {

    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        driver = Driver.getDriver();
    }


    By searchButton = By.cssSelector("input[name='search']");
    By captions = By.cssSelector(".caption h4");

    @Test
    public void test01(){
        driver.get("http://opencart.abstracta.us/");
        driver.findElement(searchButton).sendKeys("mac" + Keys.ENTER);


        WebDriver driver1 = Driver.getDriver();
        List<WebElement> listOfCaptions = driver1.findElements(captions);

       listOfCaptions.forEach(e -> System.out.println(e.getText()));

       for (WebElement e : listOfCaptions) {
           System.out.println(e.getText());
        }


    }
}
