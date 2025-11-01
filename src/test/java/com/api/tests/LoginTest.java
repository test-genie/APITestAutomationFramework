package com.api.tests;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import io.restassured.response.Response;
import org.apache.commons.lang3.ObjectUtils;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.api.listeners.TestListener.class)
public class LoginTest {

    @Test(description = "Verify if login is working successfully")
    public void loginTest(){
        LoginRequest loginRequest = new LoginRequest("rashmitadeka09@gmail.com", "Test@api");
        AuthService auth = new AuthService();
        Response response = auth.login(loginRequest);
        LoginResponse loginResponse = response.as(LoginResponse.class);
        System.out.println(response.asPrettyString());
        System.out.println(loginResponse.getToken());
        Assert.assertNotNull(loginResponse.getToken(), "Token is not null");
        Assert.assertEquals(loginResponse.getEmail(), "rashmitadeka09@gmail.com");
        Assert.assertEquals(loginResponse.getId(), 3074);


    }
}
