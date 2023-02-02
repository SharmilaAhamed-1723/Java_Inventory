package sortingalgorithm;
import java.util.Arrays;
public class InsertionSort {
    public static void insertion(int[] arr){
        // i<=arr.length-2
        for(int i=0; i<arr.length - 1;i++){
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }      
    } 
    static void swap(int[] arr, int a, int b) {
       int temp = arr[a];
       arr[a]=arr[b];
       arr[b]= temp;
    }
    public static void main(String[] args){
        int[] arr={10,17,23,7,11,9};
        System.out.println("ARRAY BEFORE SORTING");
        System.out.println(Arrays.toString(arr));
        insertion(arr);
        System.out.println("ARRAY AFTER SORTING");
        System.out.println(Arrays.toString(arr));
    }
}
