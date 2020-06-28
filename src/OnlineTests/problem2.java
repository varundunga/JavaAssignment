package OnlineTests;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int line=0;
		HashMap<Integer, String> output= new HashMap<Integer, String>();
while(sc.hasNext()){
	
	String seq=sc.next();
	if(seq.contains("END")) {
		break;
	}
	output.put(++line,isEven(seq));
	
}
sc.close();
output.forEach((lnum, status)->{
	System.out.println(lnum+"\t"+status);	
});

}
	
	public static String isEven(String seq) {
		
		if(!seq.contains("."))
			return "EVEN";
		String pattern=seq.substring(1,seq.indexOf("*",seq.indexOf("*")+1));
		if(!seq.substring(1,seq.length()-1).contains("*"))
			return "EVEN";
		if(pattern.length()==0 && seq.contains("."))
			return "NOT EVEN";
		StringBuilder sb = new StringBuilder(pattern);
		for(int b=0; b<sb.length();b++) {
			//System.out.println(sb.length());
			sb.insert(b, "\\");
			//System.out.println(sb.length());
			b++;
		}
		pattern=sb.toString();
		
		HashSet<String> hsSeq= new HashSet<String>(Arrays.asList(seq.split(pattern)));
		if(hsSeq.size()!=1)
			return "NOT EVEN";

		return "EVEN";
	}
}




