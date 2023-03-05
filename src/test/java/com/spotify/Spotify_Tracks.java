package com.spotify;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Spotify_Tracks {

String token = "Bearer BQDWnYwUohiYonbh_ktpr0pyqu8rrHVtc4W5fE13eTiqECpD1qVuEA2BMdowCWSMlBml8X6xDcFRkXC4YxeQOBQH38sh94lClqZ89ch4sTu8QSFE_3k8_h2wPczq6pb9d3Tcl-8ce0HP3WIBX9Gs_jz43aA3mP40hMvoT2UvxPWv3Cs25CedUt7ZE_XCa15kuGCOnJVUQ4piDefqtXoFKnwoap47rhe8P8hOR6alt6hMPJ0LRW7H01Zm4OM58vCN-acvTIRi_XFXHRNaoHPx";
	
	@Test
	public void getTrackAPIExecution_ReturnSuccess() {
		Response response = given().accept("application/json")
		.contentType("application/json")
		.pathParam("id", "3JkVYvxNoGf2HCWJo61462")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/tracks/{id}");
		response.prettyPrint();
		response.then().assertThat().statusCode(200);
	}
	@Test
	public void getTrackAPIExecution_Name() {
	Response response = given().contentType("application/json")
		.accept("application/json")
		.header("Authorization", token)
		.pathParam("id", "3JkVYvxNoGf2HCWJo61462")
        .get("https://api.spotify.com/v1/tracks/{id}");
		response.prettyPrint();
		String trackName = response.path("name");
		System.out.println("TrackName: " + trackName);

		response.then().assertThat().statusCode(200);
		
	}
	
	@Test
	public void getTrackAudioAnalysisAPIExecution_ReturnSuccess() {
		Response response = given().accept("application/json")
		.contentType("application/json")
		.pathParam("id", "3JkVYvxNoGf2HCWJo61462")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/audio-analysis/{id}");
		response.prettyPrint();
		response.then().assertThat().statusCode(200);
	}
	
	@Test
	public void getTrackAudioFeaturesAPIExecution_ReturnSuccess() {
		Response response = given().accept("application/json")
		.contentType("application/json")
		.pathParam("id", "3JkVYvxNoGf2HCWJo61462")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/audio-features/{id}");
		response.prettyPrint();
		response.then().assertThat().statusCode(200);
	}
}
