package org.example.SampleCheck;

public class APITest003_NoDesignPattern
{
    public void Step1()
    {
        System.out.println("Step 1");
    }
    public void Step2()
    {
        System.out.println("Step 2");
    }
    public void Step3(String name)
    {
        System.out.println("Step 3");
    }

    public static void main(String[] args) {
        APITest003_NoDesignPattern Api=new APITest003_NoDesignPattern();
        Api.Step1();
        Api.Step2();
        Api.Step3("Asha");
    }
}
