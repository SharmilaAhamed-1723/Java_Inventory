/*
Finding missing number and the duplicate number in the array
*/
package sortingalgorithm;

import java.util.Arrays;

public class SetMismatch {
     static void swap(int[] arr, int a , int b){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]= temp;
    }
      public static int[] setmisMatchdup_missing(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct= arr[i]-1;
            if(arr[i] != arr[correct]){
               swap(arr, i , correct);
            }
            else{
                i++;
            }
        }
       
        for(int index=0; index< arr.length; index++){
            if(arr[index]!= index+1){
                 return new int[]{arr[index],index+1};
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args){
        int[] arr={5, 2, 1, 4, 2};
        System.out.println(Arrays.toString(setmisMatchdup_missing(arr)));
    }
}
