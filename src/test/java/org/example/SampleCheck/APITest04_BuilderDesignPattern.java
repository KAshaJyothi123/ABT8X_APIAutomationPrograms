package org.example.SampleCheck;

public class APITest04_BuilderDesignPattern
{
    public APITest04_BuilderDesignPattern Step1()
    {
        System.out.println("Step1 is Started");
        System.out.println("step1 is done");
        return this;
    }

    public APITest04_BuilderDesignPattern Step2()
    {
        System.out.println("Step2 is started");
        System.out.println("Step2 is done");
        return this;
    }
    public APITest04_BuilderDesignPattern Step3(String name)
    {
        System.out.println("Step3 is started");
        System.out.println("Step3 is done:" +name);
        return this;
    }

    public static void main(String[] args) {
        APITest04_BuilderDesignPattern api=new APITest04_BuilderDesignPattern();
        api.Step1().Step2().Step3("Asha");
    }
}
