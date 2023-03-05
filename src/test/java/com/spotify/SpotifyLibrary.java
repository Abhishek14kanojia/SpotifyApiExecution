package com.spotify;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class SpotifyLibrary {

	String token = "Bearer BQB1mi4j8YKrL0IMb-zq82TKVjtiW7yYjjhTe3vm5iR4iwV790LX8YJkkECips_ae3nevU1qEZ3hdl3iMGrPJJiCcq0SrDFUIOPx1Ux5nZWOZvrqcqHKod16L2NS90onqXFPRgq_DY0qxJWIqIYjLdiQUKrpBAeczlte__iCm_vou1rnChqXKq5Spcj62wQIvIVzOkWSNX9dVBdnIUmTYxXwuYTAKM7w-bsi1ZHtQ7oWGelQMUCSTNwpfb4KD8ELp7bzmhHWbil3qI1ouGBXk0k0Xa7BMFg";
	
	@Test
	public void checkUserSavedAlbumsAPIExecution_ReturnSuccess() {
		given().accept("application/json")
			   .contentType("application/json")	
			   .header("Authorization", token)
			   .queryParam("ids", "45ZIondgVoMB84MQQaUo9T")
			   .get("https://api.spotify.com/v1/me/albums/contains")
			   .then().log().all().statusCode(200);
			   
	}
	
	@Test
	public void checkUserSavedEpisodeAPIExecution_ReturnSuccess() {
		given().accept("application/json")
			   .contentType("application/json")	
			   .header("Authorization", token)
			   .queryParam("ids", "2ct08HjXRRrdg5YKHrt0ER")
			   .get("https://api.spotify.com/v1/me/episodes/contains")
			   .then().log().all().statusCode(200);			   
	}
	@Test
	public void getUserSavedTracksAPIExecution_ReturnSuccess() {
		given().accept("application/json")
			   .contentType("application/json")	
			   .header("Authorization", token)
			   .get("https://api.spotify.com/v1/me/tracks?market=ES&limit=2&offset=2")
			   .then().log().all().statusCode(200);			   
	}
	@Test
	public void getUserSavedShowAPIExecution_ReturnSuccess() {
		given().accept("application/json")
			   .contentType("application/json")	
			   .header("Authorization", token)
			   .get("https://api.spotify.com/v1/me/shows?limit=2&offset=3")
			   .then().log().all().statusCode(200);			   
	}
	
}
