package org.example.SampleCheck;

import io.restassured.RestAssured;

public class APITest002
{
    public static void main(String[] args) {

        //Full url:" https://restful-booker.herokuapp.com/booking/1"

        //Base uri:" https://restful-booker.herokuapp.com/"
        //Base path:" booking/1"


        RestAssured
                .given().relaxedHTTPSValidation()
                    .baseUri("https://restful-booker.herokuapp.com/")
                    .basePath("booking/1")
                .when().
                      get()
                .then()
                        .log().all()
                        .statusCode(200);
    }
}
