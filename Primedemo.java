package primeornot;
import java.util.Scanner;
public class Primedemo {
    static boolean prime(int n){
        if (n<=1){
           return false;
        }
        int c = 2;
       
        while(c*c <= n){
            if(n % c == 0){
               return false;
            }
            c++;
        }
        return c*c > n;    
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print(" Enter a number: ");
        int n = sc.nextInt();
        boolean ans=prime(n);
        System.out.println(ans);
    }    
}
