package com.example.springredditclone.util;


import lombok.experimental.UtilityClass;

//this annotation will make the following changes at compile time to our class:
@UtilityClass
public class Constants {
    public static final String ACTIVATION_EMAIL = "http://localhost:8080/api/auth/accountVerification";
}
