package com.test.restapi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestApi
{
	@Test
	public void test1()
	{
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		
		RequestSpecification reqSpec = RestAssured.given();
		
		Response response = reqSpec.request(Method.GET, "/Hyderabad");
		System.out.println(response.asString());
	}
}
