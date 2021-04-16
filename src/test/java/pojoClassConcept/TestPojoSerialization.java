package pojoClassConcept;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.*;

import KPMG.PojoClassConcept.Serialization.CreateOrders;
import KPMG.PojoClassConcept.Serialization.CreateOrdersResp;
import KPMG.PojoClassConcept.Serialization.PayoutDetails;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

public class TestPojoSerialization {
	
	
	CreateOrders co=new CreateOrders();
	Response resp;
	
	
	
	@Test
	public void createOrderKPMG() {
		
		co.setCorpId(17829);
		co.setCompanyId(18267);
		co.setProgramId(44623);
		co.setFromDate("2025-11-01");
		co.setToDate("2025-11-01");
		
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
		
		
		RestAssured.baseURI="https://sodexo-vn.preprod.zeta.in";
		
	    resp= given().log().all().header("Content-Type", "application/json").
									header("authorization", "Bearer dG9rZW5WYWx1ZUZvcktQTUdDb3JwUHVibGljQVBJ").
									headers("Host","sodexo-vn.preprod.zeta.in").
									header("Accept-Encoding", "gzip, deflate, br").
									header("Connection","keep-alive").
									body(co).
						when().post("sodexo/orders");

		
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
