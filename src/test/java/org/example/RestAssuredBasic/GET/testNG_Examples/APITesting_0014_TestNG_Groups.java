package org.example.RestAssuredBasic.GET.testNG_Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_0014_TestNG_Groups
{
    @Test(groups ={"sanity","qa","prepared"},priority = 1)
    public  void sanityRun()
    {
        System.out.println("QA");
        System.out.println("sanity");
        Assert.assertTrue(true);
    }

    @Test(groups ={"qa","reg","prepared"})
    public void regRun()
    {
        System.out.println("reggression");
        Assert.assertTrue(false);
    }

    @Test(groups ={"dev","smoke"})
    public void smokeRun()
    {
        System.out.println("smoke");
        Assert.assertTrue(false);
    }

    @Test(groups ={"sanity","qa","prepared"})
    public void sanityRun1()
    {
        System.out.println("sanity");
        Assert.assertTrue(true);
    }

    @Test(groups ={"reg","qa","prepared"})
    public void regRun2()
    {
        System.out.println("regression");
        Assert.assertTrue(false);
    }

    @Test(groups ={"dev","smoke"})
    public void smokeRun3()
    {
        System.out.println("smoke");
        Assert.assertTrue(false);
    }
}
