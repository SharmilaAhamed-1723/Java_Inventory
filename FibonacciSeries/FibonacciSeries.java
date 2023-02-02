package fibonacciseries;
import java.util.Scanner;
public class FibonacciSeries {
    static int n1=0;
    static int n2=1;// can be accessed without object
    public static void FibonacciDemo1(int n){
        if(n>=0){
           int n3=n1+n2;
           n1=n2;n2=n3;
           System.out.print(" "+n3);
           FibonacciDemo1(n-1);
        }        
    }
    public static void main(String[] args) {
       //FibonacciSeries fb=new FibonacciSeries();
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter any number: ");
       int count=sc.nextInt();
       System.out.print(n1+" "+n2);
       FibonacciDemo1(count-2);
    }
}
