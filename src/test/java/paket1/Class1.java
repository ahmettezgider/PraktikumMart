package paket1;

import org.testng.annotations.*;

public class Class1 {

    @BeforeTest
    public void beoreTest(){
        System.out.println("Before test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }

    @Test
    public static void test3() {
        System.out.println("Test 3");
    }

    @Test(priority = 1)
    public static void test2() {
        System.out.println("Test 2");
    }

}
