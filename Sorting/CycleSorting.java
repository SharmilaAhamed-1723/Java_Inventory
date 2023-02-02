package sortingalgorithm;
/*
Cycle Sort is used when the given numbers are from the range 1-N
*/
import java.util.Arrays;
public class CycleSorting {
   
    static void cycleSort(int[] arr){
        int i=0;
        while (i<arr.length){
            if(i != arr[i]-1){
               swap(arr, i , arr[i]-1);
            }
            else{
                i++;
            }
        }  
       
    }
    static void swap(int[] arr, int a , int b){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]= temp;
    }
    public static void main(String[] args){
        int[] arr={2,3,5,4,1};
        System.out.println("ARRAY BEFORE SORTING");
        System.out.println(Arrays.toString(arr));
        
        cycleSort(arr);
        System.out.println("ARRAY AFTER SORTING");
        System.out.println(Arrays.toString(arr));
        
    }
}
