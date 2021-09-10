import java.util.Scanner;
public class Solution {


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        /* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        int n=s.nextInt();
        int space,i;
        i=1;
        int val=1;
        while(i<=n){
            space =1;
            while(space<=n-i){ // < is changed to <= for correct space arrangments
                System.out.print(" ");
                space++;
            }
            int j=1;
            val = i; // added 
            while(j<=i){
                System.out.print(val);
                val++; // put inside this while loop they were outside
                j++;
            }
            System.out.println(); // put inside while loop 
            i++; // same case as above

        }


    }

}
