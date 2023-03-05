package com.spotify;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;


public class Spotify_Artist {

	String token = "Bearer BQAa5RSd3VrVlETswtiGcIbEBrNUImd-1K4IhQJdWtvhJv1jMlqbuoKMJ5L6N5b6hI6Z3bpHn838mLZ3LG_QcBO0NXU6Tt9p4qKg2sYJh38J9oJJv41RgbjB51tt8t0E0uKZtbeenbFgLx2xZYTE2pkAmCUBDSuKCMk4v9Y9-rrY8Jwtm6D7oY5al1pFAGiJPoARb6D6dpY-4uDHLJ0N7Tj7GyZluKK9d4u1-S9muV-YsiBiv3MXNUzcakC6qOdG1hriz9xHgalOqLo6euCM-rJ6RTwLOzpzu7zD5MSSfarZRGl4WQ";
	
	@Test
	public void getArtistAlbumsAPIExecution_ReturnSuccess() {
		
		given().contentType("application/json")
		.accept("application/json")
		.header("Authorization",token)
		.when()
        .get("https://api.spotify.com/v1/artists/4PULA4EFzYTrxYvOVlwpiQ/albums")
		.then()
        .log()
        .all()
        .statusCode(200);
		
	}
	
	@Test
	public void getArtistRelatedArtistsAPIExecution_ReturnSucess() {
		
		given().contentType("application/json")
		.accept("application/json")
		.header("Authorization",token)
		.pathParam("id", "4PULA4EFzYTrxYvOVlwpiQ")
		.when()
        .get("https://api.spotify.com/v1/artists/{id}/related-artists")
		.then()
        .log()
        .all()
        .statusCode(200);
	}

	@Test
	public void getArtistTopTracksAPIExecution_ReturnSuccess() {
		given().contentType("application/json")
		.accept("application/json")
		.header("Authorization",token)
		.pathParam("id", "4PULA4EFzYTrxYvOVlwpiQ")
		.when()
        .get("https://api.spotify.com/v1/artists/{id}/top-tracks?market=ES")
		.then()
        .log()
        .all()
        .statusCode(200);
	}
	
	@Test
	public void getArtistAPIExecution_ReturnSuccess() {
		given().contentType("application/json")
		.accept("application/json")
		.header("Authorization",token)
		.pathParam("id", "4PULA4EFzYTrxYvOVlwpiQ")
		.when()
        .get("https://api.spotify.com/v1/artists/{id}")
		.then()
        .log()
        .all()
        .statusCode(200);
	}
	@Test
	public void getArtist_Name() {
	Response response = given().contentType("application/json")
		.accept("application/json")
		.header("Authorization", token)
		.pathParam("id", "4PULA4EFzYTrxYvOVlwpiQ")
		.get("https://api.spotify.com/v1/artists/{id}");
		response.prettyPrint();
		String name = response.path("name");
		System.out.println("Artist_Name: " + name);
	//	System.out.println("Response : " + response);
	
		int popularity = response.path("popularity");
		System.out.println("popularity : " + popularity);
		
		response.then().assertThat().statusCode(200);
		
	//	Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	
	@Test
	public void getServelArtistAPIExecution_ReturnSuccess() {
		given().contentType("application/json")
		.accept("application/json")
		.header("Authorization",token)
		.pathParam("ids", "4PULA4EFzYTrxYvOVlwpiQ")
		.when()
        .get("https://api.spotify.com/v1/artists/{ids}")
		.then()
        .log()
        .all()
        .statusCode(200);
	}
	
	@Test
	public void getServelArtist_Name() {
	Response response = given().contentType("application/json")
		.accept("application/json")
		.header("Authorization", token)
		.pathParam("ids", "4PULA4EFzYTrxYvOVlwpiQ")
		.get("https://api.spotify.com/v1/artists/{ids}");		
		response.prettyPrint();
		String name = response.path("name");
		System.out.println("Artist_Name: " + name);
	//	System.out.println("Response : " + response);
	
		int popularity = response.path("popularity");
		System.out.println("popularity : " + popularity);
		
		response.then().assertThat().statusCode(200);
		}
	}
