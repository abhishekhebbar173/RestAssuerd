package Basics;

//import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ResponseValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				RestAssured.baseURI="https://jsonplaceholder.typicode.com";
				
				System.out.println("API Testing started");
				
				
			  Response response=when().get("/posts/12");
			   String responseBody=response.body().asString();
			   
			   
			   String expectedStr="ea odit";
			   
			   assertTrue(responseBody.contains(expectedStr));
			  
			   System.out.println(responseBody);
			   
			   //-----------------------------------------------------------------------
			   //validate that the id is 12
			   String expectedId="\"id\": 12";
			   assertTrue(responseBody.contains(expectedId));
			   
			   //---------------------------------------------------------------------------
			   //json value check
			   JsonPath jsonObj=response.jsonPath();//parsing
			  int id= jsonObj.getInt("id");
			  assertEquals(id,12);
			  
			  
			  String title=jsonObj.getString("title");
			  
			  assertEquals(title,"in quibusdam tempore odit est dolorem");
			  
			  
			  
			   
			   
			   
			   
			   
			   
			  
			  
			  
			 
				
                    
				System.out.println("Thank you");


	}

}
