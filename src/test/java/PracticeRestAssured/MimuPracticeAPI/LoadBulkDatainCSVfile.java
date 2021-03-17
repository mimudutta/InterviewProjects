package PracticeRestAssured.MimuPracticeAPI;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class LoadBulkDatainCSVfile {

	public static void main(String[] args) {
		
  		File file = new File(System.getProperty("user.dir")+"/test.csv"); 
	    try { 
	        // create FileWriter object with file as parameter 
	        FileWriter outputfile = new FileWriter(file); 
	  
	        // create CSVWriter object filewriter object as parameter 
	        CSVWriter writer = new CSVWriter(outputfile,CSVWriter.DEFAULT_SEPARATOR,
	        	    CSVWriter.NO_QUOTE_CHARACTER,
	        	    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
	        	    CSVWriter.RFC4180_LINE_END);
	  
	        // adding header to csv 
	        
	        List<String[]> data = new ArrayList<String[]>(); 
	        data.add(new String[] { "Name", "Email or Mobile", "emp code", "Amount" }); 
	        
	        int totalRecordCount = 4000;
	       
	        for(int i=1; i<totalRecordCount+1;i++) {
	        	data.add(new String[] { "Testphpp Mimu"+i, "mimu"+i+"@gmail.com", Integer.toString((Integer.parseInt("620")+i)) ,"1"}); 
	        }
	        writer.writeAll(data); 
	        // closing writer connection 
	        writer.close(); 
	        System.out.println("completed");
	    } 
	    catch (Exception e) { 
	        // TODO Auto-generated catch block 
	        e.printStackTrace(); 
	    } 

	}

}
