/*
Ceiling of a number : smallest of the numbers that is larger than/equal to  the target
*/
package binarysearch;
public class CeilingOfNumber {
    public static void main(String[] args){
        int[] arr={0 , 6 , 10 , 17 , 20 , 23 , 24 , 27 , 94};
        int target=95;
        int ans = ceilingofnum(arr, target);
        System.out.println(ans);
    }    

    static int ceilingofnum(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        // if the target is greater than the largest element of the array
        if(target>arr[arr.length-1]){
             return -1; 
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return arr[mid];
            else if(arr[mid]>target)
                end= mid -1;
            else
                start=mid+1;
        }
        //return start;
        return arr[start];
    }
}
