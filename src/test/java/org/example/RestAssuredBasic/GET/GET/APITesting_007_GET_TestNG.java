package org.example.RestAssuredBasic.GET.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_007_GET_TestNG
{

@Test
    public void Test_GET_Request()
{
    RestAssured.given().relaxedHTTPSValidation()
            .baseUri("https://restful-booker.herokuapp.com")
            .basePath("/booking/1")
            .when()
            .get()
            .then()
            .log().all()
            .statusCode(200);
}
}
