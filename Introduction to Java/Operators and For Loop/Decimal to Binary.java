  import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
	   // int n, count = 0, a;
	   // String x = "";
	   // Scanner s = new Scanner(System.in);
	   // n = s.nextInt();
	   // while(n > 0)
	   // {
	   // a = n % 2;
	   // if(a == 1)
	   // {
	   // count++;
	   // }
	   // x = a + "" + x;
	   // n = n / 2;
	   // }
//	   System.out.println(x);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long i=1,d=0,rem=0;
        while(n>0){
            rem=n%2;
            d+=rem*i;
            i=i*10;
            n=n/2;
        }
        System.out.println(d);
        
	}
}
