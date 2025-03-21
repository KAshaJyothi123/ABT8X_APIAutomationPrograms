package org.example.Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class APITesting0015_Assertions {
    //TestNG Assertion
    //ER==AR
    //Expected result == Actual result

    @Test
    public void test_HardAssertion() {
        System.out.println("Strated the program");
        Assert.assertTrue(false);
        System.out.println("End the program");
    }

    @Test
    public void test_SoftAssertion()
    {
        SoftAssert sa= new SoftAssert();
        sa.assertTrue(false);//this will not stop execution
        System.out.println("This line will be executed");
        //sa.assertAll(); //this will report all collection
    }
}
