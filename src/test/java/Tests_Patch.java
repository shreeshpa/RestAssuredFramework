import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import java.net.http.HttpResponse.BodyHandler;

public class Tests_Patch {

	@Test

	public void test_put() {

		JSONObject request=new JSONObject();

		request.put("name", "shreesh");
		request.put("job", "Software tester");

		System.out.println(request);
		System.out.println(request.toJSONString());

		given().
		header("Content-Type","application/json").
		body(request.toJSONString()).

		when().
		patch("https://reqres.in/api/users/2"). 

		then(). 
		statusCode(200).log().all(); 





	}

}
