package com.spotify;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Spotify_Episode {

	String token = "Bearer BQCVrsfRCJHhPIiVF3RI_JT1dmxZSx_G_o7vpOPHTBJNmE3cp1GF2HzAgCzj6N_RD2ewTXMrjaoQefkKqZ_cL7EuhubNwuusQAMgQvlNkx7e0LOwFMPNKgTuoPWD7r8nzaB1WwwCAYU4tQNFQMpsGEUNIt-6xy4Zi-pxHsqyqnhoVaxSQuvvIYM9mZ8Qz1qKK0aHJ153X3wla4dWOdxRLovROkEaatjce0sZnxEvidF84QxY8qVdvLNIwGiOriJBSIva0HjPhu_GiA3650SeZ3LUpzK1tqf4JVotWh615znNp8Y";
	@Test
	public void getEpisodeAPIExecution_ReturnSuccess() {
		
	 given().contentType("applicaion/json")
			                    .accept("application/json")
			                    .header("Authorization", token)
			                    .pathParam("id", "2ct08HjXRRrdg5YKHrt0ER")
			                    .when()
			                    .get("https://api.spotify.com/v1/episodes/{id}?market=ES")
			                    .then()
			                    .log()
			                    .all()
			                    .statusCode(200);
	}
	
	@Test
	public void getEpisode_Name() {
	Response response = given().contentType("application/json")
		.accept("application/json")
		.header("Authorization", token)
		.pathParam("id", "2ct08HjXRRrdg5YKHrt0ER")
		.get("https://api.spotify.com/v1/episodes/{id}?market=ES");
		response.prettyPrint();
		String name = response.path("name");
		System.out.println("Episode_Name: " + name);
	
		response.then().assertThat().statusCode(200);
	}
	
	@Test
	public void getServelEpisodeAPIExecution_ReturnSuccess() {
		
	 given().contentType("applicaion/json")
			                    .accept("application/json")
			                    .header("Authorization", token)
			                    .queryParam("ids", "2ct08HjXRRrdg5YKHrt0ER")
			                    .when()
			                    .get("https://api.spotify.com/v1/episodes?ids=2ct08HjXRRrdg5YKHrt0ER&market=ES")
			                    .then()
			                    .log()
			                    .all()
			                    .statusCode(200);
	}
}
