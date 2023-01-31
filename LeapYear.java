package leapyear;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year to be checked for leap year: ");
        int year=sc.nextInt();
        if((year%400==0)|| (year%4==0) && (year%100!=0)){
            System.out.println("The year is a leap year");
        }
        else{
            System.out.println("The year is not a leap year");
        }
    }
    
}
