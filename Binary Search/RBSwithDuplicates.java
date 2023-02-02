package binarysearch;
public class RBSwithDuplicates {
    public static void main(String[] args){
        int[] arr={3,3,3,1,2,3};
        //Pivot is the largest number in the array befor and after which the arrays are in ascending order
        int target= 3;
        int result= searchTarget(arr, target);
        System.out.println(result);
        //int pivot= findPivot(arr);
        //System.out.println(pivot);
    }  
    static int searchTarget(int[] arr, int target){
         int pivot=findPivot(arr);
        /*
        If the following conditon is executed first the it will be a runtime error 
        that the pivot value is retrned -1 
        the array of index -1 is invalid 
        */
         //if(arr[pivot]== target){
         //    return pivot;
         //}
        
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
        while(start <= end){
            int mid=start + (end - start) / 2;
            // there are four cases over here 
            if(mid < end && arr[mid] >arr[mid+1]){
                  return mid;
            }
            if(mid >start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            
            if(arr[start]==arr[mid]&& arr[mid]==arr[end]){
                //suppose if start or end is the pivot
                if(arr[start]>  arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start]<arr[mid] ||(arr[start]==arr[mid] && arr[end]<arr[mid])){
                start=mid+1;
            }
            else{
                end=mid-1; 
            }
        }
        return -1;
    }
}
