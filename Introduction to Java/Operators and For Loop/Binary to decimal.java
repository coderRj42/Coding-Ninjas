import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int num = s.nextInt();
int decimal = 0, pow = 1;
while(num > 0) {
int last = num % 10;
decimal += last * pow;
pow *= 2;
num = num / 10;
}
System.out.println(decimal);
}
}


/// methord 2 
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
   Scanner input = new Scanner( System.in );
         String binaryString =input.nextLine();
       System.out.println(+Integer.parseInt(binaryString,2));
	}
}
