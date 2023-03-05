package com.json_Server;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Json_ServerAPI_Comment {

	@Test
	public void getComment_JsonServer() {

	Response getResult = given().contentType("application/json")
				.accept("application/json")
				.when()
				.get("http://localhost:3000/comments");
			getResult.prettyPrint();
			getResult.then().assertThat().statusCode(200);
		
	}
	
	@Test
	public void postComment_JsonServer() {
		given().contentType("application/json")
		.accept("application/json")
		.body("{\n" +
				  "  \"id\": 9,\n" +
				  "  \"name\": \"Abhii\",\n" +
				  "  \"city\": \"Delhi\",\n" +
				  "  \"postId\": 10 \n" +
				  "	}")
		.when()
		.post("http://localhost:3000/comments");
	}
	
	
	@Test
	public void putComment_JsonServer() {
		given().contentType("application/json")
		.accept("application/json")
		.body("{\n" +
				  "  \"id\": 9,\n" +
				  "  \"name\": \"Abhiishek\",\n" +
				  "  \"city\": \"Delhi\",\n" +
				  "  \"postId\": 15 \n" +
				  "	}")
		.when()
		.put("http://localhost:3000/comments/9");
		
	}
	
	@Test
	public void patchComment_JsonServer() {
		given().contentType("application/json")
		.accept("application/json")
		.body("{\n" +
				  "  \"id\": 8,\n" +
				  "  \"name\": \"Abhishek\",\n" +
				  "  \"city\": \"Noida\",\n" +
				  "  \"postId\": 10 \n" +
				  "	}")
		
		.when()
		.patch("http://localhost:3000/comments/8");
		
	}
	
	@Test
	public void deleteComment_JsonServer() {
		given().contentType("application/json")
		.accept("application/json")
		.body("{\n" +
				  "  \"id\": 9,\n" +
				  "  \"name\": \"Abhiishek\",\n" +
				  "  \"city\": \"Delhi\",\n" +
				  "  \"postId\": 15 \n" +
				  "	}")
		.when()
		.delete("http://localhost:3000/comments/9");
		
	}
}
