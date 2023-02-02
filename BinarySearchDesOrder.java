/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binarysearch;

/**
 *
 * @author Sharmila Fathima
 */
public class BinarySearchDesOrder {
    public static void main(String[] args) {
        //Sorted array in ascending order
        int[] arr= {94, 27, 24, 23, 20, 17, 10, 6, 0};
        int target= 27;
        int result = binarySearch(arr, target);
        System.out.println(result);
    }

    static int binarySearch(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            /*
            Finding middle index
            mid=(start + end ) / 2 in such case it might be possible to exceed the range of int in java
            in that case we may encounter error 
            */
            int mid=start+(end-start)/2;
            if(target < arr[mid]){
                start=mid+1;
            } 
            else if(target > arr[mid]){
                end = mid-1;
            }
            //answer found
            else{
                return mid;
            }
        }
        return -1;
    }
    
}


