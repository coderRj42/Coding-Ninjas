import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
 int n, number, t, total = 0;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        number = n;

        for( ;number!=0;number /= 10)
        {
            t = number % 10;
            total = total + t*t*t;
        }

        if(total == n)
            System.out.println("true");
        else
            System.out.println("false");
	}
}
