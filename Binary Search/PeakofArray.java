package binarysearch;
public class PeakofArray {
    //Bitonic array // mountain array which means the elements which increases and then decreses.
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,8,9,8,7,4,3,2,1};
        int ans=peakIndex(arr);
        System.out.println(ans);
    }

    static int peakIndex(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start < end){
            int mid= start+(end - start) / 2 ;
            if(arr[mid]>arr[mid+1]){
                //We are in the descending part of the array
                //that may be the answer, but look at left
                // that's why end!=mid-1
                end=mid;
            }
            else{
                // we are in the ascending part of the array
               start=mid+1;
            }
        }
        /*
        In the end start == end and pointing to the largest number because of the two checks
        start and end are always trying to find the max element in the two checks above
        hence when they are pointing to just one element that is the maximum one 
        */
         return arr[start];    
    //return start;
    }
}    
