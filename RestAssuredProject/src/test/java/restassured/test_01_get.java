package restassured;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class test_01_get {
	
	@Test
	void test01() {
		SoftAssert softAssert = new SoftAssert();
		Response res=get("https://reqres.in/api/users?page=2");
		//Response res=RestAssured.get("https://rest.avatax.com/api/v2/transactions/create");
		System.out.println(res.statusCode());
		System.out.println(res.asString());
		System.out.println(res.getBody().asString());
		System.out.println(res.getHeader("content-type"));
		softAssert.assertEquals(res.statusCode(), 200);
		softAssert.assertAll();
	}
	
	@Test
	void test02() {
	
		String endpoint="https://reqres.in/api/users?page=2";
		given().get(endpoint).then().statusCode(200).body("data.id[0]",equalTo(7));
		
	}

}
