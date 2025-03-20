package org.example.RestAssuredBasic.GET.GET;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_006_NonBddStyle
{
    RequestSpecification r= RestAssured.given().relaxedHTTPSValidation();

    @Severity(SeverityLevel.CRITICAL)
    @Description("TC1-NonBDDStyle-Positive")
    @Test
    public void test_NONBDDStyleGET_Positive()
    {
        r.baseUri("https://api.zippopotam.us/");
        r.basePath("/us/90210");
        r.when().log().all().get();
        r.then().log().all().statusCode(200);
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("TC1-NonBDDStyle-Negative")
    @Test
    public void test_NONBDDStyleGET_Negative()
    {
        r.baseUri("https://api.zippopotam.us/");
        r.basePath("/us/90210");
        r.when().log().all().get();
        r.then().log().all().statusCode(200);
    }


}

