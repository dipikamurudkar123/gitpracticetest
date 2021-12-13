package restassured;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class TestPost {
	@Test
	public void test1() {
		String endpoint="https://reqres.in/api/users";
		given().
		   get(endpoint).then().log().all();
	}
	@Test
	public void test2() {
		 String endpoint="https://reqres.in/api/users";
		 
		 Map<String,String> parammap=new HashMap<String,String>();
		 parammap.put("name", "Ankita");
		 parammap.put("job", "Teacher");
		 
		 JSONObject json=new JSONObject(parammap);
		 
		 given().
		    header("content-type", "application/json").
		    body(json.toString()).
		 when().
		    post(endpoint).
		 then().
		    statusCode(201).log().all();
		 
		 
	}
	
	@Test
	public void testPut() {
		System.out.println("***************************");
		System.out.println("Put request");
		 String endpoint="https://reqres.in/api/users";
		 
		 Map<String,String> parammap=new HashMap<String,String>();
		 parammap.put("name", "Ankita");
		 parammap.put("job", "Teacher");
		 
		 JSONObject json=new JSONObject(parammap);
		 
		 given().
		    header("content-type", "application/json").
		    body(json.toString()).
		 when().
		    put(endpoint).
		 then().
		    statusCode(200).log().all();
		 
		 
	}
	
	

}
