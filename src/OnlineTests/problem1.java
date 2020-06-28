package OnlineTests;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;


public class problem1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			
	         while (sc.hasNext()) {
	        	 int totalYears;
	        	 int postCards;
	        	 totalYears=sc.nextInt();
	        	 int[] distCityCount = new int[totalYears];
	        	 
	        	 for(int i=0;i<totalYears;i++) {
	        		 HashSet<String> city= new HashSet<String>();
	        		 postCards=sc.nextInt();
	        		 for(int j=0;j<postCards;j++) {
	        			 city.add(sc.next());
		        		 
	        		 }
	        		 distCityCount[i]=city.size();
	        		 if(i==(totalYears-1)) {
	        			 for(int k=0;k<distCityCount.length;k++) {
	        				 System.out.print(distCityCount[k] + "\n");
	        			 }
	        		 }
	        	 }
	         
	}
	         sc.close();      
	}

}
