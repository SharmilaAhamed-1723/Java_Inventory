package sortingalgorithm;
import java.util.Arrays;
public class BubblesortWithSortedArray {
   static void BubbleSort(int[] arr){
          int temp;
          boolean swapped;
          for(int i=0;i<arr.length;i++){
              swapped = false;
          // for each pass the largest element is sorted.  therefore j does not need to check the sorted numbers             
          // j < arr.length - i 
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swapped = true;
                }
            }
            // if you didn't swap for a particular value of i, that means the array is sorted hence stop the program
            if(!swapped){
                break;
            }
          }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }    
}
