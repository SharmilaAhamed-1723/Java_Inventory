/*
Find the missing first positive number 
Ignore the negatives and the number reater than n
*/
package sortingalgorithm;

public class MissingFristPositive {
    public static int missing1stpositivenumber(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]>0 && arr[i]<= arr.length && arr[i] != arr[correct]){
                swap(arr, i , correct);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if( arr[j] !=j+1){
                return j+1;
            }
        }        
        return arr.length+1;
    }
    static void swap(int[] arr, int a , int b){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]= temp;
    }
    public static void main(String[] args){
        int[] arr={5,3,-1,4,1};
        System.out.println(missing1stpositivenumber(arr));
    }    
}
