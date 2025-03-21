package org.example.Assertions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class APITesting0016_Assertion_Real
{

    public void test_Assertion_POST()
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
