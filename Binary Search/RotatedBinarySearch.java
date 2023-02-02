package binarysearch;
public class RotatedBinarySearch {
    public static void main(String[] args){
        int[] arr={3,4,5,6,8};
        //Pivot is the largest number in the array befor and after which the arrays are in ascending order
        int target= 6;
        int result= searchTarget(arr, target);
        System.out.println(result);
    }  
    static int searchTarget(int[] arr, int target){
         int pivot=findPivot(arr);
        /*
        If the following conditon is executed first the it will be a runtime error 
        that the pivot value is retrned -1 
        the array of index -1 is invalid         
         //if(arr[pivot]== target){
         //    return pivot;
         //}
        */
         if(pivot==-1){
             return binarySearch(arr,target,0,arr.length-1);
         }
         if(arr[pivot]== target){
             return pivot;
         }
         if(target>= arr[0]){
             return binarySearch(arr,target,0,pivot-1);
         }
         else{
             return binarySearch(arr,target,pivot + 1,arr.length-1);
         }
    //return -1;     
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid= start+ (end- start) / 2;
            if(target == arr[mid]){
                return mid;
            }
            else if (target> arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    
    
    static int findPivot(int[] arr) {
        int start=0; 
        int end= arr.length-1;
        while(start < end){
            int mid=start + (end - start) / 2;
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start < mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                     end = mid-1;
                }
            else{
                start = mid+1;
                }
            }
    // if no pivot value is found then the array is not rotated   
    return -1;    
    }
}
