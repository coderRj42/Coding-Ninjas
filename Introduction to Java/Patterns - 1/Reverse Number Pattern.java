import java.util.Scanner;
public class Solution {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int currRow = 1;
while(currRow <= n) {
int currCol = currRow;
while(currCol >= 1) {
System.out.print(currCol);
currCol -= 1;
}
System.out.println();
currRow += 1;
}
}
}
