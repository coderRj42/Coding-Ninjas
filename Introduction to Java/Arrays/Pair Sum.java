public class Solution {  

    public static int pairSum(int arr[], int x) {
    	//Your code goes here
        int ans=0;
        int n=arr.length;
          for(int i = 0 ; i<=n-1;i++ )
          {
             for(int j = i+1; j<= n-1;j++)
             { 
                 if(arr[i]+arr[j] == x)
                 	ans++;
             }
          }
        return ans;
    }
}
