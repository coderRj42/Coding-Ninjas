import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n)
        {
            int space=1;
            while(space<=n-i)
            {
                System.out.print(" ");
                space++;
            }
            int j=1;
            int p=i;
            while(j<=i)
            {
                System.out.print(p);
                j++;
                p++;
            }
            j=1;
            p=(2*i-2);
            while(j<=i-1)
            {
                System.out.print(p);
                p--;
                j++;

            }
            System.out.println();
            i++;

        }
    }
}
