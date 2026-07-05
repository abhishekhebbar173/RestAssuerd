package Basics;

//import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;

public class ModifyPostPut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				RestAssured.baseURI="https://jsonplaceholder.typicode.com";
				
				System.out.println("API Testing started");
				
				String reqBody= "{\r\n"
						+ "    \"id\": \"20\",\r\n"
						+ "    \"title\": \"foo\",\r\n"
						+ "    \"body\": \"bar\",\r\n"
						+ "    \"userId\": 1\r\n"
						+ "    \r\n"
						+ "}";
				
				given().
				header("Content-Type","application/json; charset=utf-8").
				body(reqBody).
				when().log().all().
				put("/posts/20").
				then().log().all().assertThat().statusCode(200).
				body("id",is(20)).and().body("title",is("foo")).and().body("userId",is(1));
				
				
				
			//--------------------------------------------------------------
				
				
				
				
				
				System.out.println("Thank you");


	}

}
