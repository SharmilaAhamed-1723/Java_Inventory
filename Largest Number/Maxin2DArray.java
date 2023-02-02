package largestnumber;
public class Maxin2DArray {
    public static void main(String[] args){
        int[][] arr={
            {17,23,10},
            {0,94,20,7},
            {1,2,3,7,5,9},
        };
        //int ans=searchin2darray(arr,target);
        //System.out.println(ans);
        int ans=maxin2darray(arr);       
        System.out.println(ans);
     }

    static int maxin2darray(int[][] arr) {
        int max=arr[0][0];// int max=Integer.MIN_VALUE;
        //also with enhanced for loop
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }
        return max;
    }
}
