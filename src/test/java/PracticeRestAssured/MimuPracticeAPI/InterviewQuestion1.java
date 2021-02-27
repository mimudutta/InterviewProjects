package PracticeRestAssured.MimuPracticeAPI;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class InterviewQuestion1 {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in";
		given().log().all().body("{\n"
				+ "    \"name\": \"morpheus\",\n"
				+ "    \"job\": \"leader\"\n"
				+ "}").
		when().post("api/users").
		then().log().all().assertThat().statusCode(201);
		

	}

}
