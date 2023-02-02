package binarysearch;
import java.util.Arrays;
public class FirstandLastPosofTarget {
    public static void main(String[] args){
        int[] arr={2,3,1,7,24,24,24,24,24,7,9,8};
        int target=24;
        //int[] result=searchRange(arr, target);
        //System.out.println(Arrays.toString(result));
        searchRange(arr,target);
    }    

    static int search(int[] arr, int target, boolean firstOccurrence) {
        // potential answer
        int ans=-1;
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            //potential answer found
            else{
                ans=mid;
                if(firstOccurrence){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }

    //static int[] searchRange(int[] arr, int target)
    static void searchRange(int[] arr, int target){
        int[] ans={-1, -1};
        ans[0]=search(arr, target, true);
        ans[1]=search(arr, target,false);
        //return ans;
        System.out.println(Arrays.toString(ans));
    }
}
