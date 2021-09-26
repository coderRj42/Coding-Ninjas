 import java.util.Scanner; 
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
  int num=0;
      int rev =0;
      Scanner s = new Scanner(System.in);
     
      num = s.nextInt();
   
      while( num != 0 )
      {
          rev = rev * 10;
          rev = rev + num%10;
          num = num/10;
      }

      System.out.println(rev);
	}
}
