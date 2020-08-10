package OnlineTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			
	         while (sc.hasNextLine()) {
	        	 int totalUnits;
	        	 	 totalUnits=sc.nextInt();
	        	 	 if(totalUnits==0) {
	        	 		 break;
	        	 	 }
	        		 String units= sc.nextLine();
	        		 List<String> unitsList= new ArrayList<String>(Arrays.asList(units.split("\\s+")));
	        		 List<String> unitRels= new ArrayList<String>();
	        	 
	        	 
	        	 while(!sc.hasNextInt()) {	        		 
	        	        			
	        			unitRels.add(sc.nextLine());
	        		         		 
	        		 }
	        		
	        			unitRels.forEach(unitRel ->{
	        				System.out.println(unitRel);
	        			});
	        			 
	        		 }
	         sc.close();
	        	 }
	   
	}
	             



