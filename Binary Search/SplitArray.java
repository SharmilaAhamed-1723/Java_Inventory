/*
Given an array which consists of non- negative integers 
and an integer m, You can split the array into m non-empty continuous subarrays
An algorithm to minimize the largest sum among these m subarrays
*/
package binarysearch;
public class SplitArray {
    static int splitArray(int[] arr, int m){
        int start=0;
        int end=0;
        // The limit of the sum is that the min. splitArray to the max. splitArray
        //min. splitArray is the minimum no of subarrays ie., 1 in this case the largest sum is the sum of array
        //max. splitArray is the maximum no. of subarrays ie. n in this case the largest sum is the maximum of array
        for(int i=0;i<arr.length;i++){
            start= Math.max(start, arr[i]);
            end+=arr[i];
        }
        // Binary search
        while(start< end){
            // Try for the middle as the potential answer
            int mid= start+ (end - start) / 2;
            int sum=0;
            int pieces=1; // Initially it have single piece
            for(int num:arr){
                if((sum+num) > mid){
                    //if total is greater than the mid then we cannot add any number to this subarray 
                    // then we can add to a new subarray
                    sum=num; 
                    pieces++;
                }
                // Or else add to the same subarray
                else{
                    sum+=num;
                }
            }
            // After adding to the subarrays, we have to check for the condition if pieces == m
            if(pieces>m){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
    return start;// satrt and end are equal
    }
    public static void main(String[] args){
        int[] arr={7,2,5,10,8};
        int ans=splitArray(arr,2);
        System.out.println(ans);
    }    
}
