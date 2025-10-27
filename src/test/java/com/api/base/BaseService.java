package com.api.base;

import com.api.models.request.LoginRequest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {  //wrapper for Rest assured

    //BaseURI
    //Creating the request
    //handling the response

    private static final String baseURL = "http://64.227.160.186:8080/";
    private RequestSpecification requestSpecification;

    public BaseService()
    {

        requestSpecification = RestAssured.given().baseUri(baseURL);
    }

    protected void setAuthToken(String token)
    {
        requestSpecification.header("Authorization", "Bearer "+token);
    }

    protected Response postRequest(Object payload, String endpoint)
    {
        return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
    }

    protected Response getRequest(String endpoint)
    {
        return requestSpecification.contentType(ContentType.JSON).get(endpoint);
    }
}
