
public class Solution {
    
    public static int findTriplet(int[] arr, int x) {
    	//Your code goes here
          int ans=0;
        int n=arr.length;
          for(int i = 0 ; i<=n-1;i++ )
          {
             for(int j = i+1; j<= n-1;j++)
             { 
                 for(int k=j+1;k<=n-1;k++)
                 {
                 if(arr[i]+arr[j]+arr[k] == x)
                 	ans++;
                 }    
             }
          }
        return ans;
    }

}
