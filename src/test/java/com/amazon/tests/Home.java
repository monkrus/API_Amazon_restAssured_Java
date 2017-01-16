package com.amazon.tests;

import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;

public class Home {

    @Test
    public void makeSureThatGoogleIsUp() {
        given().when().get("https://www.amazon.com").then().statusCode(200);
    }

}
