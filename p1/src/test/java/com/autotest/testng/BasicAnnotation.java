package com.autotest.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //  最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testcase1(){
        System.out.println("testcase01");
    }
    @BeforeMethod
    public void  beforeMethod(){
        System.out.println("beforeMethod  是在测试方法之前运行的");

    }

    @AfterMethod
    public  void  afterMethod(){
        System.out.println("afterMethod  是在测试方法之后运行的");
    }
    @Test
    public void testcase2(){
        System.out.println("testcase02");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass 这是在类运行之前运行的方法");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass 这是在类运行之前运行的方法");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite 测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite 测试套件");
    }
}
