import java.util.*;
public class Solution {


	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int i,j;
   i=1;
        while(i<=n){
            j=1;
            while(j<=n-i){
            System.out.print(" ");
         j++;
        }
            j=1;
            while(j<=i){
                System.out.print(j);
j++;
            }
            System.out.println();
i++;
        }

		
	}

}
