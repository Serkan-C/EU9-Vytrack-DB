package avengerHours.week4;

import org.testng.annotations.*;

public class TestNG {

    @Test
    public void testMethod1(){
        System.out.println("this is test method 1");
    }

    @Ignore
    @Test
    public void testMethod2(){
        System.out.println("this is test method 2");
    }

    @Test
    public void testMethod3(){
        System.out.println("this is test method 3");
    }


    @BeforeMethod
    public void beforeMethodAnnotation(){
        System.out.println("Runs 1 time before every method");
    }

    @AfterMethod
    public void afterMethodAnnotation(){
        System.out.println("Runs 1 time after every method");
    }

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("run only 1 time before whole class");
    }

    @AfterClass
    public void afterClassAnnotation(){
        System.out.println("ren only 1 time after whole class");
    }



}
