package org.example.RestAssuredBasic.GET.Intergaration;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_011_TestCaseIntegration
{


    //Create a Tokken
    //Create a Booking
    //perform a Put
    //Verify that PUT is sucess by GET Request
    //Delete the ID
    //verify if doesn't exist GET Request

     RequestSpecification RS;
     Response R;
     ValidatableResponse VR;

     String token;
     String bookingid;

    @Description("verify the integration scenario")
    @Test
     public String getToken() {
         String payload = "{\n" +
                 "    \"username\" : \"admin\",\n" +
                 "    \"password\" : \"password123\"\n" +
                 "}";
         //given()
         RS = RestAssured.given().relaxedHTTPSValidation();
         RS.baseUri("https://restful-booker.herokuapp.com");
         RS.basePath("/auth");
         RS.contentType(ContentType.JSON);
         RS.body(payload);

         //when
         R = RS.when().post();

         //then()
         VR = R.then().log().all();
         VR.statusCode(200);

         //Extract the token
         token = R.jsonPath().getString("token");
         System.out.println(token);
         return token;
     }



    public String getBookingid() {

         String payloadPost="{\n" +
                 "    \"firstname\": \"Sally\",\n" +
                 "    \"lastname\": \"Brown\",\n" +
                 "    \"totalprice\": 111,\n" +
                 "    \"depositpaid\": true,\n" +
                 "    \"bookingdates\": {\n" +
                 "        \"checkin\": \"2013-02-23\",\n" +
                 "        \"checkout\": \"2014-10-23\"\n" +
                 "    },\n" +
                 "    \"additionalneeds\": \"Breakfast\"\n" +
                 "}\n";

        RS=RestAssured.given().relaxedHTTPSValidation();
                RS.baseUri("https://restful-booker.herokuapp.com");
                RS.basePath("/booking" +bookingid);
                RS.contentType(ContentType.JSON);
                RS.body(payloadPost);

                R = RS.when().post();

        //then()
        VR = R.then().log().all();
        VR.statusCode(200);

        //Extract the token
        token = R.jsonPath().getString("bookingid");
        System.out.println(bookingid);

        //Extract the token
        token = R.jsonPath().getString("bookingid");
        System.out.println(bookingid);






        return bookingid;
    }


    @Test
    public String test_update_request_put()
    {
       String token =getToken();
        System.out.println(token);


        return token;
    }

    @Test
    public void test_update_request_get()
   {
       System.out.println(bookingid);
   }

   @Test
    public void test_delete_booking()
   {
       System.out.println(bookingid);
       System.out.println(token);
   }

   @Test
    public void test_after_delete_request_get()
   {
       System.out.println(bookingid);
   }

}

