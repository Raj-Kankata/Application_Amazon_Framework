package com.rk.scripts;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC05_POST_Request {


	@Test
	public void test1() {
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");

		JSONObject json = new JSONObject();
		json.put("id", "25");
		json.put("title", "selenium webdriver");
		json.put("author", "Learn Automation");

		request.body(json.toJSONString());

		Response response = request.post("http://dummy.restapiexample.com/api/v1/create");

		int code = response.getStatusCode();
		Assert.assertEquals(code, 429);

	}

}
