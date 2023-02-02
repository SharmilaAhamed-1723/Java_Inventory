package fibonacciseries;
import java.util.Scanner;
public class FibonacciDemo3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n=sc.nextInt();
        int n1=0;
        int n2=1;
        int count =2;
        while(count<=n){
           int temp=n2;
           n2=n1+n2;
           n1=temp;
           count++;
        }
        System.out.println(n2);
    }    
}
