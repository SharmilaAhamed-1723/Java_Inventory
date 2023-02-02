/*
   When we don't whether the array is sorted inascending order or descending order
   in such case we go with modified binary search called OrderAgnostic Binary Search
   BS and OABS have the same time complexity
 */
package binarysearch;
public class OrderAgnosticBS {
    public static void main(String[] args ){
        int arr[]={0 , 6 , 10 , 17 , 20 , 23 , 24 , 27 , 94};
        int target= 17;
        int result = binarySearch(arr, target);
        System.out.println(result);};

    private static int binarySearch(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        // Find if the array is sorted in ascending order or descending order
        boolean isAscOrder=arr[start]<arr[end];
        /*boolean AscOrder;        
        if(arr[start]>arr[end]){
             AscOrder=true;
        }    
        else{
            AscOrder=false;
        }
        */
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAscOrder){
                if(target > arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(target > arr[mid])
                   end=mid-1;
                else
                    start=mid+1;
            }
        }
    return -1;
    }
}   

