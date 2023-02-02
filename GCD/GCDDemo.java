package gcddemo;
import java.util.Scanner;
public class GCDDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        int gcd=0;
        int x=(a>b)?b:a;
        for(int i=1;i<=x;i++){
            if(a%i==0 && b%i==0){
                gcd=i;              
            }
        }
        System.out.println("GCD of "+a+" & "+b+" is "+gcd);
    }
    
}
