package com.json_Server;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
public class Json_ServerAPI_Post {

	
	
	@Test
	public void getPost_JsonServer() {
		
	  given().contentType("application/json")
							.accept("application/json")
							.when()
							.get("http://localhost:3000/posts")
	// getResult.prettyPrint();
	 //getResult.then().assertThat().statusCode(200);
							.then().log().ifStatusCodeIsEqualTo(200);
	 
	}
	
	@Test
	public void createPost_JsonServer() {
		given().contentType("application/json")
		.accept("application/json")
		.body("{\n" +
		  "  \"id\": 20,\n" +
		  "  \"firstName\": \"Abhi\",\n" +
		  "  \"lastName\": \"Kuamr\",\n" +
		  "  \"subjectId\": 150 \n" +
		  "	}")
		
		.when()
		.post("http://localhost:3000/posts");
		
		
	}
	
	@Test
	public void putPost_JsonServer() {
		given().contentType("application/json")
		.accept("application/json")
		.body("{\n" +
				  "  \"id\": 20,\n" +
				  "  \"firstName\": \"Abhii\",\n" +
				  "  \"lastName\": \"Kumar\",\n" +
				  "  \"subjectId\": 150 \n" +
				  "	}")
		.queryParam("id", "20")
		.when()
		.put("http://localhost:3000/posts");
		
	}
	
	@Test
	public void deletePost_JsonServer() {
		given().contentType("application/json")
		.accept("application/json")
		.body("{\n" +
				  "  \"id\": 25,\n" +
				  "  \"firstName\": \"Abcd\",\n" +
				  "  \"lastName\": \"Defg\",\n" +
				  "  \"subjectId\": 50 \n" +
				  "	}")
		.queryParam("id", "25")
		.when()
		.delete("http://localhost:3000/posts");
	}
}
