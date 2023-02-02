package binarysearch;
import java.util.Arrays;
public class BSin2DSortedArray {
    public static void main(String[] args){
          int[][] arr={
                    {  9, 11, 17, 23},
                    { 27, 30, 35, 37},
                    { 39, 40, 42, 43},
                    { 45, 46, 49, 50} 
                    };
          
          int target = 55;
          System.out.println(Arrays.toString(Search2D(arr, target)));
          //System.out.println(ans);
    }   
    static int[] Search2D(int[][] arr, int target ){
        int row = arr.length;
        int col = arr[0].length; // Be cautious that the array may be empty
        // if the array is single dimensional array
        // Do normal binary search
        if(row == 1){
            binarySearch(arr, target, 0, 0, col-1 );
        }
        int rStart = 0;
        int rEnd = row-1;
        int cMid= col / 2;
        // Run he loop till 2 rows remaining
        // If this loop istrue it will have more than two rows
        while(rStart < (rEnd - 1)){
            int mid = rStart + (rEnd - rStart) / 2 ;
            if(arr[mid][cMid]== target){
                return new int[]{mid , cMid };
            }
            if(arr[mid][cMid]< target){
                rStart = mid;
            }
            else{
                rEnd = mid;
            }
        }
        //Now the search space is reduced to two rows
        //check whether the target is in the columns of two rows
        if(arr[rStart][cMid]== target){
            return new int[]{rStart,cMid};
        }
        if(arr[rStart+1][cMid]== target){
            return new int[]{rStart+1,cMid};
        }
        //Search in first half
        if(target<= arr[rStart][cMid-1]){
            return binarySearch(arr, target, rStart,0 , cMid );
        }
        //Search in Second half
        if(target >= arr[rStart][cMid+1] && target<= arr[rStart][col-1]){
              return binarySearch(arr, target, rStart,cMid+1 , col-1 );
        }
        //search in third half
        if(target <= arr[rStart+1][cMid-1]){
            return binarySearch(arr, target, rStart+1,0 , cMid );
        }
        //Search in fourth half
        else{
            return binarySearch(arr, target, rStart+1, cMid+1 , col-1 );
        }
       
    } 

    static int[] binarySearch(int[][] arr, int target, int row, int cStart, int cEnd) {
        while(cStart <= cEnd){
            int Mid = cStart + (cEnd- cStart) / 2 ;
            if(arr[row][Mid]== target){
                return new int[]{row , Mid};
            }
            if(arr[row][Mid] < target){
                cStart = Mid+1;
            }
            else{
                cEnd= Mid-1;
            }
        }
    return new int[]{-1, -1};
    }
}
