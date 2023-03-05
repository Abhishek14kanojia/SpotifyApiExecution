package com.spotify;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class SpotifyPlayer {

String token = "Bearer BQBv-J-DXceIbn-1J8JeDiH1TvAGzvftzo0AFUNXKFndcj03xP-tj-MamVjD3Kjp1glWqIWCqvSULgnTZ4Q9Gw8_4GeOKYZWG1IIZ-2bEEVkOojJ23bCPJKVXutCUgcwpcnUdJ1Zj_x7QqL5_56IjkcmU1SLAiz0QIJWLoM2uh53-oOXMC_XeTFgJ2v8p-3VXIcmjVBmI2YoRLoVvcoqjqjVylsimGX4GHBNNWd7jbZO8iHu7R_bl0lI_sGjIwaL_frIYYdtHs3yC8BRLBXUr5M";
	
	@Test
	public void getAvailableDeviceAPI_ReturnSuccess() {
		
		given()
		
			.accept("application/json")
			.contentType("application/json")
			.header("Authorization",token)
			.get("https://api.spotify.com/v1/me/player/devices")
			.then().log().all().statusCode(200);
			
	}
	
	@Test
	public void getRecentPlayedTracksAPI_ReturnSuccess() {
		
		given()
		
			.accept("application/json")
			.contentType("application/json")
			.header("Authorization",token)
			.get("https://api.spotify.com/v1/me/player/recently-played?limit=2&after=1484811043508")
			.then().log().all().statusCode(200);
			
	}
	
	
	
}
