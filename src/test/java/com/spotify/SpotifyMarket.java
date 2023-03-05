package com.spotify;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class SpotifyMarket {

String token = "Bearer BQDkgd_FIeVxckExCAVt2FkahSg2nUj4OU5i6e4_uI0TmgZxeLwnnRQHIfEoRG02ZfKOnT2XfrfT5M3dXFsKvVMOZH1b6hGGaSD8LhRnPFtKr_srXBt_njP49UPEI09awxJuGCsg8gNe7ORMxvxi0SbVvqF6vEmpvw7yWvAlCLfRBl5-Xw-jdwB4q-uJ5hjPzo6YTp6Yb6sQGNBv2lreu6TCNK3DIGwkZSTw4gw_FgC2Qq867zxA5RWPVQ2iUJzDt0wrvDpkVXeI88fnd0C174CNE_DjFdfWZAvmjtc";
	
	@Test
	public void getAvailableMarketAPI_ReturnSuccess() {
		
		given()
		
			.accept("application/json")
			.contentType("application/json")
			.header("Authorization",token)
			.get("https://api.spotify.com/v1/markets")
			.then().log().all().statusCode(200);
			
	}
	
}
