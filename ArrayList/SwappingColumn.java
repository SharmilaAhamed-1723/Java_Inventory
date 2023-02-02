package arraylistdemo;
import java.util.Scanner;
import java.util.Arrays;
public class SwappingColumn {
    static void swapColumn(int[][] a, int x, int y){
        for(int i=0;i<a.length;i++){
        int temp=a[i][x];
        a[i][x]=a[i][y];
        a[i][y]=temp;    
        }
    }       
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[][] arr=new int[a][b];
        System.out.print("Enter the elements to array: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int[] array:arr){
            System.out.println(Arrays.toString(array));
        }
        System.out.println();
        System.out.println("2D Array after swapping columns:");
        System.out.print("Enter the columns to be interchanged: ");
        int c=sc.nextInt();
        int d=sc.nextInt();
        swapColumn(arr,c,d);
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
