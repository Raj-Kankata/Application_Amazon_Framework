package com.rk.scripts;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC03_GET_Request {

	
	@Test
	void getEmployeeDetails() {
		
		//Specify base URI
		RestAssured.baseURI="http://dummy.restapiexample.com";
		
		//Request object
		RequestSpecification httpRequest = RestAssured.given();
		
		//Response object
		Response response = httpRequest.request(Method.GET, "/api/v1/employees");
		
		//print response in console window
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is :" +responseBody);
		
		//status code validation
		int statusCode = response.getStatusCode();
		System.out.println("Status code is :" +statusCode);
		Assert.assertEquals(statusCode, 200);;
		
		//status line verification
		String statusLine = response.getStatusLine();
		System.out.println("Status line is : " +statusLine);
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		
		
	}
	
}














