import java.util.Scanner;
public class Solution {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int currRow = 1;
while(currRow <= n) {
int currCol = 1;
while(currCol <= currRow) {
System.out.print(currRow);
currCol += 1;
}
System.out.println();
currRow += 1;
}
}
}
