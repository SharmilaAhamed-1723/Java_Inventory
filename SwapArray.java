package arraylistdemo;
import java.util.Scanner;
import java.util.Arrays;
public class SwapArray {
    static void swap(int a[],int x, int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));  
        swap(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }
}
