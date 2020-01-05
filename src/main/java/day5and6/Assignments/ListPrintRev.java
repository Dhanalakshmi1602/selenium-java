package day5and6.Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPrintRev {
	
	 
	
	public static void main(String[] args)
	{
		List<String> company = new ArrayList<>();
		company.add("HCL");
		company.add("Aspire Systems");
		company.add("CTS");
		
		Collections.sort(company);
		Collections.reverse(company);
		System.out.println("Reverse output is : " );
		
		for (String eachcompany : company) 
		{
		System.out.println( eachcompany);	
		}
		
	}
	

}
