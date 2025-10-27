package com.api.tests;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetUserProfileTest {

    @Test(description = "Verify if get user profile is working successfully")
    public void getUserProfileTest(){
        AuthService authService = new AuthService();
        Response response =  authService.login(new LoginRequest());
    }
}
