/*
Floor of a number : largest of the numbers that is smaller than / equal to  the target
*/
package binarysearch;
public class FloorofNumber {
    public static void main(String[] args){
        int[] arr={0 , 6 , 10 , 17 , 20 , 23 , 24 , 27 , 94};
        int target=-5;
        int ans = floorofnum(arr, target);
        System.out.println(ans);
    }    

    static int floorofnum(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        //if the target is lesser than the smallest of array
        if(target< arr[0])
            return -1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return arr[mid];
            else if(arr[mid]>target)
                end= mid -1;
            else
                start=mid+1;
        }
        //return end;
        return arr[end];
    }    
}
