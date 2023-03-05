package com.json_Server;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Json_ServerAPI_Profile {

	@Test
	public void profile_JsonServerAPI_Execution_getReturn_Success() {

		given()
				.get("http://localhost:3000/comments")
				.then().log().all();
	}
}
