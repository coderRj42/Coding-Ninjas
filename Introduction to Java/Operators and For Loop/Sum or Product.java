import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int choice = s.nextInt();
if(choice == 1) {
int sum = 0, num = 1;
while(num <= n) {
sum += num;
num++;
}
System.out.println(sum);
}
else if(choice == 2) {
int product = 1, num = 1;
while(num <= n) {
product *= num;
num++;
}
System.out.println(product);
}
else {
System.out.println("-1");
}
}
}
