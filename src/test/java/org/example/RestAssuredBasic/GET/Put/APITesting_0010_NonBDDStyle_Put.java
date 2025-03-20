package org.example.RestAssuredBasic.GET.Put;


import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_0010_NonBDDStyle_Put {

 @Description("verify the put in RestAssured Booker")
 @Test()

    public void test_Post_NONBDDStyle()
 {
      String token="21eb6b0486cb72d";
      String bookingid="1793";
      String payload="{\n" +
              "    \"firstname\" : \"James\",\n" +
              "    \"lastname\" : \"Brown\",\n" +
              "    \"totalprice\" : 111,\n" +
              "    \"depositpaid\" : true,\n" +
              "    \"bookingdates\" : {\n" +
              "        \"checkin\" : \"2018-01-01\",\n" +
              "        \"checkout\" : \"2019-01-01\"\n" +
              "    },\n" +
              "    \"additionalneeds\" : \"Breakfast\"\n" +
              "}";

     RequestSpecification R= RestAssured.given().relaxedHTTPSValidation();
                 R.baseUri("https://restful-booker.herokuapp.com");
                 R.basePath("/booking/" +bookingid);
                 R.contentType(ContentType.JSON);
                 R.cookie("token",token);
                 R.body(payload);

     Response response=R.when().put();
     ValidatableResponse VR= response.then().log().all();
     VR.statusCode(200);

 }

}
