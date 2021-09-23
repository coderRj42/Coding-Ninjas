import java.util.Scanner;
public class Solution {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int currRow = 1;
while(currRow <= n) {
int currCol = 1;
while(currCol <= n) {
System.out.print(n);
currCol += 1;
}
System.out.println();
currRow += 1;
}
}
}
