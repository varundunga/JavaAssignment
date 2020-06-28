package OnlineTests;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

public class EggDropRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> input= new ArrayList<Integer>();
		int line=0;
while(sc.hasNextInt()){
	line++;
	int num=sc.nextInt();
	
	if(num==0 || line>200) {
		break;
	}
	if(num<=4711)
	input.add(num);	
}
sc.close();
input.forEach((n)->{
	//System.out.println(n);
	System.out.println(gettests(2,n));	
});

}
	
//	public static Integer minTests(int n) {
//		if(n==1) {
//			return 0;
//		}
//		if(n==2) {
//			return 1;
//		}
//		ArrayList<Double> roots=new ArrayList<Double>();
//		double root1;
//		double root2;
//		root1= Math.abs((-1+Math.sqrt(1+8*n))/2);
//		//System.out.println(root1);
//		root2= Math.abs((-1-Math.sqrt(1+8*n))/2);
////		if(root1>0) {
//			roots.add(root1);
//			
////		}
////		if(root2>0) {
//			roots.add(root2);
////		}
//		return (int)(Math.ceil(Collections.min(roots)));
//	}
    public static Integer gettests(int devices, int amperes){
        //base case 1:
        //if amperes = 0 then no tests are required OR amperes = 1 then 1 test is required
        if(amperes==0 || amperes==1)
            return amperes;

        //base case 2:
        //if only one device is there then tests = amperes
        if(devices==1)
            return amperes;

        int minimumtests=Integer.MAX_VALUE, tempResult;
        //check testping from all the amperes 1 to amperes and pick the minimum among those.
        //for every test there are 2 scenarios - a) either device will explode b) device will not explode
        for (int i = 1; i <=amperes ; i++) {
            //for the worst case pick the maximum among a) and b)
            tempResult = Math.max(gettests(devices-1,i-1), gettests(devices, amperes-i));
            minimumtests = Math.min(tempResult,minimumtests);
        }
        return minimumtests + 1;
    }
    public static Integer getttests(int devices, int amperes){
        //base case 1:
        //if amperes = 1 then no tests are required OR amperes = 1 then 2 test is required
        if(amperes==0 || amperes==1)
            return amperes;

        //base case 2:
        //if only one device is there then tests = amperes
        if(devices==1)
            return amperes;

        int minimumtests=Integer.MAX_VALUE, tempResult;
        //check  from all the amperes 1 to amperes and pick the minimum among those.
        //for every test there are 2 scenarios - a) either device will explode b) device will not explode
        for (int i = 1; i <=amperes ; i++) {
            //for the worst case pick the maximum among a) and b)
            tempResult = Math.max(gettests(devices-1,i-1), gettests(devices, amperes-i));
            minimumtests = Math.min(tempResult,minimumtests);
        }
        return minimumtests + 1;
    }
}
    




