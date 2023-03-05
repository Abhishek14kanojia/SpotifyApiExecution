package com.swagger;

import java.io.File;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UploadFilePetStore {

	@Test
	public void uploadFileIntoPetStoreSpotifyAlbum_ApiExecutionReturnOK() {
		File file = new File("C:\\Users\\Asus\\eclipse-workspace\\AutoMation\\src\\test\\java\\com\\spotify\\Spotify_Album.java");
		given().accept("application/json").contentType("multipart/form-data")
		.multiPart(file).when()
		.post("https://petstore.swagger.io/v2/pet/14/uploadImage")
		.then().log().ifStatusCodeIsEqualTo(200);
		
	}
	
	@Test
	public void uploadFileIntoPetStoreSpotifyArtist_ApiExecutionReturnOK() {
		File file = new File("C:\\Users\\Asus\\eclipse-workspace\\AutoMation\\src\\test\\java\\com\\spotify\\Spotify_Artist.java");
		given().accept("application/json").contentType("multipart/form-data")
		.multiPart(file).when()
		.post("https://petstore.swagger.io/v2/pet/14/uploadImage")
		.then().log().ifStatusCodeIsEqualTo(200);
		
	}
	
	@Test
	public void uploadFileIntoPetStoreSpotifyEpisode_ApiExecutionReturnOK() {
		File file = new File("C:\\Users\\Asus\\eclipse-workspace\\AutoMation\\src\\test\\java\\com\\spotify\\Spotify_Episode.java");
		given().accept("application/json").contentType("multipart/form-data")
		.multiPart(file).when()
		.post("https://petstore.swagger.io/v2/pet/14/uploadImage")
		.then().log().ifStatusCodeIsEqualTo(200);
		
	}
	@Test
	public void uploadFileIntoPetStoreSpotifyPlaylist_ApiExecutionReturnOK() {
		File file = new File("C:\\Users\\Asus\\eclipse-workspace\\AutoMation\\src\\test\\java\\com\\spotify\\Spotify_Playlist.java");
		given().accept("application/json").contentType("multipart/form-data")
		.multiPart(file).when()
		.post("https://petstore.swagger.io/v2/pet/14/uploadImage")
		.then().log().ifStatusCodeIsEqualTo(200);
		
	}
	@Test
	public void uploadFileIntoPetStoreSpotifyTracks_ApiExecutionReturnOK() {
		File file = new File("C:\\Users\\Asus\\eclipse-workspace\\AutoMation\\src\\test\\java\\com\\spotify\\Spotify_Tracks.java");
		given().accept("application/json").contentType("multipart/form-data")
		.multiPart(file).when()
		.post("https://petstore.swagger.io/v2/pet/14/uploadImage")
		.then().log().ifStatusCodeIsEqualTo(200);
		
	}
	@Test
	public void uploadFileIntoPetStoreSpotifyUserProfile_ApiExecutionReturnOK() {
		File file = new File("C:\\Users\\Asus\\eclipse-workspace\\AutoMation\\src\\test\\java\\com\\spotify\\Spotify_UserProfile.java");
		given().accept("application/json").contentType("multipart/form-data")
		.multiPart(file).when()
		.post("https://petstore.swagger.io/v2/pet/14/uploadImage")
		.then().log().ifStatusCodeIsEqualTo(200);
		
	}
	@Test
	public void uploadFileIntoPetStoreSpotifyFollow_ApiExecutionReturnOK() {
		File file = new File("C:\\Users\\Asus\\eclipse-workspace\\AutoMation\\src\\test\\java\\com\\spotify\\SpotifyFollow.java");
		given().accept("application/json").contentType("multipart/form-data")
		.multiPart(file).when()
		.post("https://petstore.swagger.io/v2/pet/14/uploadImage")
		.then().log().ifStatusCodeIsEqualTo(200);
		
	}
	@Test
	public void uploadFileIntoPetStoreSpotifyLibrary_ApiExecutionReturnOK() {
		File file = new File("C:\\Users\\Asus\\eclipse-workspace\\AutoMation\\src\\test\\java\\com\\spotify\\SpotifyLibrary.java");
		given().accept("application/json").contentType("multipart/form-data")
		.multiPart(file).when()
		.post("https://petstore.swagger.io/v2/pet/14/uploadImage")
		.then().log().ifStatusCodeIsEqualTo(200);
		
	}
	@Test
	public void uploadFileIntoPetStoreSpotifyMarket_ApiExecutionReturnOK() {
		File file = new File("C:\\Users\\Asus\\eclipse-workspace\\AutoMation\\src\\test\\java\\com\\spotify\\SpotifyMarket.java");
		given().accept("application/json").contentType("multipart/form-data")
		.multiPart(file).when()
		.post("https://petstore.swagger.io/v2/pet/14/uploadImage")
		.then().log().ifStatusCodeIsEqualTo(200);
		
	}
	@Test
	public void uploadFileIntoPetStoreSpotifyPlayer_ApiExecutionReturnOK() {
		File file = new File("C:\\Users\\Asus\\eclipse-workspace\\AutoMation\\src\\test\\java\\com\\spotify\\SpotifyPlayer.java");
		given().accept("application/json").contentType("multipart/form-data")
		.multiPart(file).when()
		.post("https://petstore.swagger.io/v2/pet/14/uploadImage")
		.then().log().ifStatusCodeIsEqualTo(200);
		
	}
	@Test
	public void uploadFileIntoPetStoreSpotifySearch_ApiExecutionReturnOK() {
		File file = new File("C:\\Users\\Asus\\eclipse-workspace\\AutoMation\\src\\test\\java\\com\\spotify\\SpotifySearch.java");
		given().accept("application/json").contentType("multipart/form-data")
		.multiPart(file).when()
		.post("https://petstore.swagger.io/v2/pet/14/uploadImage")
		.then().log().ifStatusCodeIsEqualTo(200);
		
	}
	
}
