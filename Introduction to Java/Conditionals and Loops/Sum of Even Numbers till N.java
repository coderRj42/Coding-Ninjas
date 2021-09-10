import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=2,sum=0;
    	while(i <=n)
	    			{
	    	sum = sum + i; 
	    				i = i + 2;
	    			}
	    			System.out.println(sum);
    }
}
