public class Solution{  

    public static int findUnique(int[] arr){
		
    int c=0;

        int val=0;
for(int i=0;i<arr.length;i++)
    {
    c=0;
    for(int j=0;j<arr.length;j++)
    {
    if(arr[i]==(arr[j]) )
    {
        c++;
    }
    
    }
        if(c!=2)
         {
          // System.out.println(arr[i]);
            val = arr[i];
         }
    
            }
return val;  
    }
}
