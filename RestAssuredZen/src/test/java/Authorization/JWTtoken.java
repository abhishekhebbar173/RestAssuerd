package Authorization;

//import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;

public class JWTtoken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				RestAssured.baseURI="https://jsonplaceholder.typicode.com";
				

				System.out.println("API Testing started");
				System.out.println("API Testing newly added started");

				System.out.println("API Testing Added in main branch started");
		       System.out.println("new added in main branch Edited in local branch");
		       
		       System.out.println("Added in local branch");				
				
				String reqBody= "{\"username\":\"anand\",\"password\":\"anand\"};";
			
			     String bearerToken=given().
			    		 header("Content-Type","application/json").body(reqBody).
			    		 when().log().all().
			    		 post("http://localhost:8000/user/authenticate").
			    		 then().log().all().
			    		 assertThat().statusCode(401).
			    		 extract().response().asString();
			    		 
				
				bearerToken="Bearer "+bearerToken;
				System.out.println(bearerToken);
				//-----------------------------------------------------
				
				given().
				header("Authorization", bearerToken).
				when().log().all().
				get("http://localhost:9000/products").
				then().log().all().
				assertThat().statusCode(200).
				body("[0].id",is(1)).
				body("[0].name",is("Laptop"));
				
				
				
				
				
				System.out.println("Thank you");


	}

}
