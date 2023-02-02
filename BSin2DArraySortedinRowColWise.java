package binarysearch;
/*
The 2D Array is sorted in Row and Column wise
*/
import java.util.Arrays;
public class BSin2DArraySortedinRowColWise {
    static int[] BSin2DArray(int[][] arr,int target){
        int r=0;
        int c=arr[r].length-1;
        while(r<arr.length && c>=0){
            if(target == arr[r][c]){
                return new int[]{r,c};
            }
            if(target < arr[r][c]){
                 c--;
            }
            else{
                r++;
            }
        }
    return new int[] {-1,-1};
    }
    public static void main(String[] args){
        int[][] arr={
                    { 10, 20, 30, 40},
                    { 15, 25, 35, 45},
                    { 28, 29, 37, 49},
                    { 33, 34, 38, 50} 
                    };
        int target= 45;
        System.out.println(Arrays.toString(BSin2DArray(arr, target)));
    }    
}
