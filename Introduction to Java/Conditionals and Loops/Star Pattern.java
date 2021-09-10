import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
	Scanner s=new Scanner(System.in);
int n=s.nextInt();
    for (int i=1; i<=n; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
            { 
        for(int j=1;j<=n-i;j++){
                System.out.print(" "); //print space
            }  
            for (int k=1; k<=(2*i-1); k++ ) //inner loop for number of columns
            { 
                System.out.print("*"); //print star
            } 
//   for(int l=2;l<=i;l++){
//       System.out.println("*");

//   }
            System.out.println();
    }
	}

}
