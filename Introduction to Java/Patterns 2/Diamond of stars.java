import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int n=s.nextInt(); 
        for(int i=1;i<=n/2+1;i++)
        {
            for(int j=1;j<=n/2+1-i;j++)

            {
                System.out.print(" ");
            }

            for(int j=1;j<=i*2-1;j++)

            {
                System.out.print("*");
            }
            System.out.println();

        } 

        int n2=n/2;
        int k=1;
        while(k<=n2)
        {
            int space=1;
            while(space<=1)
            {
                System.out.print(" ");
                space++;
            }
            int j=1;
            while(j<=(2*(n2+1-k)-1))
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            k++;
        }
        //Write your code here

    }
}
