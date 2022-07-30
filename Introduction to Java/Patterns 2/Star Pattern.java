import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int currRow = 1;
        while(currRow <= n) {
            int spaces = 1;
            while(spaces <= (n - currRow)) {
                System.out.print(" ");
                spaces += 1;
            }
            int currCol = 1;
            while(currCol <= (2 * currRow) - 1) {
                System.out.print("*");
                currCol += 1;
            }
            System.out.println();
            currRow += 1;
        }
    }
}
