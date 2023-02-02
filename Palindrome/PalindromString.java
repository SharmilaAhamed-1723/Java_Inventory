package palindromdemo;
import java.util.Scanner;
class Palindromstr{
     static void palindrom(String original){
        String reversed="";
        int i=original.length()-1;
        while(i>=0){
           reversed+=original.charAt(i);
           i--;
        }
        if(original.equals(reversed)){
           System.out.println("The string "+original+" is a palindrom");
        }
        else{
           System.out.println("The string "+original+" is not a palindrom");
        }
    }
}
public class PalindromString {
    public static void main(String[] args){
        String string="";
        Palindromstr ps=new Palindromstr();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any string to be checked for palindrom: ");
        string=sc.nextLine();
        ps.palindrom(string);
    }
}
