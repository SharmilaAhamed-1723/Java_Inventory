package linearsearch;
import java.util.Arrays;
public class Searchin2DArray {
    public static void main(String[] args){
        int[][] arr={
            {17,23,10},
            {0,94,20,7},
            {1,2,3,7,5,9},
        };
        int target=11;
        //int ans=searchin2darray(arr,target);
        //System.out.println(ans);
        int[] ans=searchin2darray(arr,target);       
        System.out.println(Arrays.toString(ans));
    } 
    //static int searchin2darray(int[][] arr,int target{
    static int[] searchin2darray(int[][] arr,int target){
        if(arr.length==0){
            //return -1
            return new int[]{-1,-1};
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    //return 1;
                    return new int[]{row,col};// returns the position of the target with the format of{row, column}
                } 
            }
        }
    //return -1;
    return new int[] {-1,-1};
    }
}
