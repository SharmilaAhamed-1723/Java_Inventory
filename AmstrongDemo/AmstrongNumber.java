package amstrongnumber;
import java.util.Scanner;
import java.lang.Math;
public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of. digits: ");
        int n=sc.nextInt();
        System.out.print("Enter the number to be checked for Amstrong: ");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(num>0){
            int r=num%10;// returns the remainder ie., last digit
            sum+=Math.pow(r, n);
            num=num/10;// returns the remaining digits of num
        }   
        if(sum==temp){
           System.out.println("The number "+temp+" is an Amstrong number");
        }
        else{
           System.out.println("The numebr "+temp+ " is not an Amstrong number");
        }
    }
    
}
