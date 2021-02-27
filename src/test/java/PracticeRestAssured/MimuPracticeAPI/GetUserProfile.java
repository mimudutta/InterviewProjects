package PracticeRestAssured.MimuPracticeAPI;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class GetUserProfile {
	
	public static void main(String args[]) {
		
		RestAssured.baseURI="https://api.preprod.zeta.in/zeta.in";
		
		given().log().all().
			queryParam("email", "mimumerchant@mailinator.com").
			//header("Postman-Token","47e1fedd-908f-432c-ab34-2b87848cc969").
			header("cache-control", "no-cache").header("content-type", "application/json").
			header("x-zeta-authtoken","bjYwQzV2QVZPdlYvYUwxL0hsbWJveGZlYWdOcm9oeC9pYkpFS2pzVTNqNGZ2dTdJOkFRSGhXbnUvL29YUkZqQ3hCVkk3akFSZmNNYlFlWW9QR0lpNkc3aE1QYmkycCt4aEdpQVZNYTlUbWlFSHAxM2tkUWR0UHFKeTJ1cjB4S1Q4eDJJb1I5NE1ReFJzU1FoTnpTUjVQVFI4SmNQdDdoSjIvVWVoaUY4enNDVmxwWXZEVzlUR2Y5dDZWMTliU3NLcnlvb0E2MkRrQnlxeTBxVT0=").
		when().get("zetauser/1.0/getProfileByEmail").
		then().log().all().assertThat().statusCode(200);
	}
}
