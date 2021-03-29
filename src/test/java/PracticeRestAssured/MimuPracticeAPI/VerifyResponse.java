package PracticeRestAssured.MimuPracticeAPI;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class VerifyResponse {
	
	@Test(enabled=true)
	public void testCase_03() {
		SoftAssert softAssert = new SoftAssert();
		RestAssured.baseURI="https://api.preprod.zeta.in/zeta.in";
		
		Response resp=given().log().all().
							queryParam("mobileNumber", "+84930000322").
							queryParam("isSecure", "true").
							header("content-type", "application/json").
							header("x-zeta-authtoken","bjYwQzV2QVZPdlYvYUwxL0hsbWJveGZlYWdOcm9oeC9pYkpFS2pzVTNqNGZ2dTdJOkFRSGhXbnUvL29YUkZqQ3hCVkk3akFSZmNNYlFlWW9QR0lpNkc3aE1QYmkycCt4aEdpQVZNYTlUbWlFSHAxM2tkUWR0UHFKeTJ1cjB4S1Q4eDJJb1I5NE1ReFJzU1FoTnpTUjVQVFI4SmNQdDdoSjIvVWVoaUY4enNDVmxwWXZEVzlUR2Y5dDZWMTliU3NLcnlvb0E2MkRrQnlxeTBxVT0=").
					   when().get("zetauser/1.0/getProfileByMobile");
		
		String response=resp.asString();
		JsonPath js= new JsonPath(response);
		
		softAssert.assertEquals(js.getString("userID"), "1117901");
		softAssert.assertEquals(js.getBoolean("kycDone"), false);
		softAssert.assertEquals(js.getString("userState"), "CREATED");
		softAssert.assertEquals(js.getString("name.firstName"), "BromosOT");
		softAssert.assertAll();
		
	}
	
	
	@Test(enabled=true)
	public void testCase_04() {
		SoftAssert softAssert = new SoftAssert();
		RestAssured.baseURI="https://api.preprod.zeta.in/zeta.in";
		
		Response resp=given().log().all().
							queryParam("mobileNumber", "+84930000322").
							queryParam("isSecure", "true").
							header("content-type", "application/json").
							header("x-zeta-authtoken","bjYwQzV2QVZPdlYvYUwxL0hsbWJveGZlYWdOcm9oeC9pYkpFS2pzVTNqNGZ2dTdJOkFRSGhXbnUvL29YUkZqQ3hCVkk3akFSZmNNYlFlWW9QR0lpNkc3aE1QYmkycCt4aEdpQVZNYTlUbWlFSHAxM2tkUWR0UHFKeTJ1cjB4S1Q4eDJJb1I5NE1ReFJzU1FoTnpTUjVQVFI4SmNQdDdoSjIvVWVoaUY4enNDVmxwWXZEVzlUR2Y5dDZWMTliU3NLcnlvb0E2MkRrQnlxeTBxVT0=").
					   when().get("zetauser/1.0/getProfileByMobile");
		
		String Name=resp.then().
							contentType(ContentType.JSON).
							extract().path("name.firstName");
		String email=resp.then().
							contentType(ContentType.JSON).
							extract().path("emailList[0].email");
		
		softAssert.assertEquals(Name,"BromosOT");
		softAssert.assertEquals(email,"ot2@mailinator.com");
		softAssert.assertAll();
	}
}
