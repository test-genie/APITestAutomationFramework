package com.api.tests;

import com.api.base.AuthService;
import com.api.models.request.SignupRequest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignupTest {

    @Test(description = "User is registered successfull")
    public void signupTest()
    {
        SignupRequest signupRequest = new SignupRequest.Builder().
                username("disha").
                password("patni").
                email("disha@gmail.com").
                firstName("disha").lastName("patni").
                mobilenumber("9787967585").build();
        AuthService auth = new AuthService();
        Response response = auth.signup(signupRequest);
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.getStatusCode(), 200);

    }
}
