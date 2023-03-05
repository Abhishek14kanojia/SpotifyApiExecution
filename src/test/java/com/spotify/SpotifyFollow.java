package com.spotify;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class SpotifyFollow {
	
String token = "Bearer BQDXWMoFvFYlFKLqQAvI3uhY-xdsHsH_T3zjsh-alYkiNljezrC-NZ_4WN2wKVWj-CM1o5MREVrgDB0HIUOc2353VXPNNltZrOS4HudJUWstml1WCiG-6eOhvSKDz5s0PxPMdAYmLicU9ftkr7d3EBvYa1NXtJ3xO6X6uc9iUW1N6nPyo2HtfQtikmIynq5DR0Mg94LmWPlIQL8K3Vx6b-tDWnjppKAKEkN90L00HMaOLlM98AebVDB7wYITSbBFFd67QG6DlFeJWptgjodpp_4mJyZeXZksow";
	
	@Test
	public void getFollowedArtistsAPIExecution_ReturnSuccess() {
		Response response = given().accept("application/json")
		.contentType("application/json")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/me/following?type=artist&after=4PULA4EFzYTrxYvOVlwpiQ&limit=2");
		response.prettyPrint();
		response.then().assertThat().statusCode(200);
	}
	
	@Test
	public void checkifUsersFollowPlaylistAPIExecution_ReturnSuccess() {
		Response response = given().accept("application/json")
		.contentType("application/json")
		.header("Authorization", token)
		.pathParam("playlist_id", "5t1gIbi7rx7J3zERTTJW57")
		.queryParam("ids", "rrk02cty2jfj2mh2kwwmgwll9")
		.when()
		.get("https://api.spotify.com/v1/playlists/{playlist_id}/followers/contains");
		response.prettyPrint();
		response.then().assertThat().statusCode(200);
	}
	
	
}
