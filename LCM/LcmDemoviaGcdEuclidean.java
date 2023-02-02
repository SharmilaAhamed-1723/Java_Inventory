package lcmdemoviagcd;
import java.util.Scanner;
public class LcmDemoviaGcdEuclidean {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=sc.nextInt();
        System.out.print("Enter a number: ");
        int b=sc.nextInt();
        System.out.println();
        System.out.println(lcm(a,b));
    }

    static int lcm(int a, int b) {
        return (a/gcd(a,b)*b);    
    }

    static int gcd(int a, int b) {
        if(a==0){
            return b;
        }
        return gcd(b%a,a); 
    }
}