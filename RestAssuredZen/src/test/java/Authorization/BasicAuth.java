package Authorization;

//import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;

public class BasicAuth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				RestAssured.baseURI="https://jsonplaceholder.typicode.com";
				
				System.out.println("API Testing started");
				System.out.println("API Testing  is started 2nd tester changes");
				System.out.println("API Testing started 3 tester changes 12323456767");
				
				
				
//				given().header("Authorization","Basic cG9zdG1hbjpwYXNzd29yZA==").
//				when().log().all().get("https://postman-echo.com/basic-auth").
//				then().log().all().assertThat().statusCode(200).
//				body("authenticated", is(true));
				
				
				
			//--------------------------------------------------------------
				
				given().auth().basic("postman","password").
				when().log().all().get("https://postman-echo.com/basic-auth").
				then().log().all().assertThat().statusCode(200).
				body("authenticated", is(true));
				
				
				
				
				
				
				
				
				
				
				
				System.out.println("Thank you");


	}

}
