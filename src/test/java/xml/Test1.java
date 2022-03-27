package xml;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {

    @Test(priority = 4, groups = {"Smoke","B"})
    public void test1() {
        System.out.println("test1");
    }
    int b =1;
    @Test(priority = 3, groups = {"B"})
    public void test2() {
        int a = 4;

        System.out.println("test2");
    }


    @Test(dependsOnMethods = "test1", groups = {"Smoke"})
    public void test3() {

        System.out.println("test3");
    }

    @Test
    @Parameters({"text", "sayi"})
    public void test4(String str, int num) {
        System.out.println(str + ", " + num);
    }


    @Test(dataProvider = "data", groups = {"Smoke"})
    public void test5(String str, int num) {
        System.out.println(str + ", " + num);

    }

    @DataProvider(name = "data")
    public Object[][] getData(){
        Object[][] data = new Object[][]{
                {"A", 1},
                {"B", 2},
                {"C", 3}

        };
        return data;
    }

}
