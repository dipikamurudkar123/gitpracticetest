package restassured;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class resttesting {

	
	String endpoint="http://localhost:3000/users";
	
	
	//@Test
	private void testget() {
		given().get(endpoint).then().log().all();

	}
	
	@Test
	private void testpost() {
		Map<String, String> map=new HashMap<String,String>();
		map.put("firstname", "Diptish");
		map.put("lastname", "Arekar");
		JSONObject js=new JSONObject();
		
		given().
	    body(js.toString()).
	 when().
	    post(endpoint).
	 then().
		log().all();

	}
	
	
}
