package com.spotify;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Spotify_Album {

String token = "Bearer BQCcDead0CqscGX6oFdemma2qTqvnKQRAFm5z0Jhhkw7BC8Fhi1l2TPvUlFq4SLVI7J0banEWUqY9pmw7meEkRnqdnAow3ultNz5xBo5gy0P52xs74mqWvKNz9gEX5ZCSXeIZcp8eSs_YLsKLlWK8issV5jVWfU7Rvk3hENH08o52dHR8LqIdWHEU8K4lfheydf1hsL1vzpjaCaUQDXsyCtpyP0CiispiHGwbxOh_J30y742P_VP-cs9KjMxf4mlX8OtBvCiN_6jWOJpDFHbd5xL";
	
	@Test
	public void getAlbumAPI_ReturnSuccess() {
		
		given()
		
			.accept("application/json")
			.contentType("application/json")
			.header("Authorization",token)
			.get("https://api.spotify.com/v1/albums/45ZIondgVoMB84MQQaUo9T?market=ES")
			.then().log().all().statusCode(200);
			
	}
	
	@Test
	public void getAlbum_Lable() {
	Response response = given().contentType("application/json")
		.accept("application/json")
		.header("Authorization", token)
		.get("https://api.spotify.com/v1/albums/45ZIondgVoMB84MQQaUo9T?market=ES");
		response.prettyPrint();
		String name = response.path("name");
		System.out.println("Album_Name: " + name);
	//	System.out.println("Response : " + response);
	
		String labelName = response.path("label");
		System.out.println("Label : " + labelName);
		
	//	response.then().assertThat().statusCode(200);
		
	//	Assert.assertEquals(response.getStatusCode(), 200);
		
		
	}
	@Test
	public void getAlbumTracksAPI_ReturnSuccess() {
		
		given()
		
			.accept("application/json")
			.contentType("application/json")
			.header("Authorization",token)
			.get("https://api.spotify.com/v1/albums/45ZIondgVoMB84MQQaUo9T/tracks?market=ES&limit=10&offset=5")
			.then().log().all().statusCode(200);
			
	}
	
	@Test
	public void getAlbumTracks_totalTracks() {
	Response response = given().contentType("application/json")
		.accept("application/json")
		.header("Authorization", token)
		.get("https://api.spotify.com/v1/albums/45ZIondgVoMB84MQQaUo9T/tracks?market=ES&limit=10&offset=5");
		response.prettyPrint();
		int tracks = response.path("total");
		System.out.println("Total_Tracks: " + tracks);
	//	System.out.println("Response : " + response);
	
		response.then().assertThat().statusCode(200);
		
	//	Assert.assertEquals(response.getStatusCode(), 200);
		
		
	}
	
	@Test
	public void get_Servel_Album() {
		
		given()
		
		.accept("application/json")
		.contentType("application/json")
		.header("Authorization",token)
		.get("https://api.spotify.com/v1/albums?ids=45ZIondgVoMB84MQQaUo9T&market=ES")
		.then().log().all().statusCode(200);
		
	}

}
