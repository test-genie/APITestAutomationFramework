package com.api.models.request;

public class SignupRequest {
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String mobilenumber;

    public SignupRequest(String username, String password, String email, String firstName, String lastName, String mobilenumber) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobilenumber = mobilenumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    @Override
    public String toString() {
        return "SignupRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobilenumber=" + mobilenumber +
                '}';
    }

    public static class Builder{
        private String username;
        private String password;
        private String email;
        private String firstName;
        private String lastName;
        private String mobilenumber;

        public Builder username(String username)
        {
            this.username = username;
            return this;
        }
        public Builder password(String password)
        {
            this.password = password;
            return this;
        }
        public Builder email(String email)
        {
            this.email = email;
            return this;
        }
        public Builder firstName(String firstName)
        {
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(String lastName)
        {
            this.lastName = lastName;
            return this;
        }
        public Builder mobilenumber(String mobilenumber)
        {
            this.mobilenumber = mobilenumber;
            return this;
        }
        public SignupRequest build()
        {
            SignupRequest signupRequest = new SignupRequest(username,password,email,firstName,lastName,mobilenumber);
            return signupRequest;
        }
    }
}
