package Basics;

//import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;

public class QuerryParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				RestAssured.baseURI="https://jsonplaceholder.typicode.com";
				
				System.out.println("API Testing started");
		
//				path param(/posts/1:path param)
//				given().
//				when().log().all().get("/posts/1").
//				then().log().all().assertThat().statusCode(200);
//				
			//--------------------------------------------------------------
				
//			//query param
//				given().
//				when().log().all().get("/posts?id=1").
//				then().log().all().assertThat().statusCode(200);
//		
//		//-------------------------------------------------------------------------
//				//query param
//				given().param("id",1).
//				when().log().all().get("/posts").
//				then().log().all().assertThat().statusCode(200);
//				
//	//------------------------------------------------------------------------
//				//invalid key
//				
//				given().param("check",1).log().all().
//				when().log().all().get("/posts").
//				then().log().all().assertThat().statusCode(200);// it should have failed security defect
		//--------------------------------------------------------------------------------------------
			//non existing id
				
//				given().param("id",102).log().all().
//				when().log().all().get("/posts").
//				then().log().all().assertThat().statusCode(200);
//				
	  //--------------------------------------------------------------------
				//invalid resource name
				
				given().param("id",12).log().all().
				when().log().all().get("/post").
				then().log().all().assertThat().statusCode(404);
						
						
				
				
						
				
				
				
				System.out.println("Thank you"); 


	}

}
