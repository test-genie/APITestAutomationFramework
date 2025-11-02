package com.api.tests;

import com.api.base.AuthService;
import com.api.base.UserManagement;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserManagementResponse;
import io.restassured.response.Response;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.api.listeners.TestListener.class)
public class GetUserProfileTest {

    @Test(description = "Verify if get user profile is working successfully")
    public void getUserProfileTest(){
        AuthService authService = new AuthService();
        Response response =  authService.login(new LoginRequest("rashmitadeka09@gmail.com", "Test@api"));
        LoginResponse loginResponse = response.as(LoginResponse.class);
        UserManagement userManagement = new UserManagement();
        response = userManagement.getProfile(loginResponse.getToken());
        UserManagementResponse usermanagementresponse = response.as(UserManagementResponse.class);
        System.out.println(usermanagementresponse.getFirstName());

    }
}
