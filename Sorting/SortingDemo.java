package sortingdemo;

import java.util.Arrays;
import java.util.Collections;

public class SortingDemo {
    public static void main(String[] args) {
          System.out.println("***ASCENDING ORDER***");
          System.out.println("***SORTING USING SORT() METHOD***");
          int[] arr=new int[]{12, 45, 1, -1, 0, 4, 56, 23, 89, -21, 56, 27};
          int[] arr1=new int[]{12, 45, 1, -1, 0, 4, 56, 23, 89, -21, 56, 27};
          Integer[] arr2={12, 45, 1, -1, 0, 4, 56, 23, 89, -21, 56, 27};
          // Sort function  
          Arrays.sort(arr);
          System.out.println(Arrays.toString(arr));
          System.out.println("***SORTING USING FOR LOOP***");
          for(int i=0;i<arr1.length;i++){
             for(int j=i+1;j<arr1.length;j++){
                 if(arr[i]>arr[j]){
                     int temp=arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;
                 }
             }
          }
          System.out.println(Arrays.toString(arr));
          System.out.println();
          System.out.println("***DESCENDING ORDER***");
          System.out.println("***SORTING USING REVERSEORDER() METHOD***");
          Arrays.sort(arr2,Collections.reverseOrder());
          System.out.println(Arrays.toString(arr2));
          System.out.println("***SORTING USING FOR LOOP***");
          for(int i=0;i<arr1.length;i++){
              for(int j=i+1;j<arr1.length;j++){
                  if(arr2[i]<arr2[j]){
                      int temp=arr2[j];
                      arr2[j]=arr[i];
                      arr2[i]=temp;
                  }
              }
          }
          System.out.println(Arrays.toString(arr2));
    }
    
}
