package org.example.RestAssuredBasic.GET.testNG_Examples;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class APITesting_0012

{
    @BeforeTest
    public void getToken()
    {
        System.out.println("1");
    }

    @BeforeTest
    public void getBookigId()
    {
        System.out.println("2");
    }

    @Test
    public  void test_PUT()
    {
        System.out.println("3");
    }

}
