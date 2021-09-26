import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here

		Scanner s = new Scanner(System.in);
		int N1 = s.nextInt();
		int N2 =4;
        int temp=1;
 

		for(int n = 1; n<=N1;)	
		{
			int value = 3*temp+2;
			if (value % N2 != 0)
			{
				System.out.print(value+" ");
                n++;
				//N1--;
			}
            temp++;
		}
	}
}
