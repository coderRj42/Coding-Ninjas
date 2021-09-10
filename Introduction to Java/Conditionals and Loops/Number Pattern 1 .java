import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s=new Scanner(System.in);
       int i,j,k,n=s.nextInt();
       for(i=1;i<=n;i++)
     {
 k=i;
         for(j=1;j<=i;j++,k++)
         {
             System.out.print(k);
         }
 
         System.out.println("");
     }
		
	}

}
