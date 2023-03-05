package com.spotify;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;


public class Spotify_UserProfile {

	String token = "Bearer BQAZY0ll-iaGvNPRsWDDDSQ6UzmqI_LaVR2m5iIN8aQMLmiucVBDbQtkPGGMImZOQkJM09O6SwZ-XNbpHb8ICiRgheSdTlytF6smmjP0AMe0zhZcDGVKx51D6M6M2I-i88NV3xHGDjar-Dsm0NkwSgqVsh9lzXPjhyMWo2gHLGu3jW8H4IlKsLHQLjNmpQFmhGH6sccVmQpw_xtXwUaFqzvanHKmuy_gub28y0jWda_VyIGfJfOjYrN3oY1S";
	
	@Test
	public void getCurrentUserProfileApiExecution_ReturnSuccess() {
		
		given()
		
			.accept("application/json")
			.contentType("application/json")
			.header("Authorization",token)
			.get("https://api.spotify.com/v1/me")
			.then().log().all().statusCode(200);
			
			
	}
	
	@Test
	public void getCurrentUser_Id() {
	Response response = given().contentType("application/json")
		.accept("application/json")
		.header("Authorization", token)
		.get("https://api.spotify.com/v1/me");
		response.prettyPrint();
		String userId = response.path("id");
		System.out.println("userId: " + userId);
	//	System.out.println("Response : " + response);
	
		String displayName = response.path("display_name");
		System.out.println("Display name : " + displayName);
		
	//	response.then().assertThat().statusCode(200);
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	@Test
	public void getUserProfileAPI_ReturnSuccess() {
		
				given()
				.accept("application/json")
				.contentType("application/json")
				.header("Authorization",token)
				.get("https://api.spotify.com/v1/users/rrk02cty2jfj2mh2kwwmgwll9")
				.then().log().all().statusCode(200);		
	}
	
	@Test
	public void getUser_Id_And_DisplayName() {
	Response response = given().contentType("application/json")
		.accept("application/json")
		.header("Authorization", token)
		.get("https://api.spotify.com/v1/users/rrk02cty2jfj2mh2kwwmgwll9");
		response.prettyPrint();
		String userId = response.path("id");
		System.out.println("userId: " + userId);
	//	System.out.println("Response : " + response);
	
		String displayName = response.path("display_name");
		System.out.println("Display name : " + displayName);
		
	//	response.then().assertThat().statusCode(200);
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
		
	}
}
