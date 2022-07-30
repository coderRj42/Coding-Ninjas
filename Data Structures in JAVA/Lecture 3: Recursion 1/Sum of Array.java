 public class Solution {

	public static int sum(int input[]) {
		return sum(input, 0); 
	}
    
    static int sum(int a[], int SI){
        if(SI== a.length)
            return 0;
        int s = sum(a, SI+1);
        s+=a[SI];
        return s;
    }
    
}
