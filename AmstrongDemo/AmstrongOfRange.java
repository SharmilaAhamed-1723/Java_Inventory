package amstrongnumber;
import java.util.Arrays;
import java.util.Scanner;
public class AmstrongOfRange {
    static boolean amstrongRange(int num){
        int temp=num;
        int sum=0;
        while(num>0){
            int r=num%10;// returns the remainder ie., last digit
            sum+=Math.pow(r, noOfDigits(temp));
            num=num/10;// returns the remaining digits of num
        }   
        return sum==temp;
            
    }
    static int noOfDigits(int n){
        int count = 0;
        while(n>0){
            n=n/10;
            count++;
        }
    return count;
    }
    public static void main(String[] args){
         for(int i=0; i<=2000; i++){
             if(amstrongRange(i)== true){
                 System.out.println(i);
             }
        }
    }    
}
