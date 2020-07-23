import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Tests_Put {
	
	@Test
	public void test02_put() {

		JSONObject request=new JSONObject();
		
        request.put("name", "shreesh");
        request.put("job", "Software tester");
        
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().
		   header("Content-Type","application/json").
		   body(request.toJSONString()). 
		when(). 
		    put("https://reqres.in/api/users/2"). 
		then(). 
		    statusCode(200).log().all();
	}

}



