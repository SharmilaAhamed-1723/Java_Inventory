package binarysearch;

public class RotationCount {
    static int countRotation(int[] arr){
       int pivot=findPivot(arr);
   return pivot+1;
       
    }
    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            
           
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr={0,1,3,5,12};
        int roatationcount=countRotation(arr); 
        System.out.println("The given array is rotated to the count : "+roatationcount);
        if(roatationcount==0){
           System.out.println("The array is not rotated");
        }
    }    
}
