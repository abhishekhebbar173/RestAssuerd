package Basics;

//import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;

public class BasicScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				RestAssured.baseURI="https://jsonplaceholder.typicode.com";
				
				System.out.println("API Testing started");
				
				given().
				when().log().all().get("/posts/1").
				then().log().all().assertThat().statusCode(200);
				
			//--------------------------------------------------------------
				
				
				
				
				
				System.out.println("Thank you");


	}

}
