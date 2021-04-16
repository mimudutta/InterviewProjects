package pojoClassConcept;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import KPMG.PojoClassConcept.Serialization.CreateOrders;
import KPMG.PojoClassConcept.Serialization.CreateOrdersResp;
import KPMG.PojoClassConcept.Serialization.PayoutDetails;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class TestUsingSpecBuilder {
	
	CreateOrders co=new CreateOrders();
	Response resp;
	
	RequestSpecification reqSpec=new RequestSpecBuilder().setBaseUri("https://sodexo-vn.preprod.zeta.in").
									addHeader("Content-Type", "application/json").
									addHeader("authorization", "Bearer dG9rZW5WYWx1ZUZvcktQTUdDb3JwUHVibGljQVBJ").
									addHeader("Host","sodexo-vn.preprod.zeta.in").
									addHeader("Accept-Encoding", "gzip, deflate, br").
									addHeader("Connection","keep-alive").
									build();
	
	ResponseSpecification respSpec=new ResponseSpecBuilder().expectContentType("application/json;charset=UTF-8").
										expectStatusCode(200).
										expectHeader("Connection", "keep-alive")
										.build();
									
	
	@Test
	public void createOrderKPMG() {
		
		co.setCorpId(17829);
		co.setCompanyId(18267);
		co.setProgramId(44623);
		co.setFromDate("2025-11-03");
		co.setToDate("2025-11-04");
		
		List<PayoutDetails> accDetails=new ArrayList<>();    //create list to store Data array 
		
		PayoutDetails mimu=new PayoutDetails();   			//create beneficiery details
		mimu.setName("Mimu");
		mimu.setEmailOrPhone("mimukpmgtest1@mailinator.com");
		mimu.setAmount("1000");
		
		PayoutDetails pakhi=new PayoutDetails();
		pakhi.setName("Pakhi");
		pakhi.setEmailOrPhone("mimukpmgtest2@mailinator.com");
		pakhi.setAmount("2000");
		
		PayoutDetails avijit=new PayoutDetails();
		avijit.setName("Avijit");
		avijit.setEmailOrPhone("mimukpmgtest3@mailinator.com");
		avijit.setAmount("1000");
		
		accDetails.add(mimu);								//add beneficiery details to Data array
		accDetails.add(pakhi);
		accDetails.add(avijit);
		
		co.setPayoutDetails(accDetails);					//body parsing complete
		
		
		//RestAssured.baseURI="https://sodexo-vn.preprod.zeta.in";
		
		RequestSpecification req= given().log().all().spec(reqSpec).body(co);
						
		Response resp =req.when().post("sodexo/orders").then().log().all().spec(respSpec).extract().response();

		
	    CreateOrdersResp CreateOrdersResp=resp.as(CreateOrdersResp.class);
	    int payoutsize=CreateOrdersResp.getOrders().size();
	    
		
		for(int i=0; i<payoutsize; i++) {
			System.out.println("Order_ID:"+CreateOrdersResp.getOrders().get(i).getOrderId());
			CreateOrdersResp.getOrders().get(i).getOrderStatus();
			CreateOrdersResp.getOrders().get(i).getScheduledDate();
			for(int j=0; j<CreateOrdersResp.getOrders().get(i).getPayoutDetails().size(); j++) {
				//CreateOrdersResp.getOrders().get(i).getPayoutDetails().size();
				int pauoutID = CreateOrdersResp.getOrders().get(i).getPayoutDetails().get(j).getId();
				String name =CreateOrdersResp.getOrders().get(i).getPayoutDetails().get(j).getName();
				String userVector = CreateOrdersResp.getOrders().get(i).getPayoutDetails().get(j).getEmailOrPhone();
				int amount=CreateOrdersResp.getOrders().get(i).getPayoutDetails().get(j).getAmount();
				
				System.out.println("payoutID:"+pauoutID);
				System.out.println("name:"+name);
				System.out.println("userVector:"+userVector);
				System.out.println("amount:"+amount);
			}
		}
		//
	}
	
}
