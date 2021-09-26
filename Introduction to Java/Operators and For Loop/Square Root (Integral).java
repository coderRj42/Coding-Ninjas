 import java.util.Scanner;  
public class Main {
	   public static int floorSqrt(int x) 
    { 
        
        if (x == 0 || x == 1) 
            return x; 
  
       
        int i = 1, result = 1; 
          
        while (result <= x) { 
            i++; 
            result = i * i; 
        } 
        return i - 1; 
    } 
	public static void main(String[] args) {
		   Scanner s=new Scanner(System.in);
       int x=s.nextInt();
       System.out.println(floorSqrt(x));
        
	}
}
