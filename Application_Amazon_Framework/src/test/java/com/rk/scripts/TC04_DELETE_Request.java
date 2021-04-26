package com.rk.scripts;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC04_DELETE_Request {


	@Test
	public void test1() {
		RequestSpecification request = RestAssured.given();
		
		Response response = request.delete("http://dummy.restapiexample.com/api/v1/delete/2");

		int code = response.getStatusCode();
		Assert.assertEquals(code, 200);

	}

}
