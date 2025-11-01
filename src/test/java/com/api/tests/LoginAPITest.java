package com.api.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAPITest {

    @Test(description = "Verify if login is working successfully")
    public void loginTest()
    {
        RestAssured.baseURI = "http://64.227.160.186:8080/";
        RequestSpecification x = RestAssured.given();
        RequestSpecification y = x.header("Content-Type", "application/json");
        RequestSpecification z = y.body("{\"username\": \"rashmitadeka09@gmail.com\",\"password\": \"Test@api\"}");
        Response response = z.post("/api/auth/login");
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.getStatusCode(), 200);

        //same as above
        Response response1 = RestAssured.given().
                baseUri("http://64.227.160.186:8080/").
                header("Content-Type", "application/json").
                body("{\"username\": \"rashmitadeka09@gmail.com\",\"password\": \"Test@api\"}")
                .post("/api/auth/login");

    }
}
