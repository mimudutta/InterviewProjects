package PracticeRestAssured.MimuPracticeAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;

public class OTPLimit {
	
	@Test(enabled=false)
	public void testCase_01_ResetOTPLimit() {
		RestAssured.baseURI="https://api.preprod.zeta.in/zeta.in";
		
		given().log().all().
			header("content-type", "application/json").
			header("x-zeta-authtoken","bjYwQzV2QVZPdlYvYUwxL0hsbWJveGZlYWdOcm9oeC9pYkpFS2pzVTNqNGZ2dTdJOkFRSGhXbnUvL29YUkZqQ3hCVkk3akFSZmNNYlFlWW9QR0lpNkc3aE1QYmkycCt4aEdpQVZNYTlUbWlFSHAxM2tkUWR0UHFKeTJ1cjB4S1Q4eDJJb1I5NE1ReFJzU1FoTnpTUjVQVFI4SmNQdDdoSjIvVWVoaUY4enNDVmxwWXZEVzlUR2Y5dDZWMTliU3NLcnlvb0E2MkRrQnlxeTBxVT0=").
			body("{\n" + 
					"  \"type\": \"loginOtp\",\n" + 
					"  \"entity\": \"+84930000322\"\n" + 
					"}").
		when().post("anonuser/1.0/clearRateLimits").
		then().log().all().assertThat().statusCode(200);
	}
	
	
	@Test(dependsOnMethods= {"testCase_01_ResetOTPLimit"})
	public void testCase_02_getProfileByMobile() {
		RestAssured.baseURI="https://api.preprod.zeta.in/zeta.in";
		
		Response resp=given().log().all().
							queryParam("mobileNumber", "+84930000322").
							queryParam("isSecure", "true").
							header("content-type", "application/json").
							header("x-zeta-authtoken","bjYwQzV2QVZPdlYvYUwxL0hsbWJveGZlYWdOcm9oeC9pYkpFS2pzVTNqNGZ2dTdJOkFRSGhXbnUvL29YUkZqQ3hCVkk3akFSZmNNYlFlWW9QR0lpNkc3aE1QYmkycCt4aEdpQVZNYTlUbWlFSHAxM2tkUWR0UHFKeTJ1cjB4S1Q4eDJJb1I5NE1ReFJzU1FoTnpTUjVQVFI4SmNQdDdoSjIvVWVoaUY4enNDVmxwWXZEVzlUR2Y5dDZWMTliU3NLcnlvb0E2MkRrQnlxeTBxVT0=").
					   when().get("zetauser/1.0/getProfileByMobile");
		
		System.out.println("Response status code: "+resp.getStatusCode());
		Assert.assertEquals(resp.getStatusCode(), 200);
		
		String respBody=resp.getBody().asString();      //storing response body as String
		ResponseBody respBody1=resp.getBody();		//storing response body as ResponseBody
		String respBodyString=respBody1.asString();
		Assert.assertEquals(respBody.contains("abcd"), "abcd");
		Assert.assertEquals(respBodyString.contains("abcd"), "abcd");
		
		
		System.out.println("Response Server: "+resp.getHeader("Server"));
		Assert.assertEquals(resp.getHeader("Server"), "proteus");
		
		
	}
}
