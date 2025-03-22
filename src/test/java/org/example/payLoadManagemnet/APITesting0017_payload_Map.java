package org.example.payLoadManagemnet;

import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class APITesting0017_payload_Map
{

    @Test
    public void test_payload_Map()
    {
//        {
//            "firstname" : "Jim",
//                "lastname" : "Brown",
//                "totalprice" : 111,
//                "depositpaid" : true,
//                "bookingdates" : {
//            "checkin" : "2018-01-01",
//                    "checkout" : "2019-01-01"
//        },
//            "additionalneeds" : "Breakfast"
//        }

        //JSON -->HashMap
        Map<String,Object> jsonBodyUsingMap=new LinkedHashMap();
        jsonBodyUsingMap.put("firstname","Jim");
        jsonBodyUsingMap.put("lastname","brown");
        jsonBodyUsingMap.put("totalprice","111");
        jsonBodyUsingMap.put("depositeid","true");


        Map<String,Object> bookingDatesMap=new LinkedHashMap();
        bookingDatesMap.put("checkin","2018-01-01");
        bookingDatesMap.put("checkout","2019-01-01");

        bookingDatesMap.put("bookingdates","bookingdatesMap");
        bookingDatesMap.put("additionalneeds","Breakfast");

        System.out.println(jsonBodyUsingMap);
        System.out.println(bookingDatesMap);


    }
}
