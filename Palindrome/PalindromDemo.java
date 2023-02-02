package palindromdemo;
import java.util.Scanner;
class PalindromNumber {
    static void palindrom(int number){
        int temp=number;
        int sum=0;
        while(number>0){
           int r=number%10;
           sum=(sum*10)+r;
           number=number/10;
        }
        System.out.println("The reverse of the number "+temp+" is "+sum);
        if(sum==temp){
            System.out.println("The number "+temp+ " is a palindrom");
        }
        else{
           System.out.println("The number "+temp+ " is not a palindrom");
        }
    }

}
public class PalindromDemo{
    public static void main(String[] args) {
       PalindromNumber pn=new PalindromNumber();
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter any number: ");
       int n=sc.nextInt();
       pn.palindrom(n);
    }
    
}
