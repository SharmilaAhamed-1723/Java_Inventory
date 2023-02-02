package lcmdemoviagcd;
import java.util.Scanner;
public class LcmviaGcdthruIf {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int a=sc.nextInt();
    System.out.print("Enter a number: ");
    int b=sc.nextInt();
    System.out.println();
    int gcd=1;
    int x=(a<b)?a:b;
    for(int i=1;i<=x;i++){
       if(a%i==0 && b%i==0){
          gcd=i;
       }
    }
    int lcm=(a*b)/gcd;
    System.out.println(lcm);
    }
}
