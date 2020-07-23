import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;


public class Tests_GET {
	
	@Test
	public void test_01() {
		
		given().
		  //header("Content-Type","application/json").
		  //param("access_token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOiI1ZGYxZWFjNmRmNWZiMjA0YzZmY2ExYWEiLCJhdXRoIjoiNWRmMjAxNmI5ZmY1YTY2NGYyOWUzNDRjIiwiaWF0IjoxNTc2MTQxMTYzfQ.v6mibvb-_eejzvxtTnH5oIKJ6sLCNm_wRSD995grHMk").
		  get("https://reqres.in/api/users?page=2").
		  then().
		  statusCode(200).
		 body("data.id[1]", equalTo(8)).
		 body("data.first_name", hasItems("Michael","Lindsay")).
		log().all();	
	}
	

}
