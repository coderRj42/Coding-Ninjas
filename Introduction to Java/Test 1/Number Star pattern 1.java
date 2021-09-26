import java.util.Scanner;
public class runner {

	public static void main(String[] args) {
		// Write your code here
        Scanner s=new Scanner(System.in);
     int i,j,lines=s.nextInt();  
    for(i=1;i<=lines;i++){
        for(j=lines;j>=1;j--){  
           if(j!=i)  
            System.out.print(j);  
            else  
             System.out.print("*");  
    }   
    System.out.println("");  
    }  
	}
}
