package org.example.RestAssuredBasic.GET.POST;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class APITesting_008_BDDStyle_POST
{
    @Description("verify-BDDStyle-Post")
    @Test

    public void test_POST_BDDStyle()
    {
        String payload="{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        RestAssured.given().relaxedHTTPSValidation()
                           .baseUri("https://restful-booker.herokuapp.com")
                           .basePath("/auth")
                            .contentType(ContentType.JSON)
                           .log().all()
                            .body(payload)
                .when().post()
                .then().log().all().statusCode(200);

    }
}
