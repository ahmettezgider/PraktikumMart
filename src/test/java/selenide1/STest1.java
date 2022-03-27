package selenide1;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class STest1 {

    @Test
    public void test1(){
        open("http://opencart.abstracta.us/");

        $(By.cssSelector("input[name='search']"))
                .shouldBe(Condition.visible)
                .setValue("mac")
                .pressEnter();

        By captions = By.cssSelector(".caption h4");
        //$$(captions).shouldHave(CollectionCondition.sizeGreaterThan(3)).filter(Condition.visible);

        By ca = By.xpath("//footer//a[text()='Contact Us']");
        $(ca).scrollIntoView(true).click();




    }
}
