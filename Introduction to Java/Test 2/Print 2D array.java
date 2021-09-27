public class solution {
	public static void print2DArray(int input[][]) {
		// Write your code here
int row=input.length;
        if(row==0){
            return;
        }
        int col=input[0].length;
        for(int i=0;i<row;i++){
            for(int l=i;l<row;l++){
                for(int j=0;j<col;j++)
                    System.out.print(input[i][j] + " ");
                 System.out.println();
        }
                  //  System.out.println();

        }
	}
}
