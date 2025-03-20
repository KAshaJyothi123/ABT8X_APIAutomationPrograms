package org.example.RestAssuredBasic.GET.POST;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_009_NONBDDStle_POST
{
    @Description
    @Test
    public void test_POST_NONBDDStyle()
    {
        String payload="{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        RequestSpecification r= RestAssured.given().relaxedHTTPSValidation();
                     r.baseUri("https://restful-booker.herokuapp.com");
                     r.basePath("/auth");
                     r.contentType(ContentType.JSON);
                     r.log().all();
                     r.body(payload);
                     r.when().post();
                     r.then().log().all().statusCode(200);

    }
}
