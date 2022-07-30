 
public class Solution {

    static int ans = -1;
	public static int lastIndex(int input[], int x) {
		return lastIndex(input, x, 0);	 
	}
    /*
    
    method 1
    // in this method we can compare in the starting also
    // but i saved myself from getting negative value when element is not present in the remaining
    // part expext first position
    // because i simply call recursively but not taking value which recursive function returns;
    
    public static int lastIndex(int input[], int x, int startIndex)
    {
        if(startIndex == input.length)
            return -1;
        if(input[startIndex] == x)
            ans = startIndex;
        lastIndex(input, x, startIndex+1);
        
        return ans;
    }
    */
    
    public static int lastIndex(int input[], int x, int startIndex)
    {
        if(startIndex == input.length)
            return -1;
         
 
        
        
        ans = lastIndex(input, x, startIndex+1);
        
        if(ans<0)
            if(x == input[startIndex])
                ans = startIndex;
        
        
        return ans;
    }
    
    
}





// I tried again

/*
public class Solution {
	static int l_index = -1;
	public static int lastIndex(int input[], int x) {
		 return lastIndex(input, 0, x);
	}
    
    static int lastIndex(int a[], int SI, int x){
        if(SI>= a.length)
            return -1;
        
        if(a[SI]==x)
        l_index = SI;
        lastIndex(a, SI+1, x);
        return l_index;
    }
}

*/
