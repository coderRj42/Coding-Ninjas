import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
    int number, i, exponent;
		long power = 1;
	Scanner	s = new Scanner(System.in);
		
	
		number = s.nextInt();	
		
		exponent = s.nextInt();	
		
		for(i = 1; i <= exponent; i++)
		{
			power = power * number;
		}
		System.out.println(power);

    }
}
