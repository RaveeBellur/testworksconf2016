package com.ontestautomation.testworksconf.restassured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;

import org.junit.Before;
import org.junit.Test;

public class RestAssuredExercises1 {
	
	@Before
	public void initPath() {
		
		RestAssured.baseURI = "http://localhost:9876";
	}
		
	/*******************************************************
	 * Send a GET request to /api/f1/2016/drivers.json
	 * and check that the answer has HTTP status code 200 
	 ******************************************************/
	
	@Test
	public void checkResponseCodeForCorrectRequest() {
				
		given().
		when().
		then();
	}
	
	/*******************************************************
	 * Send a GET request to /api/f1/incorrect.json
	 * and check that the answer has HTTP status code 500 
	 ******************************************************/
	
	@Test
	public void checkResponseCodeForIncorrectRequest() {
						
		given().
		when().
		then();
	}
	
	/*******************************************************
	 * Send a GET request to /api/f1/2015/drivers.json
	 * and check that the response is in JSON format 
	 ******************************************************/
	
	@Test
	public void checkResponseContentTypeJson() {
				
		given().
		when().
		then();
	}
	
	/***********************************************
	 * Retrieve circuit information for the first race
	 * of the 2014 season and check the circuitId equals
	 * albert_park
	 * Use /api/f1/2014/1/circuits.json
	 **********************************************/
	
	@Test
	public void checkTheFirstRaceOf2014WasAtAlbertPark() {
				
		given().
		when().
		then();
	}
	
	/***********************************************
	 * Retrieve the list of circuits for the 2014
	 * season and check that it contains silverstone
	 * Use /api/f1/2014/circuits.json
	 **********************************************/
	
	@Test
	public void checkThereWasARaceAtSilverstoneIn2014() {
		
		given().
		when().
		then();
	}
	
	/***********************************************
	 * Retrieve the list of circuits for the 2014
	 * season and check that it does not contain
	 * nurburgring
	 * USe /api/f1/2014/circuits.json
	 **********************************************/
	
	@Test
	public void checkThereWasNoRaceAtNurburgringIn2014() {
		
		given().
		when().
		then();
	}
}