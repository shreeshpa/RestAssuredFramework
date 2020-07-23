import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;
//import static io.restassured.matcher.RestAssuredMatchers.*;


public class Tests_POST {

	@Test
	public void test02_post() {

//		Map<String, Object> map= new HashMap<String, Object>();
//		map.put("name", "shreesh");
//		map.put("job", "Software tester");
//
//		System.out.println(map);

		JSONObject request=new JSONObject();
		
        request.put("name", "shreesh1");
        request.put("job", "Software tester");
        
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().
		   header("Content-Type","application/json").
		   body(request.toJSONString()). 
		when(). 
		    post("https://reqres.in/api/users"). 
		then(). 
		    statusCode(201).log().all();
	}

}
