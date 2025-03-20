package org.example.RestAssuredBasic.GET.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_005_BDDStyleGET
{
    @Test
    public void test_GET_Req_POSITIVE()
    {
        String Pin_Code="90210";
        RestAssured.given()
                .relaxedHTTPSValidation()
                       .baseUri("https://api.zippopotam.us/")
                       .basePath("/us/" +Pin_Code)
                .when()
                        .log().all()
                        .get()
                .then()
                        .log().all()
                         .statusCode(200);

    }

    @Test
    public void test_GET_Req_NEGATIVE()
    {
        String Pin_Code="-1";
        RestAssured.given()
                .relaxedHTTPSValidation()
                .baseUri("https://api.zippopotam.us/")
                .basePath("/us/" +Pin_Code)
                .when()
                .log().all()
                .get()
                .then()
                .log().all()
                .statusCode(200);

    }
}
