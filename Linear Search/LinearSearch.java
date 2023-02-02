package linearsearch;
import java.util.Scanner;
import java.util.Arrays;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[0];
        System.out.println("Length of array: "+arr.length);
        System.out.println("Enter the array elements: ");
        for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the target value: ");
        int target=sc.nextInt();
       // boolean ans=linearSearch1(arr, target);
        int ans=linearSearch1(arr,target);  
        System.out.println(ans);
    }
    /*static boolean linearSearch1(int[] a, int target) {
        if(a.length==0)
            return false;
        for(int i=0;i<a.length;i++){
            int element=a[i];
            if(element==target){
                return true;
            }  

        }
        return false;
    }
    */
    static int linearSearch1(int[] a, int target) {
        if(a.length==0)
            return Integer.MAX_VALUE; // i know -1 is not the index value but it may be the array elements so let's change it to Integer.MAX_VALUE
        for(int i=0;i<a.length;i++){
            int element=a[i];
            if(element==target){
                return element;// to return the lement replace with return element
            }  

        }
        return -1; 
    }
}


