 import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {

		/*  Read input as specified in the question.
    		 * Print output as specified in the question.
    		 */
		Scanner s=new Scanner(System.in);
  int lines=s.nextInt();  
    int i,j;  
    for(i=1;i<=lines;i++){  
      for(j=1;j<=lines;j++){  
          if(i==j)  
             System.out.print("*");  
            else  
           System.out.print("0");  
      }  
      j--;  
       System.out.print("*");  
      while(j>=1){  
          if(i==j)  
           System.out.print("*");  
          else  
           System.out.print("0");  
          j--;  
      }  
    System.out.println("");  
  }  
	}	


}
