package Basics;

//import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ValidateHeader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				RestAssured.baseURI="https://jsonplaceholder.typicode.com";
				
				System.out.println("API Testing started");
				
				
			  Response response=when().get("/posts/1");
			  
			  String headerContentType=response.header("Content-Type");
			  
			  assertEquals(headerContentType,"application/json; charset=utf-8");
			  
				System.out.println(response);//reference
				System.out.println(response.asString());//json object in string format
				System.out.println(response.body().asString());//json object in string format;
				
				
                    
				System.out.println("Thank you");


	}

}
