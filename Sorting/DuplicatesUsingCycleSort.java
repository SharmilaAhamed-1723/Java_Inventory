package sortingalgorithm;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesUsingCycleSort {
    //Single duplicate number
    public static int duplicateNumber(int[] arr){
            int i=0;
            
        while (i<arr.length){
            if(arr[i]!= i+1){
                int correct= arr[i]-1;
                if(arr[i] != arr[correct]){
                    swap(arr, i , correct);
                }
                else{
                    return arr[i];
                }
            }
            else{
                i++;
            }
        }
     return -1;  
    }
    // More than one duplicate number
    public static List<Integer> listOfDupicates(int[] arr){
        int i=0;
        while (i<arr.length){
             while (i<arr.length){
            int correct= arr[i]-1;
            if(arr[i] != arr[correct]){
               swap(arr, i , correct);
            }
            else{
                i++;
            }
        }
        }
//            if(arr[i]!= i+1){
//                int correct= arr[i]-1;
//                if(arr[i] != arr[correct]){
//                    swap(arr, i , correct);
//                }
//                else{
//                    return arr[i];
//                }
//            }
//            else{
//                i++;
//            }
//        }
        List<Integer> ans= new ArrayList<>();
         for(int index=0; index< arr.length; index++){
            if(arr[index]!= index+1){
                 ans.add(arr[index]);
            }
        }
     return ans;  
    }
     static void swap(int[] arr, int a , int b){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]= temp;
    }
    public static void main(String[] args){
        int[] arr={4, 3, 2, 5, 1, 3};
        int[] arr1={4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(duplicateNumber(arr));
        System.out.println(listOfDupicates(arr));
        System.out.println(listOfDupicates(arr1));
    }    
}
