package com.spotify;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;


public class Spotify_Browser {

	String token = "Bearer BQCxdR175Lz1YS6orZ2xl6CW4jDJS4deRV6xWZfiG6yCpoK12CMueO6Sy4nbWdPuqN1kF2smQd1ZtzGdCzrOWAmIwqz-JEWBqyUh804L4_u-WPYtfGUN2Eltzg5Ggy4zui2hrJ090JRRUxIxC6Ln61BcvkZLid2TcWiuKAu8v0nbwCuJ_Vs35EGPEcK6V5dwqwduvLLU02XRW5s5EWIwK2OXWQnF7QTsrtWiTo5k_wADfFWnmaZFnhxr6_zar0kfo5_qrX1zp9bsevGF0j7RePKaLoFwAThTI8Yn-3-M33hGrvMwJ-cj";
	
	@Test
	public void getNewReleasesAPIExecution_ReturnSuccess() {
		given().accept("application/json")
		.contentType("application/json")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/browse/new-releases")
		.then().log().all().statusCode(200);
		
	}
	
	@Test
	public void getFeaturedPlaylistsAPIExecution_ReturnSuccess() {
		given().accept("application/json")
		.contentType("application/json")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/browse/featured-playlists")
		.then().log().all().statusCode(200);
		
	}
	
	@Test
	public void getSingleBrowseCategoryAPIExecution_ReturnSuccess() {
		Response response = given().accept("application/json")
							.contentType("application/json")
							.header("Authorization", token)
							.pathParam("category_id", "dinner")
							.when()
							.get("https://api.spotify.com/v1/browse/categories/{category_id}");
							response.prettyPrint();
							response.then().assertThat().statusCode(200);
		
	}
	
	@Test
	public void getSingleBrowseCategoryAPIExecution_Name() {
	Response response = given().contentType("application/json")
		.accept("application/json")
		.header("Authorization", token)
		.pathParam("category_id", "dinner")
        .get("https://api.spotify.com/v1/browse/categories/{category_id}");
		response.prettyPrint();
		String getSingleBrowseCategory = response.path("name");
		System.out.println("getSingleBrowseCategory: " + getSingleBrowseCategory);

		response.then().assertThat().statusCode(200);
		
	}
	
	@Test
	public void getSeveralBrowseCategoriesAPIExecution_ReturnSuccess() {
		
		Response response = given().accept("application/json")
				.contentType("application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/browse/categories");
				response.prettyPrint();
				response.then().assertThat().statusCode(200);

		
	}
}
