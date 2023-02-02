package largestnumber;
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a= sc.nextInt();
        System.out.print("Enter the second number:");
        int b= sc.nextInt();
        System.out.print("Enter the Third number:");
        int c= sc.nextInt();
        if(a>b){
           if(a>c){
              System.out.println("The number "+a+ " is the largest number");  
           }
        }
        else{
           if(b>c){
              System.out.println("The number "+b+" is the largest number");
           }
           else{
              System.out.println("The number "+c+" is the largest number");
           }
        }
    }
}
