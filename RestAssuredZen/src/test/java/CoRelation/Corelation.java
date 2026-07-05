package CoRelation;

//import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Corelation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				RestAssured.baseURI="https://jsonplaceholder.typicode.com";
				
				System.out.println("API Testing started");
				
				
			Response res=when().get("/posts/100").then().log().all().statusCode(200).extract().response();
			      JsonPath jsonObj= res.jsonPath();
			      
			      int id=jsonObj.getInt("id");
			      int userId=jsonObj.getInt("userId");
			      String title=jsonObj.getString("title");
			      
			 System.out.println("id UserId and title extracted using json path:"+id+" "+userId+" "+title);
				
				
			//--------------------------------------------------------------
				
				
				
				
				
				System.out.println("Thank you");


	}

}
