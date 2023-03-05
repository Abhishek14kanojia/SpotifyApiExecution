package com.spotify;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Spotify_Playlist {

	String token = "Bearer BQDAzbMMsTsdlvD6qU8xmJpjaQ5o_y17kNFKMBjn90WaNnMqv0z0rIgnJPlMCXNttpAS-wze0sSJI1is-XFdRtSiEUu9aaasVGwtsW-pJUD69mURJtKuKFH0KCuMlAoR20L9Hu2S3GPOu0LBkQSGGmalOzFH5SDl5TIF1cRpm42pgqae0j2P9pIBKRf3MPtZ_eMc2vuDFT1ZAS5Ll7lP2RkW7j1zbm4Hz7QakukUDFg_N8U";
	@Test
	public void getCurrentUserPlaylistsAPIExecution_ReturnSuccess() {
		
	Response getApiResponse = given().contentType("applicaion/json")
			                    .accept("application/json")
			                    .header("Authorization", token)
			                    .when()
			                    .get("https://api.spotify.com/v1/me/playlists?limit=2&offset=5");
			            		getApiResponse.prettyPrint();
			            		getApiResponse.then().assertThat().statusCode(200);
			            		
			            		
	}
	@Test
	public void getCurrentUserPlaylistsAPIExecution_DisplayName() {
	Response response = given().contentType("application/json")
		.accept("application/json")
		.header("Authorization", token)
        .pathParam("playlist_id", "7qjMLGCjrR3Rtm6Q0TT6wM")
        .get("https://api.spotify.com/v1/playlists/{playlist_id}?limit=2&offset=2");
		response.prettyPrint();
		String playlistArtist = response.path("name");
		System.out.println("playlistArtistname: " + playlistArtist);

		response.then().assertThat().statusCode(200);
		
	}
	@Test
	public void getPlaylistAPIExecution_ReturnSuccess() {
Response getPlaylistResponse = given().contentType("applicaion/json")
        .accept("application/json")
        .header("Authorization", token)
        .pathParam("playlist_id", "7qjMLGCjrR3Rtm6Q0TT6wM")
        .when()
        .get("	https://api.spotify.com/v1/playlists/{playlist_id}");
        getPlaylistResponse.prettyPrint();
		getPlaylistResponse.then().assertThat().statusCode(200);
		
	}
	
	@Test
	public void getPlaylistAPIExecution_Discription() {
	Response response = given().contentType("application/json")
		.accept("application/json")
		.header("Authorization", token)
        .pathParam("playlist_id", "7qjMLGCjrR3Rtm6Q0TT6wM")
        .get("https://api.spotify.com/v1/playlists/{playlist_id}?market=ES&additional_types=track");
		response.prettyPrint();
		String descriptions = response.path("description");
		System.out.println("description: " + descriptions);

		response.then().assertThat().statusCode(200);
		
	}
	
	@Test
	public void getPlaylistItemAPIExecution_ReturnSuccess() {
	Response getPlaylistItemResponse = given().contentType("applicaion/json")
        .accept("application/json")
        .header("Authorization", token)
        .pathParam("playlist_id", "7qjMLGCjrR3Rtm6Q0TT6wM")
        .when()
        .get("	https://api.spotify.com/v1/playlists/{playlist_id}/tracks/?offset=3&limit=2&market=ES&locale=en-IN,en-GB;q=0.9,en-US;q=0.8,en;q=0.7&additional_types=track");
        getPlaylistItemResponse.prettyPrint();
		getPlaylistItemResponse.then().assertThat().statusCode(200);		
	}
	@Test
	public void getPlaylistItemAPIExecution_Uri() {
	Response response = given().contentType("application/json")
		.accept("application/json")
		.header("Authorization", token)
        .pathParam("playlist_id", "7qjMLGCjrR3Rtm6Q0TT6wM")
        .get("https://api.spotify.com/v1/playlists/{playlist_id}?market=ES&additional_types=track");
		response.prettyPrint();
		String userURI = response.path("uri");
		System.out.println("User URI : " + userURI);

		response.then().assertThat().statusCode(200);
		
	}
	
	@Test
	public void createPlaylistAPIExecution_ReturnOKstatus() {
		
	Response response =	given().contentType("application/json")
        .accept("application/json")
        .header("Authorization", token)
        .body("{\r\n"
        		+ "  \"name\": \"Sketch2023\",\r\n"
        		+ "  \"description\": \"New playlist description\",\r\n"
        		+ "  \"public\": true\r\n"
        		+ "}")
        .pathParam("user_id", "rrk02cty2jfj2mh2kwwmgwll9")
        .when()
        .post("https://api.spotify.com/v1/users/{user_id}/playlists");
		response.then().assertThat().statusCode(201);
        
	}
	
	@Test
	public void addItemstoPlaylistAPIExecution_ReturnOkStatus() {
		Response addItemresponse =	given().contentType("application/json")
		        .accept("application/json")
		        .header("Authorization", token)
		        .pathParam("playlist_id", "5t1gIbi7rx7J3zERTTJW57")
		        .queryParam("uris", "spotify:track:3JkVYvxNoGf2HCWJo61462")
		        .when()
		        .post("https://api.spotify.com/v1/playlists/{playlist_id}/tracks");
		        addItemresponse.prettyPrint();
				addItemresponse.then().assertThat().statusCode(201);
		        
	}
	
	@Test
	public void updatePlaylistItemAPIExecution_ReturnSuccess() {
		Response updateItemresponse =	given()
				.contentType("application/json")
				.accept("application/json")
				.header("Authorization", token)
				.pathParam("playlist_id", "5t1gIbi7rx7J3zERTTJW57")
				.queryParam("uris", "spotify:track:3JkVYvxNoGf2HCWJo61462")
				.body("{\r\n"
						+ "  \"range_start\": 1,\r\n"
						+ "  \"insert_before\": 3,\r\n"
						+ "  \"range_length\": 2\r\n"
						+ "}")
				.when()
				.put("https://api.spotify.com/v1/playlists/{playlist_id}/tracks");
				updateItemresponse.prettyPrint();
				updateItemresponse.then().assertThat().statusCode(201);
        
				
	}
	
	@Test
	public void removePlaylistItemAPIExecution_ReturnSuccess() {
		Response removeItemresponse =	given()
		.contentType("application/json")
		.accept("application/json")
		.header("Authorization", token)
		.pathParam("playlist_id", "5t1gIbi7rx7J3zERTTJW57")
		.body("{ \"tracks\": [{ \"uri\": \"spotify:track:7B4uYqxTpTOS1sgxFB9Ann\" },"
				+ "{ \"uri\": \"spotify:track:60YICjIPdL7LDBcCMK0tAk\" }] }")
		.when()
		.delete("https://api.spotify.com/v1/playlists/{playlist_id}/tracks");
		removeItemresponse.prettyPrint();
		removeItemresponse.then().assertThat().statusCode(200);
		
		
	}
	
}
