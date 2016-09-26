package com.ontestautomation.testworksconf.restassured.answers;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RestAssuredAnswers4 {
	
	@BeforeClass
	public void initPath() {
		
		RestAssured.baseURI = "http://localhost:9876";
	}
	
	/*******************************************************
	 * Request an authentication token for the Paypal sandbox
	 * API and write the response to the console
	 * Use Basic authentication
	 * username = oauth
	 * password = gimmeatoken
	 * Use /v1/oauth2/token
	 * Store this authentication token in a String variable
	 * for future reference
	 ******************************************************/
	
	String accessToken;
	
	@BeforeClass
	public void retrieveOAuthToken() {
						
		accessToken = 
				
		given().
			auth().
			preemptive().
			basic("oauth","gimmeatoken").
		when().
			get("/v1/oauth2/token").
		then().
			extract().
			path("access_token");
	}
	
	/*******************************************************
	 * Request a list of payments for this account and check
	 * that the number of payments made equals 4.
	 * Use OAuth2 authenticatie with the previously stored
	 * authentication token.
	 * Use /v1/payments/payment/
	 * Value to be retrieved is in the paymentsCount field
	 ******************************************************/
	
	@Test
	public void checkNumberOfPayments() {
		
		given().
			auth().
			oauth2(accessToken).
		when().
			get("/v1/payments/payment/").
		then().
			assertThat().
			body("paymentsCount",equalTo(4));
	}
}