package PracticeProgramsCoreJava;

import java.math.BigDecimal;

public class EmailGenRandom {

	public static void main(String[] args) {
		String Username="abcd";
		String domain="@gmail.com";
		Double uniqueNo=(Math.random() * 1000000) ;
		//uniqueNo.longValue();   //for getting values with out decimal
	
		
		String email=Username+uniqueNo.longValue()+domain;
		
		System.out.println(email);

	}

}
