import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
Scanner s=new Scanner(System.in);
        int bs=s.nextInt();
          char grade = s.next().charAt(0); 
     double allow,hra=.2*bs;
        double da=.5*bs;
        double pf=.11*bs;
     if(grade == 'A')
  {
   allow = 1700;
  }
  
  else if(grade == 'B')
  {
   allow = 1500;
   
  }
  else
  {
   allow = 1300;
   
  }
  
        double ts=bs+hra+da-pf+allow;
         System.out.println(Math.round(ts));



	}
}
