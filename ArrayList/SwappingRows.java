package arraylistdemo;
import java.util.Scanner;
import java.util.Arrays;
public class SwappingRows {
    static void swapRow(int[][] a,int x,int y){
        /*int[] temp=a[x];
        a[x]=a[y];
        a[y]=temp;
        */
        for(int i=0;i<a.length;i++){
            int temp=a[x][i];// indicates the ith element in the x th row to be interchanged
            a[x][i]=a[y][i];
            a[y][i]=temp;// indicates the ith element in the y th row to be interchanged
        }
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
        for(int i=0;i<arr.length;i++){
          //for(int j=0;j<arr[i].length;j++){
                System.out.println(Arrays.toString(arr[i]));
        }
        swapRow(arr,2,1);
        System.out.println();
        System.out.println("2D Array after swapping rows:");
        for(int i=0;i<arr.length;i++){
          //for(int j=0;j<arr[i].length;j++){
                System.out.println(Arrays.toString(arr[i]));
        }
    }
}
