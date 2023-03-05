package com.spotify;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class SpotifySearch {

String token = "Bearer BQB5bYIOLErwvQk19ohRA5HTkvOadywCrUdkv4_MfQq4Vh7aaf1hShm98A-Zc2m6gDMJdIHOwhFbou9IcDQTalRQd2nzaxfCfek9qa2UohQmrackvva1cPGlKTH0WGQ0T2kLWWo_dQIoZK999aSARJi1qMG-B_8Fh35OXs1sVP5cd_WGUApLWc4VAGVsl2B5bKY8lLI1hxUVTABbbZM-jt5qLtgduIuEuvU-AxP2O28zdzlTZyxPzIg9_1K4pHCddzIK2zDNuw6gCNS_h7U1u505Y9CKhXvOEzBDhMwdtGbErG3NVN7a--mRoOeb";
	
	@Test
	public void searchForItemAPI_ReturnSuccess() {
		
		given()
		
			.accept("application/json")
			.contentType("application/json")
			.header("Authorization",token)
			.queryParam("q", "remaster%20track:Doxy%20artist:Miles%20Davis")
			.get("https://api.spotify.com/v1/search?q=%22remaster%2520track%3ADoxy%2520artist%3AMiles%2520Davis%22&type=artist&market=ES&limit=2&offset=3&include_external=audio")
			.then().log().all().statusCode(200);
			
	}
	
	
}
