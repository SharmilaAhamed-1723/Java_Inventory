package lcmdemoviagcd;
import java.util.Scanner;
public class LcmviaMultiplesofNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=sc.nextInt();
        System.out.print("Enter a number: ");
        int b=sc.nextInt();
        System.out.println();
        int i;
        int x=(a>b)?a:b;
        for(i=x;i<a*b;i=i+x){
           if(i%a==0 && i%b==0){
              break;
           }
        }
        System.out.println("The LCM of "+a +" & "+ b +" is "+i);
    }    
}
