package sortingalgorithm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MissingNumbersArrayusingCycleSort {
    public static int[] missingNumsArray(int[] arr){
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
         int[] ans=new int [arr.length];
         /*for(int index=0; index< arr.length; index++){
            if(arr[index]!= index+1){
                 ans[index]=index+1;
            }
        }
         */
         int index=0;
         while(index< arr.length){
            if(arr[index]!= index+1){
                 ans[index]=index+1;
            }
            index++;
         }
        return ans;
    }
    
    public static List<Integer> missingNumsArrasyList(int[] arr){
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
        List<Integer> ans= new ArrayList<>();
         for(int index=0; index< arr.length; index++){
            if(arr[index]!= index+1){
                 ans.add(index+1);
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
        int[] arr={4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("ARRAY BEFORE SORTING");
        System.out.println(Arrays.toString(arr));
        System.out.println("ARRAY AFTER SORTING USING ARRAY ");
        System.out.println(Arrays.toString(missingNumsArray(arr)));
        System.out.println("ARRAY AFTER SORTING USING ARRAYLIST");
        System.out.println(missingNumsArrasyList(arr));
        
    }  
}
