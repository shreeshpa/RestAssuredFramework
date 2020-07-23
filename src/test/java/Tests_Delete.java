import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import static io.restassured.RestAssured.given;

public class Tests_Delete {
	
	@Test
	
	 public void test_delete() {
	
		  
		given(). 
		  delete("https://reqres.in/api/users?page=2"). 
		  
		 then(). 
		   statusCode(204).log().all();
		
		
		
	}

}
