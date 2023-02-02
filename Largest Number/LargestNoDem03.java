package largestnumber;
import java.util.Scanner;
public class LargestNoDem03 {
   public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the no. of elements: ");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.print("Enter the numbers: ");
       for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
       }
       int maximum=0;
       for(int i=0,j=1;i<=n-1;i+=2){
          maximum=Math.max(maximum,Math.max(arr[i], arr[j]));
          j=j+2;
          if(j==n){
            break;
          }
       }
       System.out.println("The largest number is "+maximum);
   }
}