package fibonacciseries;
import java.util.Arrays;
import java.util.Scanner;
/*
When we write recursion in a formula that is called recurrence relation
Break the problem into smaller
The base cond is represented by the answers we already have
     F(0) & F(1) we already have a s a base function
*/
public class FibonacciUsingRecursion {
    static int fibonacci(int n){
        // ba se condition
      if(n<2){
          return n;
      }
      //this is not the tail recursion since it calls the another binacci and returns the sum this extra step is not the tail function
      return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int x=sc.nextInt();
        for(int i=0;i<=x;i++){
            System.out.print(fibonacci(i)+" ");          
        }
    }    
}
