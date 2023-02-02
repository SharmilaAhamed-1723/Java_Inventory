package largestnumber;
import java.util.Scanner;
public class LargestNodemo2 {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Number of elements: ");
    int n=sc.nextInt();
    System.out.print("Enter the elements of array: ");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
       arr[i]=sc.nextInt();
    }
    int max=0; // max=arr[0]
    for(int i=0;i<n;i++){
       if(arr[i]>max){
          max=arr[i];
       }
    }
    System.out.println("The largest number in the array is "+max);
   }    
}
