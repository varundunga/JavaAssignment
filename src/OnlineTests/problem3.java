package OnlineTests;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

public class problem3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> input= new ArrayList<Integer>();
        int line=0;
while(sc.hasNextInt()){
   
    int num=sc.nextInt();
    
    if(num==0 || line>=200) {
        break;
    }
    if(num<=4711)
    input.add(num); 
    
    line++;
}
sc.close();
input.forEach((n)->{
    if(n==1 || n==2) {
        System.out.println(n-1);    
    }
    else {
        System.out.println(gettests(2,n));  
    }
    
});

}
    

    public static Integer gettests(int devices, int amperes){
        //base case 1:
        //if amperes = 1 then no tests are required OR amperes = 1 then 2 test is required
        if(amperes==0 || amperes==1)
            return amperes;

        //base case 2:
        //if only one device is there then tests = amperes
        if(devices==1)
            return amperes;

        int minimumtests=Integer.MAX_VALUE, tempResult;
        //check testping from all the amperes 1 to amperes and pick the minimum among those.
        //for every test there are 2 scenarios - a) either device will explode b) device will not explode
        for (int i = 2; i <amperes ; i++) {
            //for the worst case pick the maximum among a) and b)
            tempResult = Math.max(gettests(devices-1,i-1), gettests(devices, amperes-i));
            minimumtests = Math.min(tempResult,minimumtests);
        }
        return minimumtests + 1;
    }
}