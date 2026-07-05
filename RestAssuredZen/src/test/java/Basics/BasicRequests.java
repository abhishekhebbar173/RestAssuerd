package Basics;

//import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;

public class BasicRequests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
//				RestAssured.baseURI="https://jsonplaceholder.typicode.com";
//				
//				System.out.println("API Testing started");
//				
//				given().
//				when().log().all().get("/posts/1").
//				then().log().all().assertThat().statusCode(200);
//				
			//--------------------------------------------------------------
				//post with id 12
		
		
		
	given().
	when().log().all().get("/posts/12").
		then().log().all().assertThat().statusCode(200);
	
	
	//------------------------------------------------------------------------------
	//allposts
	given().
	when().log().all().get("/posts").
		then().log().all().assertThat().statusCode(200);
	
	
	//---------------------------------------------------------------------------
	
	//delete a post with id 12
	given().
	when().log().all().delete("/posts/12").
		then().log().all().assertThat().statusCode(200);
	
	//------------------------------------------------------------------------------
	//post with id 101
	
	given().
	when().log().all().get("/posts/101").
		then().log().all().assertThat().statusCode(404);
	
	//-----------------------------------------------------------------------------
	
	//delete a post id 101
	
	given().
	when().log().all().delete("/posts/101").
		then().log().all().assertThat().statusCode(200);
	//-------------------------------------------------------------------------------------
	
	//delete a post with id 1 but incorrect resource name
	
	
	given().
	when().log().all().delete("/post/12").
		then().log().all().assertThat().statusCode(404);	
				
				
				
				System.out.println("Thank you");


	}

}
