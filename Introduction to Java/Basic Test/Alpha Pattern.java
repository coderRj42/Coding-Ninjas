 import java.util.Scanner;
public class Solution {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int Row = 1;
while(Row <= n) {
int Col = 1;
char ch = (char)('A' + Row - 1);
while(Col <= Row) {
System.out.print(ch);
Col += 1;
}
System.out.println();
Row += 1;
}
}
}
