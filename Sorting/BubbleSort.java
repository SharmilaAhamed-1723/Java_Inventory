package sortingalgorithm;
/*      BUBBLE SORT
    It checks every two consecutive numbers.
    In every iteration of i it arranges the every largest number
*/
import java.util.Arrays;
public class BubbleSort {
    public static void BubbleSort(int[] arr){
          int temp;
          for(int i=0;i<arr.length;i++){
          // for each pass the largest element is sorted.  therefore j does not need to check the sorted numbers             
          // j < arr.length - i 
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
          }
    }
    public static void main(String[] args) {
        int arr[]={3,60,35,2,45,320,5};
        System.out.println("*********BUBBLE SORT**********");
        System.out.println();
        System.out.println("ARRAY BEFORE SORTING");
        System.out.println(Arrays.toString(arr));
        BubbleSort(arr);
        System.out.println();
        System.out.println("ARRAY AFTER SORTING");
        System.out.println(Arrays.toString(arr));
         
    }
    
}
