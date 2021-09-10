import java.util.Scanner;
public class Solution { public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    int start = s.nextInt();
    int end = s.nextInt();
    int step = s.nextInt(); 
    int currentFahrenhietValue = start;
    while(currentFahrenhietValue <= end)
    { int celsiusValue = (int)((5.0 / 9) * (currentFahrenhietValue - 32)); 
     System.out.println(currentFahrenhietValue +"\t" +celsiusValue); 
     currentFahrenhietValue += step; }
} 
                      }
