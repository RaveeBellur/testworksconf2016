package com.ontestautomation.testworksconf.restassured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RestAssuredExercises4 {
	
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
		
	@BeforeClass
	public void retrieveOAuthToken() {
						
		given().
		when().
		then();
	}
	
	/*******************************************************
	 * Create a ResponseSpecification that checks whether:
	 * - the response has statusCode 200
	 * - the response contentType is JSON
	 * - the value of MRData.CircuitTable.Circuits.circuitName[0]
	 *   is equal to 'Albert Park Grand Prix Circuit'
	 ******************************************************/
	
	@BeforeClass
	public void createResponseSpecification() {
		
	}
	
	/*******************************************************
	 * Request a list of payments for this account and check
	 * that the number of payments made equals 4.
	 * Use OAuth2 authenticatie with the previously stored
	 * authentication token.
	 * Use /v1/payments/payment/
	 ******************************************************/
	
	@Test
	public void checkNumberOfPayments() {
		
		given().
		when().
		then();
	}
	
	/*******************************************************
	 * Retrieve the circuit data for the first race in 2014
	 * Use the previously created ResponseSpecification to
	 * execute the specified checks
	 * Use /api/f1/2014/1/circuits.json
	 * Additionally, check that the circuit is located in Melbourne
	 ******************************************************/
	
	@Test
	public void useResponseSpecification() {
		
		given().
		when().
		then();
	}
}
