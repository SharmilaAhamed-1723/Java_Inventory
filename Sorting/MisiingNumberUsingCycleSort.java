package sortingalgorithm;
public class MisiingNumberUsingCycleSort {
    public static int missingNo(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct = arr[i];
                if(arr[i]< arr.length && arr[i] != arr[correct]){
               swap(arr, i , correct);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(j!= arr[j]){
                return j;
            }
        }        
        return arr.length;
    }
    static void swap(int[] arr, int a , int b){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]= temp;
    }
    public static void main(String[] args){
        int[] arr={5,3,2,4,1};
        int ans = missingNo(arr);
        System.out.println(ans);
    }
}
