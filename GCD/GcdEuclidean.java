package gcddemo;
import java.util.Scanner;
public class GcdEuclidean {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        System.out.println("GCD of "+a+" & "+b+" is "+findgcd(a,b));
    }    

    static int findgcd(int x, int y) {
        if(x==0){
             return y;   
        }
        return findgcd(y%x,x);
    }
}
