package perfectsquare;
import java.util.Scanner;
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        double root=Math.sqrt(n);
        if((root-Math.floor(root)==0)){
            System.out.println("The number "+n+" is a perfect square");
        }
        else{
            System.out.println("The number "+n+" is not a perfect square");
        }
    }
    
}
