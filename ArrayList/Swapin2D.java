package arraylistdemo;
import java.util.Scanner;
import java.util.Arrays;
public class Swapin2D {
    static void swap(int[][] array, int i1, int j1, int i2, int j2) {
        int temp = array[i1][j1];
        array[i1][j1] = array[i2][j2];
        array[i2][j2] = temp;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        System.out.println("Length of array: "+arr.length);// returns the number of rows
        System.out.println("Enter the array elements: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        /*for(int i=0;i<arr.length;i++){
          //for(int j=0;j<arr[i].length;j++){
                System.out.println(Arrays.toString(arr[i]));
              //System.out.print(arr[i][j]);
        }
       */
        for(int[] a:arr){// Enhanced for loop
           System.out.println(Arrays.toString(a));
        }
        System.out.println();
        System.out.print("Enter the position of number 1(row,col): ");
        int c=sc.nextInt();
        int d=sc.nextInt();
        System.out.print("Enter the position of number 1(row,col): ");
        int e =sc.nextInt();
        int f=sc.nextInt();
        swap(arr,c,d,e,f);
        System.out.println("2D Array after swapping");
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        //System.out.println(Arrays.toString(arr[i]));
    }    
}
