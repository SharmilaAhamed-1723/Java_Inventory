/*
Infinite array in the sense the size of array is not known that is we can't use the arr.length 
first we have to find the size of array thru chunks where our target presents
*/
package binarysearch;
public class SearchingThruInfiniteArray {
    static int rangeOfArray(int[] arr,int target){
        // start searching with array of size 2 then doubling the size
        int start=0;
        int end=1;
        //if target is greater than array[end] then it is also greater than array[start] too
        //if it is greater then the size of array need to be doubled
        //Doubling the size == end+(end - start +1) *2;
        while(target>arr[end]){
            int newStart= end+1;
            //end=end+(end-start+1)*2; shows arrayOutof bound exception
            //Here the start is not updated for that we need it to double the size 
            int newEnd=end+(end-start+1)*2;
            if(newEnd >arr.length-1){
                newEnd=arr.length-1;
            }
            end=newEnd;
            start = newStart;
            
            }
        return binarySearch(arr, target, start, end);
    }
      

    static int binarySearch(int[] arr, int target, int start,int end) {
           /*int start=0;
        int end=arr.length-1;
        no need to have this two lines coz we don't know the size of the array
        */
        while(start<=end){
            /*
            Finding middle index
            mid=(start + end ) / 2 in such case it might be possible to exceed the range of int in java
            in that case we may encounter error 
            */
            int mid=start+(end-start)/2;
            if(target < arr[mid]){
                end = mid-1;
            } 
            else if(target > arr[mid]){
                start=mid+1;
            }
            //answer found
            else{
                return mid;
            }
        }
        return -1;
   
    }
    public static void main(String[] args){
        int[] arr= {0 , 6 , 10 , 17 , 20 , 23 , 24 , 27 , 94,98, 99, 100, 101 , 103, 105, 108, 400};
        int target= 108;
        int ans=rangeOfArray(arr,target);
        System.out.println(ans);
    }  
}
