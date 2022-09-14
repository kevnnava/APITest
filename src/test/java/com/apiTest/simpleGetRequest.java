package com.apiTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class simpleGetRequest {

    String url = "http://54.211.128.148:8000/api/spartans";

    @DisplayName("Simple get Request")
    @Test
    public void test1(){
        // send a request and save response inside the Response object
        Response response = RestAssured.get(url);

        // print response status code
        System.out.println("response.statusCode() = " + response.statusCode());

        // print response body
        response.prettyPrint();

        Assertions.assertEquals(200, response.statusCode());

    }
}
