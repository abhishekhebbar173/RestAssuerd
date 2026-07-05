package Basics;

//import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.apache.http.HttpStatus;

import io.restassured.RestAssured;

public class ThenValidations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				RestAssured.baseURI="https://jsonplaceholder.typicode.com";
				
//				System.out.println("API Testing started");
//		//Assertion Sucess		
//				given().
//				when().log().all().get("/posts/1").
//				then().log().all().assertThat().statusCode(200);
//				
//			//--------------------------------------------------------------
//				
//		//Assertion Failure
//				
//				given().
//				when().log().all().get("/posts/1").
//				then().log().all().assertThat().statusCode(200);
				
				//---------------------------------------------------------------------------

//				given().
//				when().log().all().get("/posts/1").
//				then().log().all().assertThat().statusCode(HttpStatus.SC_OK);
				//-------------------------------------------------------------------------------------
//				given().
//				when().log().all().get("/posts/1").
//				then().log().all().assertThat().statusCode(HttpStatus.SC_OK).and().contentType("application/json");
//				
			//----------------------------------------------------------------------------------------
			//validate id	
//				given().
//				when().log().all().get("/posts/12").
//				then().log().all().assertThat().statusCode(200).body("id",is(12));
				
				//------------------------------------------------------------------------------
				
				// validate user id
				
//				given().
//				when().log().all().get("/posts/12").
//				then().log().all().assertThat().statusCode(200).body("userId",is(2));
				
				//------------------------------------------------------------------------------
				//validate title
				
//				given().
//				when().log().all().get("/posts/12").
//				then().log().all().assertThat().statusCode(200).body("title",is("in quibusdam tempore odit est dolorem"));
//				
				//------------------------------------------------------------------------------------
				// validate querry param
				
//				given().
//				when().log().all().get("/posts?id=12").
//				then().log().all().assertThat().statusCode(200).body("[0].id",is(12));
//				//or
//				
//
//				given().
//				when().log().all().get("/posts?id=12").
//				then().log().all().assertThat().statusCode(200).and().body("[0].id",hasItem(12));
	//-----------------------------------------------------------------------------------------------
	//query param
    //1.for post id 23:validate user id is 3 and id is 23;	
//				
//				given().
//				when().log().all().get("/posts?id=23").
//				then().log().all().assertThat().statusCode(200).and().body("id",hasItem(23)).and().body("userId",hasItems(3));				
//	
	//--------------------------------------------------------------------------------------------
	// check for record count
//				given().param("id",2).
//				when().get("/posts").then().log().all().
//				assertThat().statusCode(200).and().body("id",hasSize(1)).
//				assertThat().statusCode(200).and().body("size()",is(1));
		//-------------------------------------------------------------------------------		
				
		//fetch all posts for userId 1 quesry param) and validate userId 1, id,1,2,9,10 and recored count 10		
//				given().param("userId",1).
//				when().get("/posts").then().log().all().
//				assertThat().statusCode(200).
//				and().body("id",hasItems(1,2,9,10)).and().body(".",hasSize(10));
//				
		//fetch all the posts and validate the record count ,few ids and few userIds
				when().get("/posts").then().log().all().
				assertThat().statusCode(200).
				and().body("id",hasItems(1,2,9,10)).and().body("id",hasItems(1,52,99,100)).
				and().body("userId",hasItems(1,2,9,10)).and().body("title",hasItems(""));
				
				
				
				
				
				
				
				
				
				
				System.out.println("Thank you");


	}

}
