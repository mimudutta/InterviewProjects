package pojoClassConcept;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import PojoClassConcept.Deserialization.ListUser;	


public class TestPojoDeserialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://reqres.in/";
		
		ListUser ListUserResp =  given().header("Content-Type", "application/json").  //expect().defaultParser(Parser.JSON)-- In case Content-Type is not application/JSON
											header("Host", "reqres.in").
											header("Cookie", "__cfduid=dde1cbbcefa251c5bcdf1273306b9d48e1616737028").
											header("page", "2").
							when().get("api/users").as(ListUser.class);
		
		//get and verify total count and assert using jUnit assert
		System.out.println(ListUserResp.getTotal());
		assertEquals(ListUserResp.getTotal(), 12);   
		
		//get and verify Url and assert using jUnit assert
		System.out.println(ListUserResp.getSupport().getUrl());
		assertEquals(ListUserResp.getSupport().getUrl(), "https://reqres.in/#support-heading");   
		
		//get firstName
		System.out.println(ListUserResp.getData().get(1).getFirst_name());
		
		//get email_id by first_name and verify with given email_id
		int size = ListUserResp.getData().size();
		for(int i=0; i<size; i++) {
			if((ListUserResp.getData().get(i).getFirst_name()).equalsIgnoreCase("Michael")) {   //Michael, George
				String user_email=ListUserResp.getData().get(i).getEmail();
				System.out.println(user_email);
				assertEquals(user_email,"michael.lawson@reqres.in");  				  //michael.lawson@reqres.in ; george.edwards@reqres.in
				break;
			}
		}
		
		//Verify of all first name in present in the response 
		String[] names= {"Michael","Lindsay","Tobias","Byron","George","Rachel"};
		ArrayList<String> ExpNames=new ArrayList<String>(Arrays.asList(names));
		ArrayList<String> ActualNames=new ArrayList<String>();
		
		for(int i=0; i<size; i++) {
			ActualNames.add(ListUserResp.getData().get(i).getFirst_name());
		}
		System.out.println(ActualNames);
		assertTrue(ExpNames.equals(ActualNames));
		
	}

}
