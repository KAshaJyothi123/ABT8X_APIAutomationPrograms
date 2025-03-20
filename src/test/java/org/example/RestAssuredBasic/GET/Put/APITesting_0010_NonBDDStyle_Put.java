package org.example.RestAssuredBasic.GET.Put;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_0010_NonBDDStyle_Put {
//     @Description("Verify put nonbddstyle in RestAssured Booker")
//     @Test
//
//    public void test_Put_NonBDDStyle()
//    {
//
//        String token="0d18fc11da72b9d";
//        String BookingId="3907";
//
//       String payload="{\n" +
//               "    \"firstname\" : \"James\",\n" +
//               "    \"lastname\" : \"Brown\",\n" +
//               "    \"totalprice\" : 111,\n" +
//               "    \"depositpaid\" : true,\n" +
//               "    \"bookingdates\" : {\n" +
//               "        \"checkin\" : \"2018-01-01\",\n" +
//               "        \"checkout\" : \"2019-01-01\"\n" +
//               "    },\n" +
//               "    \"additionalneeds\" : \"Breakfast\"\n" +
//               "}";
//
//        RequestSpecification R= RestAssured.given().relaxedHTTPSValidation();
//                            R.baseUri("https://restful-booker.herokuapp.com");
//                            R.basePath("/booking/" +BookingId);
//                            R.contentType(ContentType.JSON);
//                            R.cookie("token",token);
//                            R.body(payload).log().all();
//
//        Response response=R.when().put();
//
//        ValidatableResponse VR= response.then().log().all();
//        VR.statusCode(200);
//
//


    // }
    @Description("Verify the PUT Request for the Restful Booker APIs")

    @Test

    public void test_put_NonBDD() {

        // Define booking ID and token

        String token = "1b8b491e830ab88";

        String bookingId = "2075";

        // Create JSON payload as a String

        String payload = "{\n" +
                "            \"firstname\" : \"James\",\n" +
                "            \"lastname\" : \"Brown\",\n" +
                "            \"totalprice\" : 111,\n" +
                "            \"depositpaid\" : true,\n" +
                "            \"bookingdates\" : {\n" +
                "                \"checkin\" : \"2018-01-01\",\n" +
                "                \"checkout\" : \"2019-01-01\"\n" +
                "            },\n" +
                "            \"additionalneeds\" : \"Breakfast\"\n" +
                "        }";

        // Set up the request specification

        RequestSpecification request = RestAssured.given()

                .baseUri("https://restful-booker.herokuapp.com")

                .basePath("/booking/{bookingId}")

                .contentType(ContentType.JSON)

                .cookie("token", token)

                .body(payload)   // Adding the body payload

                .log().all();    // Logging request for debugging

        // Send the PUT request and capture the response

        Response response = request

                .when()

                .put(bookingId);

        ValidatableResponse validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

    }
}
